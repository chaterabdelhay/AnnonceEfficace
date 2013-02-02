package org.arQam.AnnonceEfficace.Metier;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.arQam.AnnonceEfficace.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
 
@Entity
@Table(name="ville")
public class Ville {
	@Id	
	private int id;	
	@Column
	public String nom;
	@ManyToOne
	@JoinColumn(name="positionGeographiqueId")
	private PositionGeographique positionGeographique;

	public Ville(){
		
	}
	
	public Ville(String nom,Integer positionGeographiqueId){
		this.nom = nom;
		//this.positionGeographiqueId = positionGeographiqueId;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public PositionGeographique getPositionGeographique() {
		return positionGeographique;
	}

	public void setPositionGeographique(PositionGeographique positionGeographique) {
		this.positionGeographique = positionGeographique;
	}

	public static List select() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
     
        List villes = session.createQuery("from Ville Order by nom").list();
        session.close();
		return villes;
	}
	
	public String toString(){
		return this.nom;
	}
	
	public static Ville load(int id) {
	   	 SessionFactory sf = HibernateUtil.getSessionFactory();
	        Session session = sf.openSession();
	     
	        List result = session.createQuery("from Ville WHERE id = "+id).list();
	        if(result != null)
	       	 	return (Ville) result.get(0);                        
			return null;
	}
}
