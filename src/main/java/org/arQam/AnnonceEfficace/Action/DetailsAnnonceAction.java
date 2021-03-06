package org.arQam.AnnonceEfficace.Action;

import java.util.List;
import java.util.Map;

import org.arQam.AnnonceEfficace.Metier.Annonce;
import org.arQam.AnnonceEfficace.Metier.Commentaire;
import org.arQam.AnnonceEfficace.Metier.Evaluation;
import org.arQam.AnnonceEfficace.Metier.Utilisateur;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DetailsAnnonceAction extends ActionSupport {	
   
	Evaluation ev=new Evaluation();
	public String type;
	public double average;
	public Integer annonceId;
	private Annonce annonce;
	private String typeAnnonce;
	private List commentaires;
	public Boolean userConnected=false;	
	private Boolean evaluatedByUser = false;
	private Object[] annonceExtraInfos;
	
	public String execute() throws Exception {				
		if(annonceId !=null){
			setAnnonce(Annonce.load(annonceId));
			setAnnonceExtraInfos(annonce.getExtraInformations());		
			if(annonce.getType().equals("A")) setTypeAnnonce("Achat");					  
			if(annonce.getType().equals("V")) setTypeAnnonce("Vente");
			if(annonce.getType().equals("E")) setTypeAnnonce("Evenement");
			if(annonce.getType().equals("OE")) setTypeAnnonce("Offre d'emploi");
			if(annonce.getType().equals("OS")) setTypeAnnonce("Offre de stage");
		}
		
		Map session = ActionContext.getContext().getSession();
	
    	if(session.get("utilisateur") != null){
    		userConnected=true;
    		Utilisateur user = (Utilisateur) session.get("utilisateur");
    		Evaluation eval = Evaluation.load(annonceId, user.getId());
    		if(eval != null) setEvaluatedByUser(true);
    		System.out.println("Eval: " + evaluatedByUser + ", eval obj : " + eval);
    	}	
		average = Evaluation.avg(annonceId);
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

	public Boolean getEvaluatedByUser() {
		return evaluatedByUser;
	}

	public void setEvaluatedByUser(Boolean evaluatedByUser) {
		this.evaluatedByUser = evaluatedByUser;
	}

	public Object[] getAnnonceExtraInfos() {
		return annonceExtraInfos;
	}

	public void setAnnonceExtraInfos(Object[] annonceExtraInfos) {
		this.annonceExtraInfos = annonceExtraInfos;
	}

}


