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
@Table(name="messageprive")
public class MessagePrive {
	@Id
    @GeneratedValue
	private long id;
	@Column
	private String objet;
	@Column
	private String message;
	@Column
	private Date dateenvoi;
	@ManyToOne
	@JoinColumn(name="emetteurId")
	private Utilisateur utilisateur1;
	@ManyToOne
	@JoinColumn(name="recepteurId")
	private Utilisateur utilisateur2;	
	
	public MessagePrive(){
		
	}
	
	public MessagePrive(String obj,String mess,Date datePostulation){
		this.dateenvoi = datePostulation;
		this.message = mess;	
		this.objet = obj;
		
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	public String getObjet() {
		return objet;
	}

	public void setObjet(String objet) {
		this.objet = objet;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getDateenvoi() {
		return dateenvoi;
	}

	public void setDateenvoi(Date dateenvoi) {
		this.dateenvoi = dateenvoi;
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
	public  static List listUsers() {
		
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        String hqlRequest = "Select c.nomUtilisateur from Utilisateur c";
        
        List resultList = session.createQuery(hqlRequest).list();        
        return resultList;
        
    }
		
}
