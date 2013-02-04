package org.arQam.AnnonceEfficace.Action;

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

public class DetailsAnnonceAction extends ActionSupport {	
   
	Evaluation ev=new Evaluation();
	public double average;
	public Integer annonceId;
	private Annonce annonce;
	private String typeAnnonce;

	private List commentaires;
	

	
	public String execute() throws Exception {				
		if(annonceId !=null) 
			setAnnonce(Annonce.load(annonceId));
		if(annonce != null){
			if(annonce.getType().equals("A")) setTypeAnnonce("Achat");					  
			if(annonce.getType().equals("V")) setTypeAnnonce("Vente");
			if(annonce.getType().equals("E")) setTypeAnnonce("Evenement");
			if(annonce.getType().equals("OE")) setTypeAnnonce("Offre d'emploi");
			if(annonce.getType().equals("OS")) setTypeAnnonce("Offre de stage");
		}
		
		  setCommentaires(Commentaire.listComments(annonceId));
		return SUCCESS;		
	}		
        	
	public Integer getAnnonceId() {
		return annonceId;
	}



	

	public List getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(List commentaires) {
		this.commentaires = commentaires;
	}

	public void setAnnonceId(Integer annonceId) {
		this.annonceId = annonceId;
	}



	public double getAverage() {
		return average;
	}
	public void setAverage(float average) {
		this.average = average;
	}
	public Evaluation getEv() {
		return ev;
	}
	public void setEv(Evaluation ev) {
		this.ev = ev;
	}

	public Annonce getAnnonce() {
		return annonce;
	}

	public void setAnnonce(Annonce annonce) {
		this.annonce = annonce;
	}

	public String getTypeAnnonce() {
		return typeAnnonce;
	}

	public void setTypeAnnonce(String typeAnnonce) {
		this.typeAnnonce = typeAnnonce;
	}

}


