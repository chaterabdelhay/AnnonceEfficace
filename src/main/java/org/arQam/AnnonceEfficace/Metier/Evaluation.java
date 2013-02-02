package org.arQam.AnnonceEfficace.Metier;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.arQam.AnnonceEfficace.HibernateUtil;;
 
@Entity
@Table(name="evaluation")
public class Evaluation {
	@Id
    @GeneratedValue
	private int id;
	@Column
	public int note;
	@ManyToOne
	@JoinColumn(name="annonceId")
	public Annonce annonce;
	@ManyToOne
	@JoinColumn(name="utilisateurId")
	public Utilisateur utilisateur;
	
	
	public Evaluation(){
		
	}
	
	public Evaluation(int note){
		this.note = note;				
	}
	
	public void save() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();    
        Integer id = (Integer) session.save(this);             
        session.getTransaction().commit();             
        session.close();     
    }
    
    static List list() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
     
        List employees = session.createQuery("from evaluation").list();
        session.close();
        return employees;
    }
    
    
    

	public Evaluation load(Long id) {
   	 SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
     
        List result = session.createQuery("from Evaluation WHERE id = "+id).list();
        if(result != null)
       	 	return (Evaluation) result.get(0);                        
		return null;
	}
    
    public void update() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
     
        session.beginTransaction();
     
        session.update(this); 
     
        session.getTransaction().commit();     
        session.close();
    }        
    
    public void delete() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
     
        session.beginTransaction();
     
        session.delete(this);
     
        session.getTransaction().commit();     
        session.close();
    }	
    public double avg() {
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        String avgHql = "Select avg(emp.note) FROM Evaluation emp";
        Query avgQuery = session.createQuery(avgHql);
       return (Double) avgQuery.list().get(0);
    }	   
	
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Annonce getAnnonce() {
		return annonce;
	}

	public void setAnnonce(Annonce annonce) {
		this.annonce = annonce;
	}
		
	public String toString(){
		return "Evaluation réalisé par l'utilisateur dont l'id est '"+ utilisateur.getId() +"'de l'annonce dont l'id est '" + annonce.getId() + "'"; 
	}
	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "utilisateur")
	public Set<Commentaire> getStockDailyRecords() {
		return this.commentaires;
	}*/

	
}
