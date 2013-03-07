package org.arQam.AnnonceEfficace.Action;


import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.arQam.AnnonceEfficace.HibernateUtil;
import org.arQam.AnnonceEfficace.Metier.MessagePrive;
import org.arQam.AnnonceEfficace.Metier.Suivi;
import org.arQam.AnnonceEfficace.Metier.Utilisateur;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SuivreAction extends ActionSupport {	 
	private long suivitId;
	private int remove = 0;
	
	public String execute() throws Exception {
		Suivi mp=new Suivi();
		Utilisateur user = null;
		if(ActionContext.getContext() != null){
			Map session = ActionContext.getContext().getSession();
			user = (Utilisateur) session.get("utilisateur");
			long suiveurId = user.getId();        
        	if(remove==0){
        		suivre(suiveurId, suivitId);
        	}else{
        		annulerSuivre(suiveurId, suivitId);
        	}
		}
        return SUCCESS;
	}
	
	public void suivre(long suiveurId, long suivitId){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();   		
		try{
			SQLQuery tempQuery = session.createSQLQuery("INSERT INTO suivi (suiveurId, suivitId) VALUES ("+suiveurId+","+suivitId+");");
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
	
	public long getSuivitId() {
		return suivitId;
	}

	public void setSuivitId(long suivitId) {
		this.suivitId = suivitId;
	}

	public int isRemove() {
		return remove;
	}

	public void setRemove(int remove) {
		this.remove = remove;
	}
	
}

