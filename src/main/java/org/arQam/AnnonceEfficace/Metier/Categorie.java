package org.arQam.AnnonceEfficace.Metier;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.arQam.AnnonceEfficace.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
 
@Entity
@Table(name="categorie")
public class Categorie {
	@Id
	@GeneratedValue
	private int id;	
	@Column
	public String nom;	
	
	public Categorie(){
		
	}
	
	public Categorie(String nom){
		this.nom = nom;		
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

	public static Categorie load(int id) {		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		List result = session.createQuery("from Categorie WHERE id = "+id).list();
		if(result != null)
			return (Categorie) result.get(0);                        		
		return null;
	}
	
}
