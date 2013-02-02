package org.arQam.AnnonceEfficace.Action;

import java.sql.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.arQam.AnnonceEfficace.Metier.Commentaire;
import org.arQam.AnnonceEfficace.Metier.Evaluation;
import org.arQam.AnnonceEfficace.Metier.Utilisateur;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CommentAction extends ActionSupport {	
   	private int annonceId;   	
	private String contenuCommentaire;
	
    public String execute() throws Exception {
    	Map session = ActionContext.getContext().getSession();        
    	Utilisateur user = (Utilisateur) session.get("utilisateur") ;
    	Date date = new Date(100000);
    	//Commentaire commentaire= new Commentaire(date,contenuCommentaire,user.getId(),annonceId);
    	//commentaire.save();
    	return SUCCESS;    
    	
    }
	

}

