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
	private int id;	
	@Column
	private Date date;
	@Column
	private String contenu;	

	public Notification(){
		
	}
		
	public int getId() {
		return id;
	}

	public void setId(int id) {
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
		
	public static List liste(long idUtilisateur) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
     
        List notifications = session.createQuery("from Notification Order by date DESC").list();
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
