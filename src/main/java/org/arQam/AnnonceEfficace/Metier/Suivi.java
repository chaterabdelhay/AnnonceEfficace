package org.arQam.AnnonceEfficace.Metier;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.arQam.AnnonceEfficace.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
 
@Entity
@Table(name="suivi")
public class Suivi {
	

	@OneToMany(mappedBy="utilisateur")
	@JoinColumn(name="suiveurId")
	private Utilisateur utilisateur1;
	@OneToMany(mappedBy="utilisateur")
	@JoinColumn(name="suivitId")
	private Utilisateur utilisateur2;	
	
	public Suivi(){
		
	}
	
	
	
	

	
	

	public Utilisateur getUtilisateur1() {
		return utilisateur1;
	}

	public void setUtilisateur1(Utilisateur utilisateur1) {
		this.utilisateur1 = utilisateur1;
	}

	public Utilisateur getUtilisateur2() {
		return utilisateur2;
	}

	public void setUtilisateur2(Utilisateur utilisateur2) {
		this.utilisateur2 = utilisateur2;
	}

	public void save() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();    
       long id = (Long) session.save(this);             
        session.getTransaction().commit();             
        session.close();     
    }
	/*public  static List listUsers() {
		
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        String hqlRequest = "Select c.nomUtilisateur from Utilisateur c";
        
        List resultList = session.createQuery(hqlRequest).list();        
        return resultList;
        
    }
public  static List listMessages(long a) {
		
	SessionFactory sf = HibernateUtil.getSessionFactory();
    Session session = sf.openSession();
    String hqlRequest = "Select c.objet,c.message,c.utilisateur1 from MessagePrive c  WHERE recepteurId= "+a;
    
    List resultList = session.createQuery(hqlRequest).list();        
    return resultList;
        
    }*/
		
}
