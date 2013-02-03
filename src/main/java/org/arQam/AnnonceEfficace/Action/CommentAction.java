package org.arQam.AnnonceEfficace.Action;

import java.sql.Date;
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
   	private int annonceId;   	
   //	Commentaire commentaire;
	String contenuCommentaire;
    

	

	public String getContenuCommentaire() {
		return contenuCommentaire;
	}

	public void setContenuCommentaire(String contenuCommentaire) {
		this.contenuCommentaire = contenuCommentaire;
	}

	public String execute() throws Exception {
    	if ((Utilisateur) ActionContext.getContext().getSession().get("utilisateur")==null)
    	{
    		return INPUT;
    	}
    	else
    	{
    	/*Date date = new Date(100000);
    	commentaire.setAnnonce(Annonce.load(3));
		
    	commentaire.setUtilisateur((Utilisateur) ActionContext.getContext().getSession().get("utilisateur"));
    	commentaire.setDatePostulation(date);
    	//Commentaire commentaire= new Commentaire(date,contenuCommentaire,user.getId(),annonceId);
    	commentaire.save();*/
    		//a=commentaire.getContenu();
    	return SUCCESS; 
    	}
    	
    }

	public int getAnnonceId() {
		return annonceId;
	}

	public void setAnnonceId(int annonceId) {
		this.annonceId = annonceId;
	}

	

	
	

}

