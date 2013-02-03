package org.arQam.AnnonceEfficace.Action;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;

import org.arQam.AnnonceEfficace.Metier.Annonce;
import org.arQam.AnnonceEfficace.Metier.Objet;
import org.arQam.AnnonceEfficace.Metier.PositionGeographique;
import org.arQam.AnnonceEfficace.Metier.Utilisateur;
import org.arQam.AnnonceEfficace.Metier.Ville;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class PublierAnnonceAction extends ActionSupport {		
	private String titre;
	private String description;
	private String type;    
    private String errorMessage;
    private Double posGeoLatitude;
    private Double posGeoLongitude;
    
	public String input() throws Exception {
		return INPUT;
	}
	public String execute() throws Exception {	
		if(titre == null || description == null || type== null) // nouvelle saisie
			return INPUT;
		System.out.println("titre" + titre);
		if(titre.isEmpty() || description.isEmpty() || type.isEmpty()){ // champs vides{
			errorMessage = "veuillez remplir tous les champs svp ";
			return INPUT;
		}	
		if(type.equals("-1")){
			errorMessage = "veuillez choisir le type de votre annonce";
			return INPUT;
		}			
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
        Map session = ActionContext.getContext().getSession();
        Utilisateur user = (Utilisateur) session.get("utilisateur");
        annonce.setUtilisateur(user);   
        // get PositionGeographique
        PositionGeographique positionGeographique = user.getUserPositionGeographique();
        if(posGeoLatitude != null && posGeoLongitude != null){
        	positionGeographique = new PositionGeographique(posGeoLatitude, posGeoLongitude);
        	positionGeographique.save();
        }        
        annonce.setPositionGeographique(positionGeographique);        
        annonce.setObjet(Objet.load(1));        
        annonce.save();        
             
        return SUCCESS;
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
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public double getPosGeoLatitude() {
		return posGeoLatitude;
	}
	public void setPosGeoLatitude(double posGeoLatitude) {
		this.posGeoLatitude = posGeoLatitude;
	}
	public double getPosGeoLongitude() {
		return posGeoLongitude;
	}
	public void setPosGeoLongitude(double posGeoLongitude) {
		this.posGeoLongitude = posGeoLongitude;
	}
	
	
}