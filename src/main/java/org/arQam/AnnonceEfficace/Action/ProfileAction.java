package org.arQam.AnnonceEfficace.Action;

import java.util.List;
import java.util.Map;

import org.arQam.AnnonceEfficace.HibernateUtil;
import org.arQam.AnnonceEfficace.Metier.Suivi;
import org.arQam.AnnonceEfficace.Metier.Utilisateur;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ProfileAction extends ActionSupport {	 
	public long suiviId;
	public List users;
	public List annonces;
	public List suivis;
	//private int remove = 0;
	
	public String execute() throws Exception {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		users = session.createQuery("from Utilisateur where Id="+suiviId).list();
		annonces=session.createQuery("from Annonce where utilisateurId="+suiviId).list();
		// session.beginTransaction();
		suivis=session.createSQLQuery("select * from suivi where suiveurId="+suiviId).list();
		System.out.println("select * from suivi where suiveurId="+suiviId);
		// session.getTransaction().commit();
		session.close();	        
		return SUCCESS;
	}
	
	
}


