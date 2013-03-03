package org.arQam.AnnonceEfficace.Action;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.arQam.AnnonceEfficace.Metier.Annonce;
import org.arQam.AnnonceEfficace.Metier.Objet;
import org.arQam.AnnonceEfficace.Metier.PositionGeographique;
import org.arQam.AnnonceEfficace.Metier.Produit;
import org.arQam.AnnonceEfficace.Metier.Utilisateur;
import org.arQam.AnnonceEfficace.Metier.Vitrine;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SaveProductAction extends ActionSupport {		
	public String nom;
	public String productimage;
	public float prix;
	public String vitre;
	 public List vitres;
	private String type; 
	 public List errorMessages;
	
	 public String input() throws Exception {
			return INPUT;
		}
	public String execute() throws Exception {
		if(nom == null || productimage == null||Float.toString(prix)==null||vitre.isEmpty()) // nouvelle saisie
		 	{vitres = (List)Vitrine.listVitres();
			return INPUT;	}	
		// validate();
		if(!isValid()) {System.out.print("e");return INPUT;}
	
		Produit pr = new Produit();
      pr.setNom(nom);
        pr.setPhoto(productimage);
        pr.setPrix(prix);
        // set current date
        pr.setVitrine(Vitrine.load(Vitrine.loadByName(vitre)));
        System.out.print(vitre);
        pr.save();
        return SUCCESS;
    }
	 public List getErrorMessages() {
			return errorMessages;
		}
		public void setErrorMessages(List errorMessages) {
			this.errorMessages = errorMessages;
		}
		public boolean isValid(){
			boolean errorExists= false;
			if(nom != null & productimage != null & Float.toString(prix)!=null & vitre!=null)
			{
			errorMessages = new ArrayList();
			if(nom.isEmpty() || productimage.isEmpty()||Float.toString(prix).isEmpty() ){ // champs vides{
				errorMessages.add("veuillez remplir tous les champs svp ");
				errorExists = true;
				System.out.print("a");
			}	
			if(nom.isEmpty()){
				errorMessages.add("Vous devez entrer un nom du produit");
				errorExists = true;
				System.out.print("b");
			}
			if(productimage.isEmpty()){
				errorMessages.add("Vous devez entrer une image");
				errorExists = true;
				System.out.print("c");
			}
			if(Float.toString(prix).isEmpty()){
				errorMessages.add("Vous devez entrer un prix");
				errorExists = true;
				System.out.print("d");
			}
			}	
			if(errorExists) return false;
			return true; 
			
		}
	}

