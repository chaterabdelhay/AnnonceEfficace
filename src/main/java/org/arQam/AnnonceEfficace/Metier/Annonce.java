package org.arQam.AnnonceEfficace.Metier;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.arQam.AnnonceEfficace.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

@Entity
@Table(name="annonce")
public class Annonce {
	@Id
    @GeneratedValue
	private int id;
	@Column
	private String titre;
	@Column
	private String description;
	@Column
	private String type;
	@Column
	private Date datePostulation;
	@ManyToOne
	@JoinColumn(name="positionGeographiqueId")
	private PositionGeographique positionGeographique;
	@ManyToOne
	@JoinColumn(name="objetId")
	private Objet objet;
	@ManyToOne
	@JoinColumn(name="utilisateurId")
	private Utilisateur utilisateur;

	public Annonce() {

	}

	public Annonce(String titre, String description, String type,
			Date datePostulation) {
		this.titre = titre;
		this.description = description;
		this.type = type;
		this.datePostulation = datePostulation;		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Date getDatePostulation() {
		return datePostulation;
	}

	public void setDatePostulation(Date datePostulation) {
		this.datePostulation = datePostulation;
	}

	public PositionGeographique getPositionGeographique() {
		return positionGeographique;
	}

	public void setPositionGeographique(PositionGeographique positionGeographique) {
		this.positionGeographique = positionGeographique;
	}

	public Objet getObjet() {
		return objet;
	}

	public void setObjet(Objet objet) {
		this.objet = objet;
	}		

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	public static List list() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
     
        List result = session.createQuery("from Annonce").list();
        session.close();
        return result;
    }
	
	public static List listOrderByDistance(String type, double latitude, double longitude) {
		if(type == null || type.isEmpty() || type.equals("All")) type="%";
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        String hqlRequest = "Select a, sqrt(power(a.positionGeographique.latitude-"+latitude+",2) + " +
        				"power(a.positionGeographique.longitude-"+longitude+",2)) from Annonce a WHERE a.type LIKE'"+type+"' ORDER BY 2";
        
        List resultList = session.createQuery(hqlRequest).list();        
        return resultList;
        /*List annonces = new ArrayList();
        for (Object result : resultList) {        	
        	annonces.add(((Object[]) result)[0]);            
        }
        session.close();
        return annonces;*/
    }
	
	public static Annonce load(long id) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

		List result = session.createQuery("from Annonce WHERE id = "+id).list();
		if(result != null)
			return (Annonce) result.get(0);                        
		return null;		
	}

	public long save() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();    
		long id = (Integer) session.save(this);             
		session.getTransaction().commit();             
		session.close();
		return id;
	}

	public static List FourLastAnnonces() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
     
        List result = session.createQuery("from Annonce limit").setMaxResults(4).list();
        session.close();
        return result;
	}

	public Object[] getExtraInformations() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        String table = "";
        if(type.equals("E")){
        	table = "annonceevenement";
        }else if(type.equals("V")){
        	table = "annoncevente";
        }else if(type.equals("OE")){
        	table = "annonceoffreemploi";
        }
        else if(type.equals("OS")){
        	table = "annonceoffrestage";
        }
        Object[] result = (Object[]) session.createSQLQuery("SELECT * FROM "+table+" WHERE annonceId= :a")
					 			.setParameter("a", this.id)
					 			.list().get(0);
        System.out.println("dddd" + result[1]);
	    session.close();
		return result;
	}		
	
}
