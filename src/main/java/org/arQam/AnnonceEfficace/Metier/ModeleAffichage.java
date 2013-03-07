package org.arQam.AnnonceEfficace.Metier;

import java.sql.Date;
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
@Table(name="modeleaffichage")
public class ModeleAffichage {
	@Id    
	private int id;
	@Column
	private String modele;
	
	public ModeleAffichage() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public static List list() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
     
        List result = session.createQuery("from Annonce").list();
        session.close();
        return result;
    }
	
	public static ModeleAffichage load(long id) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		List result = session.createQuery("from ModeleAffichage WHERE id = " + id).list();		
		if(result != null)
			return (ModeleAffichage) result.get(0);                        
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

}

