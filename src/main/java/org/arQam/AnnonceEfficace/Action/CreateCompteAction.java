package org.arQam.AnnonceEfficace.Action;

import java.util.Map;

import javax.persistence.Column;

import org.arQam.AnnonceEfficace.Metier.Utilisateur;
import org.arQam.AnnonceEfficace.Metier.Ville;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CreateCompteAction extends ActionSupport {	
	public Utilisateur user;
    public int villeId;
    
	public String execute() throws Exception {
		// System.out.println("utilisateur : " + user.ville.nom);
		// System.out.println("utilisateur : " + user.nomUtilisateur);		
        if (user.nomUtilisateur.isEmpty()||user.motDePasse.isEmpty()||user.email.isEmpty()||user.telephone.isEmpty())
        { 
    	    return INPUT;
        }
        else
        {
        	user.ville = Ville.load(villeId);        	
        	user.save();
    	    return SUCCESS;
        }        
    }

    public Utilisateur getUser() {
		return user;
	}

	public void setUser(Utilisateur user) {
		this.user = user;
	}

}