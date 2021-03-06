package org.arQam.AnnonceEfficace.Action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.arQam.AnnonceEfficace.Metier.Annonce;
import org.arQam.AnnonceEfficace.Metier.Evaluation;
import org.arQam.AnnonceEfficace.Metier.Utilisateur;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class EvaluateAction extends ActionSupport {	
	
	public long annonceId;
	public float note;
	public double average;
	private Annonce annonce;
	
	public long getAnnonceId() {
		return annonceId;
	}

	public void setAnnonceId(long annonceId) {
		this.annonceId = annonceId;
	}

	public float getNote() {
		return note;
	}

	public void setNote(float note) {
		this.note = note;
	}

	public Annonce getAnnonce() {
		return annonce;
	}

	public void setAnnonce(Annonce annonce ) {
		this.annonce = annonce;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	
	
    public String execute() throws Exception {  
    	System.out.println("try1");
    	Evaluation ev=new Evaluation();
    	setAnnonce(Annonce.load(annonceId));
    	Map session = ActionContext.getContext().getSession();
        Utilisateur user = (Utilisateur) session.get("utilisateur");
        ev.setUtilisateur(user); 
        ev.setAnnonce(annonce);
        ev.setNote(note);    		 		
 		ev.save();
    	average=Evaluation.avg(annonceId);    	
		return SUCCESS;    		        
    }
    
	public double getAverage() {
		return average;
	}
	
	public void setAverage(float average) {
		this.average = average;
	}
	
	

}

