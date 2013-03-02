package org.arQam.AnnonceEfficace.Action;

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
	
   
	public String execute() throws Exception {
	
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
}