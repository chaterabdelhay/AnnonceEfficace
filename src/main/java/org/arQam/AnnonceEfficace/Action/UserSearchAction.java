package org.arQam.AnnonceEfficace.Action;

import java.util.List;
import java.util.Map;

import org.arQam.AnnonceEfficace.HibernateUtil;
import org.arQam.AnnonceEfficace.Metier.Utilisateur;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserSearchAction extends ActionSupport {	 
	public String q;
	public List recherche;
	
	public String execute() throws Exception {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session1 = sf.openSession();
		
		recherche=session1.createQuery("from Utilisateur where nomUtilisateur like '%"+q+"%'").list();
		
		session1.close();
		return SUCCESS;
	}
	
	
}