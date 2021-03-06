package org.arQam.AnnonceEfficace.Action;


import java.util.Calendar;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.arQam.AnnonceEfficace.HibernateUtil;
import org.arQam.AnnonceEfficace.Metier.MessagePrive;
import org.arQam.AnnonceEfficace.Metier.Notification;
import org.arQam.AnnonceEfficace.Metier.Suivi;
import org.arQam.AnnonceEfficace.Metier.Utilisateur;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
//import org.apache.commons.lang.StringEscapeUtils;

public class ReadNotificationAction extends ActionSupport {	 
	private int notificationId;	
	private String lien;
	
	public String execute() throws Exception {
		Suivi mp=new Suivi();
		if(ActionContext.getContext() == null) return INPUT;
        Map session = ActionContext.getContext().getSession();        
        Utilisateur user = (Utilisateur) session.get("utilisateur");
        if(user == null) return INPUT;
        // set notifcation as read
        long utilisateurId = user.getId();        
        setNotificationAsRead(notificationId, utilisateurId);               
        //refresh the number of new notifications        
        session.put("nbrOfNotifications", Notification.count(user.getId()));
        //redirect to see the link
        HttpServletResponse response = ServletActionContext.getResponse();
		response.sendRedirect(lien);        			
        return SUCCESS;
	}
	
	public void setNotificationAsRead(long notificationId, long utilisateurId){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();   		
		try{
			SQLQuery tempQuery = session.createSQLQuery("UPDATE recevoirNotification rn SET rn.read = 1  " +
														"WHERE utilisateurId = "+utilisateurId+" AND notificationId = "+notificationId+" ;");
			tempQuery.executeUpdate();
		}catch(Exception e){
			System.out.println("exception : " + e.getMessage());
		}		
		session.getTransaction().commit();             
		session.close();		
	}
	
	public void annulerSuivre(long suiveurId, long suivitId){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();   
		System.out.println("suivre request launched");
		try{
			//System.out.println("DELETE FROM suivi WHERE suiveurId = "+suiveurId+" AND suivitId = "+suivitId +";");
			SQLQuery tempQuery = session.createSQLQuery("DELETE FROM suivi WHERE suiveurId = "+suiveurId+" AND suivitId = "+suivitId +";");
			tempQuery.executeUpdate();
		}catch(Exception e){
			System.out.println("exception : " + e.getMessage());
		}		
		session.getTransaction().commit();             
		session.close();
	}	

	public int getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
	}

	public String getLien() {
		return lien;
	}

	public void setLien(String lien) {
		this.lien = lien;
	}		
	
}

