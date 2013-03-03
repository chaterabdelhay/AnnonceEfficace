package org.arQam.AnnonceEfficace.Metier;

import java.sql.Date;
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
@Table(name="notification")
public class Notification {
	@Id	
	@GeneratedValue
	private long id;	
	@Column
	private Date date;
	@Column
	private String contenu;	
	@Column
	private String lien;
	
	public Notification(){
		
	}
	
	public Notification(Date date, String contenu, String lien){
		this.date = date;
		this.contenu = contenu;
		this.lien = lien;
	}
		
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}	
	
	
		
	public String getLien() {
		return lien;
	}

	public void setLien(String lien) {
		this.lien = lien;
	}
	
	public long save(long idAnnoncePosterUser) { /* idAnnoncePosterUser : l'id de celui qui a posté l'annonce*/
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();    
        long id = (Long) session.save(this);
        List resultSuivis =session.createSQLQuery("select suiveurId from suivi  where suivitId="+idAnnoncePosterUser).list();
        for (Object suiveurId : resultSuivis){        	
        	System.out.println("test...." + suiveurId);
        	session.createSQLQuery("insert into recevoirnotification (utilisateurId,notificationId) values("+suiveurId+","+id+")").executeUpdate();
        }
        session.getTransaction().commit();             
        session.close();
        return id;
    }

	public static List liste(long idUtilisateur) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();

        //List notifications = session.createQuery("from Notification Order by date DESC").list();
        List notifications = session.createSQLQuery("select n.* from Notification n, recevoirnotification rn WHERE n.id = rn.notificationId AND rn.utilisateurId = "+idUtilisateur+" Order by date DESC").list();
        session.close();
		return notifications;
	}
	
	public static Long count(long idUtilisateur) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
     
        List notifications = session.createQuery("Select count(*) from Notification").list();
        Object result = notifications.get(0);
        session.close();
		return (Long) result;
	}
			
}