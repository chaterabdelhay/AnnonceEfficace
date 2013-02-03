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

public class DetailsAnnonceAction extends ActionSupport {	
   
	Evaluation ev=new Evaluation();
	public double average;
	Annonce a=new Annonce();
	int b;
    public String execute() throws Exception {
    	
    	if ((Utilisateur) ActionContext.getContext().getSession().get("utilisateur")!=null)
    		//average=ev.avg();
    	{
    	
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


