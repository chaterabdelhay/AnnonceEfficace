package org.arQam.AnnonceEfficace.Action;

import java.util.Map;

import org.arQam.AnnonceEfficace.Metier.Utilisateur;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class EspaceUtilisateurAction extends ActionSupport {
	 
	    
	    public String execute() throws Exception {
	       
	        	Map session = ActionContext.getContext().getSession();
	        	Utilisateur user = (Utilisateur) session.get("utilisateur");
	        	//session.put("userPositionGeographique",user.getUserPositionGeographique());	        	
	           
	        return SUCCESS;
	    }
	 
}
