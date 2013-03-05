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
@Table(name="vitrine")
public class Vitrine {
	@Id
    @GeneratedValue
	private int id;
	@Column
	private int maxSize;
	@Column
	private String nom;
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	@ManyToOne
	@JoinColumn(name="espaceprofessionnelId")
	private EspaceProfessionnel esp;
	

	public Vitrine() {

	}

	public Vitrine(int maxSize)
			{
		this.maxSize = maxSize;
		
			
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}

	public EspaceProfessionnel getEsp() {
		return esp;
	}

	public void setEsp(EspaceProfessionnel esp) {
		this.esp = esp;
	}
	public static List listVitres() {		
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        String hqlRequest = "Select c.nom from Vitrine c";        
        List resultList = session.createQuery(hqlRequest).list();        
        return resultList;
        
    }
	public static Vitrine load(int id) {
   	 	SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
     
        List result = session.createQuery("from Vitrine WHERE id = "+id).list();
        if(result != null)
       	 	return (Vitrine) result.get(0);                        
		return null;
	}
	public static int loadByName(String s) {
   	 	SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
     
        List result = session.createQuery("from Vitrine WHERE nom = :a")
    			.setParameter("a", s).list();
    			
        return  (int) ((Vitrine) result.get(0)).id;
                              
		
	}
	
    
}
	
	
