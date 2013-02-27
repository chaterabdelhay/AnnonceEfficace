package org.arQam.AnnonceEfficace.Metier;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//import org.arQam.AnnonceEfficace.*;
import org.arQam.AnnonceEfficace.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
 
@Entity
@Table(name="suivi")
public class Suivi {
	/*@ManyToMany
	@JoinColumn(name="suiveurId")
	private Utilisateur utilisateur1;
	@ManyToMany
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
    }*/		
}
