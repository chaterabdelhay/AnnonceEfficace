package org.arQam.AnnonceEfficace.Action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.arQam.AnnonceEfficace.Metier.Evaluation;
import org.arQam.AnnonceEfficace.Metier.Utilisateur;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class EvaluateAction extends ActionSupport {	
   
	Evaluation ev;
	public double average;
    public String execute() throws Exception {
    	
    	if (ActionContext.getContext().getSession().get("id")!=null)
    	{
    		average=ev.avg();
    		ev.setNote(ev.getNote());
    		ev.setAnnonceId(ev.annonceId);
    		
  ev.setUtilisateurId((Long) ActionContext.getContext().getSession().get("id"));
    	ev.save();
    	
    	
    		return SUCCESS;
        }
        	
    	else
    	{
    		
    		
      return INPUT;  
    	}
    	
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

}

