package org.arQam.AnnonceEfficace.Action;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
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
	public List control;
	//private int remove = 0;
	
	public String execute() throws Exception {
		SessionFactory sf = HibernateUtil.getSessionFactory();
	        Session session1 = sf.openSession();
	     
	        users = session1.createQuery("from Utilisateur where Id="+suiviId).list();
	        annonces=session1.createQuery("from Annonce where utilisateurId="+suiviId).list();
		// session.beginTransaction();
	      suivis=session1.createSQLQuery("select * from utilisateur,suivi  where suivi.suivitId=utilisateur.id and suiveurId="+suiviId).list();
	      Map session = ActionContext.getContext().getSession();
        Utilisateur user = (Utilisateur) session.get("utilisateur");
       // session1.close();
        
       // control=session2.createSQLQuery("select * from utilisateur").list();
	      control=session1.createSQLQuery("select suiveurId from suivi  where suiveurId="+user.getId()+" and suivitId="+suiviId).list();
	  //  System.out.println("select * from suivi  where suiveurId="+user.getId()+" and suivitId="+suiviId);
		// session.getTransaction().commit();
	     // session.getTransaction().commit();
	        session1.close();
	        
       return SUCCESS;
	}
	
	
}


