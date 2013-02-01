package org.arQam.AnnonceEfficace.Metier;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.arQam.AnnonceEfficace.HibernateUtil;;
 
@Entity
@Table(name="utilisateur")
public class Utilisateur {
	@Id
    @GeneratedValue
	private long id;
	@Column
	public String nomUtilisateur;
	@Column
	public String motDePasse;
	@Column
	public String email;
	@Column
	public  String telephone;
	@Column(nullable=true)	
	public Integer villeId;
	
	public Utilisateur(){
		
	}
	
	public Utilisateur(String nomUtilisateur, String motDePasse, String email, String telephone, int villeId){
		this.nomUtilisateur = nomUtilisateur;
		this.motDePasse = motDePasse;
		this.email = email;
		this.telephone = telephone;
		this.villeId = villeId;
	}
	
	public void save() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();    
        Long id = (Long) session.save(this);             
        session.getTransaction().commit();             
        session.close();     
    }
    
    static List list() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
     
        List employees = session.createQuery("from utilisateur").list();
        session.close();
        return employees;
    }
    
    
    public static Utilisateur exists(String username, String password) {
      	 SessionFactory sf = HibernateUtil.getSessionFactory();
         Session session = sf.openSession();
         List result = session.createQuery("from Utilisateur WHERE nomUtilisateur = :a AND motDePasse = :b")
        		   		.setParameter("a", username)
        		   		.setParameter("b", password).list();
        if(result.size() > 0 ){        	        	
        	return  (Utilisateur) result.get(0);        	        	        
        }	       
        // n'existe pas 
   		return null;
   	}      
    
    public static Utilisateur exists(String username) {
     	 SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        List result = session.createQuery("from Utilisateur WHERE nomUtilisateur = :a")
       		   		.setParameter("a", username).list();
       if(result.size() > 0 ){        	       	
       	return  (Utilisateur) result.get(0);        	        	        
       }	
       System.out.println(result.size() );
       // n'existe pas 
  		return null;
  	}

	public Utilisateur load(int id) {
   	 SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
     
        List result = session.createQuery("from Utilisateur WHERE id = "+id).list();
        if(result != null)
       	 	return (Utilisateur) result.get(0);                        
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
	    
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomUtilisateur() {
		return nomUtilisateur;
	}
	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Integer getVilleId() {
		return villeId;
	}
	public void setVilleId(int villeId) {
		this.villeId = villeId;
	}	
		
	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "utilisateur")
	public Set<Commentaire> getStockDailyRecords() {
		return this.commentaires;
	}*/

	private void setInfos(Utilisateur user) {
	    	this.id = user.id;
	    	this.nomUtilisateur = user.nomUtilisateur;
			this.motDePasse = user.motDePasse;
			this.email = user.email;
			this.telephone = user.telephone;
			this.villeId = user.villeId;		
	  }
}
