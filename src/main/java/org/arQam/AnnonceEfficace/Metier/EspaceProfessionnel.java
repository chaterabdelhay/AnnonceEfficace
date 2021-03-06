package org.arQam.AnnonceEfficace.Metier;

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
@Table(name="espaceprofessionnel")
public class EspaceProfessionnel {
	@Id
    @GeneratedValue
	private int id;
	@Column
	private String nom;
	@Column
	private String logo;
	@Column
	private String description;	
	@ManyToOne
	@JoinColumn(name="utilisateurId")
	private Utilisateur utilisateur;
	@ManyToOne
	@JoinColumn(name="modeleAffichageId")
	private ModeleAffichage modeleAffichage;
	
	public EspaceProfessionnel() {

	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getLogo() {
		return logo;
	}



	public void setLogo(String logo) {
		this.logo = logo;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public ModeleAffichage getModeleAffichage() {
		return modeleAffichage;
	}

	public void setModeleAffichage(ModeleAffichage modeleAffichage) {
		this.modeleAffichage = modeleAffichage;
	}

	public static List list() {		
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        String hqlRequest = "from EspaceProfessionnel";        
        List resultList = session.createQuery(hqlRequest).list();        
        return resultList;
        
    }
	
	public static EspaceProfessionnel getUserEspaceProfessionnel(long utilisateurId) {
   	 	SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
     
        List result = session.createQuery("from EspaceProfessionnel WHERE utilisateurId = "+utilisateurId).list();
        if(result != null)
        	if(result.size() > 0)
       	 	return (EspaceProfessionnel) result.get(0);                        
		return null;
	}	
	
	public void save() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();    
		long id = (Integer) session.save(this);             
		session.getTransaction().commit();             
		session.close();     
	}
	
	public void update() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();    
		session.update(this);             
		session.getTransaction().commit();             
		session.close();     
	}

	public static EspaceProfessionnel load(long id) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		List result = session.createQuery("from EspaceProfessionnel WHERE id = "+id).list();
		if(result != null)
			return (EspaceProfessionnel) result.get(0);                        
		return null;		
	}

}

