package org.arQam.AnnonceEfficace.Action;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.arQam.AnnonceEfficace.Metier.Annonce;
import org.arQam.AnnonceEfficace.Metier.Commentaire;
import org.arQam.AnnonceEfficace.Metier.Evaluation;
import org.arQam.AnnonceEfficace.Metier.Utilisateur;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CommentAction extends ActionSupport {	
   
   //	Commentaire commentaire;
	String contenu;
    
	public Integer annonceId;
	private Annonce annonce;
	

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public String execute() throws Exception {
    	
    		 
    			setAnnonce(Annonce.load(annonceId));
    			
    			
    		Commentaire commentaire = new Commentaire();
    		Calendar calendar = Calendar.getInstance();
            java.util.Date currentDate = calendar.getTime();        
            java.sql.Date date = new java.sql.Date(currentDate.getTime());
            commentaire.setDatePostulation(date);
            Map session = ActionContext.getContext().getSession();
            Utilisateur user = (Utilisateur) session.get("utilisateur");
            commentaire.setUtilisateur(user); 
            commentaire.setAnnonce(annonce);
            
            commentaire.setContenu(contenu);
    	
    	commentaire.save();
    		//a=commentaire.getContenu();
    	return SUCCESS; 
    	
    	
    }

	public int getAnnonceId() {
		return annonceId;
	}

	public void setAnnonceId(int annonceId) {
		this.annonceId = annonceId;
	}

	public Annonce getAnnonce() {
		return annonce;
	}

	public void setAnnonce(Annonce annonce) {
		this.annonce = annonce;
	}


	
	

}

