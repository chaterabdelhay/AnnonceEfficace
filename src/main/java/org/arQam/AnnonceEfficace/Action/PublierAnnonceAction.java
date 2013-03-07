package org.arQam.AnnonceEfficace.Action;

import java.io.File;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.arQam.AnnonceEfficace.HibernateUtil;
import org.arQam.AnnonceEfficace.Metier.Annonce;
import org.arQam.AnnonceEfficace.Metier.Categorie;
import org.arQam.AnnonceEfficace.Metier.Notification;
import org.arQam.AnnonceEfficace.Metier.Objet;
import org.arQam.AnnonceEfficace.Metier.PositionGeographique;
import org.arQam.AnnonceEfficace.Metier.Utilisateur;
import org.arQam.AnnonceEfficace.Metier.Ville;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class PublierAnnonceAction extends ActionSupport implements ServletRequestAware {
	private HttpServletRequest servletRequest;
	// attributs annonce
	private String titre;
	private String description;
	private String type;    
    private List errorMessages;
    private Double posGeoLatitude;
    private Double posGeoLongitude;
    // attributs objet
    private int categorieObjet;
    private String nomObjet;
    private File imageObjet;
    public String imageObjetContentType; // filled automaticly
    public String imageObjetFileName;// filled automaticly
    private String descriptionObjet;
    
    // attributs complèmentaires      
    private Double prix;
    private Boolean negociable;
    private String typeEvenement;
    private Date dateEvenement;
    private Time heureEvenement;
    private String poste;
    private String competences;
    private String typeContrat;
    private Double salaire;
    private Integer duree;
    private Boolean remunere;
    private Double montantRemuneration;
    private Boolean preembauche;
    
    public String input() throws Exception {
		return INPUT;
	}
	public String execute() throws Exception {
		Map session = ActionContext.getContext().getSession();
        Utilisateur user = (Utilisateur) session.get("utilisateur");
        if(user == null) return "unAuthentified";
        
        
		if(type == null){
			HttpServletResponse response = ServletActionContext.getResponse();
			response.sendRedirect("selectAnnonceType");
		}
		
		if(titre == null || description == null) // nouvelle saisie
			return INPUT;		
		// validate();
		if(!isValid()) return INPUT;
		// upload the file
		try {
		    String filePath = servletRequest.getSession().getServletContext().getRealPath("/") + "\\uploadedImage\\objet";
		    System.out.println("Server path:" + filePath);
		    System.out.println("Image name:" + imageObjet.getPath());
		    File fileToCreate = new File(filePath, imageObjetFileName);            
		    FileUtils.copyFile(this.imageObjet, fileToCreate);
		    System.out.println("new file :" + fileToCreate.getPath());
		    System.out.println("new file :" + imageObjetFileName);
		} catch (Exception e) {
		    e.printStackTrace();
		    addActionError(e.getMessage()); 
		    return INPUT;
		}	
		// create objet
		Objet objet = new Objet();
		objet.setImage(imageObjetFileName);
		if(type.equals("V")){
			objet.setDescription(descriptionObjet);
			objet.setNom(nomObjet);
			objet.setCategorie(Categorie.load(categorieObjet));
		}
		objet.save();
		// create annonce
		Annonce annonce = new Annonce();
        annonce.setTitre(titre);
        annonce.setType(type);
        annonce.setDescription(description);
        // set current date
        Calendar calendar = Calendar.getInstance();
        java.util.Date currentDate = calendar.getTime();        
        java.sql.Date date = new java.sql.Date(currentDate.getTime());
        annonce.setDatePostulation(date);
        // set user, position and the object        
        annonce.setUtilisateur(user);   
        // get PositionGeographique
        PositionGeographique positionGeographique = user.getUserPositionGeographique();
        System.out.println("dd" + posGeoLatitude);
        System.out.println("d2" + posGeoLongitude);
        if(posGeoLatitude != null && posGeoLongitude != null){        	
        	positionGeographique = new PositionGeographique(posGeoLatitude, posGeoLongitude);
        	positionGeographique.save();
        }        
        annonce.setPositionGeographique(positionGeographique);        
        annonce.setObjet(objet);        
        long annonceId = annonce.save();
        
        // annonce infoscomplementairesSaving
        saveAnnonceInformationsComplementaires(annonceId);
        // notification's informations saving
        Notification notification = new Notification();
        notification.setDate(date);
        notification.setContenu("L'utilisateur '"+user.getNomUtilisateur()+"' a publié une nouvelle annonce '"+annonce.getTitre()+"'");
        notification.setLien("detailsAnnonce.action?annonceId=" + annonceId);
        notification.save(user.getId());
        return SUCCESS;
    }
	
	private void saveAnnonceInformationsComplementaires(long annonceId) {
		String requete = "";
		if(type.equals("V")){
			int localNegociable = (negociable)?1:0;
			requete = "INSERT INTO annoncevente VALUES ("+annonceId+","+prix+","+localNegociable+");";
			/*Objet objet = new Objet();
			objet.setNom(nomObjet);
			objet.setCategorie(categorieObjet);
			*/
		}		
		if(type.equals("E")){
			requete = "INSERT INTO annonceevenement VALUES ("+annonceId+",'"+typeEvenement+"','"+dateEvenement+"','"+heureEvenement+"');";
		}		
		if(type.equals("OE")){
			requete = "INSERT INTO annonceoffreemploi VALUES ("+annonceId+",'"+poste+"','"+competences+"','"+typeContrat+"',"+salaire+");";
		}
		if(type.equals("OS")){
			int localRemunere = (remunere)?1:0;
			int localPreembauche = (preembauche)?1:0;
			requete = "INSERT INTO annonceoffreemploi VALUES ("+annonceId+",'"+competences+"',"+duree+","+localRemunere+","+montantRemuneration+","+localPreembauche+");";
		}
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();   		
		try{
			SQLQuery tempQuery = session.createSQLQuery(requete);
			tempQuery.executeUpdate();
		}catch(Exception e){
			System.out.println("exception : " + e.getMessage());
		}		
		session.getTransaction().commit();             
		session.close();
	}
	
	public boolean isValid(){
		boolean errorExists= false;
		errorMessages = new ArrayList();
		if(titre.isEmpty() || description.isEmpty() || type.isEmpty()){ // champs vides{
			errorMessages.add("veuillez remplir tous les champs svp ");
			//System.out.println("111111");
			errorExists = true;
		}
		if(!errorExists){ /* It the error of empty inputs were detected we don't get in here */
			if(type.equals("V")){
				if(categorieObjet == -1 || nomObjet.isEmpty() || imageObjetFileName == null || descriptionObjet.isEmpty() || 
						prix == null){				
					errorMessages.add("veuillez remplir tous les champs svp V");
					//System.out.println("22222");
					errorExists = true;
				}
			}
			if(type.equals("E")){
				if(typeEvenement.isEmpty() || dateEvenement == null || heureEvenement == null){				
					errorMessages.add("veuillez remplir tous les champs svp E");
					errorExists = true;	
				}
			}
			if(type.equals("OE")){
				if(poste.isEmpty() || competences.isEmpty() || typeContrat.isEmpty() || salaire == null){				
					errorMessages.add("veuillez remplir tous les champs svp OE");
					errorExists = true;	
				}
			}
			
			if(type.equals("OS")){
				if(duree == null || competences.isEmpty() || montantRemuneration == null){				
					errorMessages.add("veuillez remplir tous les champs svp OS");
					errorExists = true;	
				}
			}
		}		
		/*
		if(titre.length() < 10){
			errorMessages.add("Votre titre doit être composé d'au moins 10 caractères ");
			errorExists = true;
		}
		if(description.length() < 40){
			errorMessages.add("Votre description doit être composée d'au moins 40 caractères ");
			errorExists = true;
		}*/			
		if(errorExists) return false;		
		return true; 
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}	
	public Double getPosGeoLatitude() {
		return posGeoLatitude;
	}
	public Double getPosGeoLongitude() {
		return posGeoLongitude;
	}
	public void setPosGeoLongitude(Double posGeoLongitude) {
		this.posGeoLongitude = posGeoLongitude;
	}

	public String getDescriptionObjet() {
		return descriptionObjet;
	}
	public void setDescriptionObjet(String descriptionObjet) {
		this.descriptionObjet = descriptionObjet;
	}
		
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public Boolean getNegociable() {
		return negociable;
	}
	public void setNegociable(Boolean negociable) {
		this.negociable = negociable;
	}
	public int getCategorieObjet() {
		return categorieObjet;
	}
	public void setCategorieObjet(int categorieObjet) {
		this.categorieObjet = categorieObjet;
	}
	public String getNomObjet() {
		return nomObjet;
	}
	public void setNomObjet(String nomObjet) {
		this.nomObjet = nomObjet;
	}
	public File getImageObjet() {
		return imageObjet;
	}
	public void setImageObjet(File imageObjet) {
		this.imageObjet = imageObjet;
	}
	public String getTypeEvenement() {
		return typeEvenement;
	}
	public void setTypeEvenement(String typeEvenement) {
		this.typeEvenement = typeEvenement;
	}	
		
	public Date getDateEvenement() {
		return dateEvenement;
	}
	public void setDateEvenement(Date dateEvenement) {
		this.dateEvenement = dateEvenement;
	}
	public Time getHeureEvenement() {
		return heureEvenement;
	}
	public void setHeureEvenement(Time heureEvenement) {
		this.heureEvenement = heureEvenement;
	}
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	public String getCompetences() {
		return competences;
	}
	public void setCompetences(String competences) {
		this.competences = competences;
	}
	public String getTypeContrat() {
		return typeContrat;
	}
	public void setTypeContrat(String typeContrat) {
		this.typeContrat = typeContrat;
	}
	public Double getSalaire() {
		return salaire;
	}
	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}
	public Integer getDuree() {
		return duree;
	}
	public void setDuree(Integer duree) {
		this.duree = duree;
	}
	public Double getMontantRemuneration() {
		return montantRemuneration;
	}
	public void setMontantRemuneration(Double montantRemuneration) {
		this.montantRemuneration = montantRemuneration;
	}
	public void setPosGeoLatitude(Double posGeoLatitude) {
		this.posGeoLatitude = posGeoLatitude;
	}
	
	public List getErrorMessages() {
		return errorMessages;
	}
	public void setErrorMessages(List errorMessages) {
		this.errorMessages = errorMessages;
	}
	public Boolean getPreembauche() {
		return preembauche;
	}
	public void setPreembauche(Boolean preembauche) {
		this.preembauche = preembauche;
	}
	public Boolean getRemunere() {
		return remunere;
	}
	
	public void setRemunere(Boolean remunere) {
		this.remunere = remunere;
	}
	
	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;			
	}	
	
}