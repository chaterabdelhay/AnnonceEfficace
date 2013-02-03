package org.arQam.AnnonceEfficace.Action;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;

import org.arQam.AnnonceEfficace.Metier.Annonce;
import org.arQam.AnnonceEfficace.Metier.Objet;
import org.arQam.AnnonceEfficace.Metier.PositionGeographique;
import org.arQam.AnnonceEfficace.Metier.Utilisateur;
import org.arQam.AnnonceEfficace.Metier.Ville;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class OperationReussieAction extends ActionSupport {		

	private String operation;    

	public String execute() throws Exception {    	
		return SUCCESS;       
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}	

}