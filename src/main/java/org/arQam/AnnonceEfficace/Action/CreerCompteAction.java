package org.arQam.AnnonceEfficace.Action;

import java.util.List;
import java.util.Map;

import javax.persistence.Column;

import org.arQam.AnnonceEfficace.Metier.Utilisateur;
import org.arQam.AnnonceEfficace.Metier.Ville;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CreerCompteAction extends ActionSupport {	
    public List villes;    
    
	
//test
	public String execute() throws Exception {
		villes = Ville.select();
		return SUCCESS;        
    }  
}