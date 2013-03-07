package org.arQam.AnnonceEfficace.Action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.arQam.AnnonceEfficace.Metier.EspaceProfessionnel;
import org.arQam.AnnonceEfficace.Metier.Produit;
import org.arQam.AnnonceEfficace.Metier.Utilisateur;
import org.arQam.AnnonceEfficace.Metier.Vitrine;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class EspaceProfesionnelAction extends ActionSupport {
	 	private EspaceProfessionnel espaceProfessionnel;
	 	private List vitrines;
	 	private List produits;	 		 	
	 	private Map<String,String> modeleAffichage = new HashMap<String,String>();
	    public String execute() throws Exception {	       
	        Map session = ActionContext.getContext().getSession();
	        Utilisateur user = (Utilisateur) session.get("utilisateur");
	        //session.put("userPositionGeographique",user.getUserPositionGeographique());	        	
	        espaceProfessionnel = EspaceProfessionnel.getUserEspaceProfessionnel(user.getId());
	        setVitrines(Vitrine.getEspaceProfessionnelVitrines(espaceProfessionnel.getId()));
	        setProduits(Produit.list());
	        String[] modeleAffichageValues = espaceProfessionnel.getModeleAffichage().getModele().split(";");	        
	        for(int i = 0; i < modeleAffichageValues.length; i++){
	        	System.out.println(modeleAffichageValues[i]);
	        	String[] splitedValue = modeleAffichageValues[i].split("=");	        		        
	        	modeleAffichage.put(splitedValue[0],splitedValue[1]);
	        }
	        
	        return SUCCESS;
	    }

		public EspaceProfessionnel getEspaceProfessionnel() {
			return espaceProfessionnel;
		}

		public void setEspaceProfessionnel(EspaceProfessionnel espaceProfessionnel) {
			this.espaceProfessionnel = espaceProfessionnel;
		}

		public List getVitrines() {
			return vitrines;
		}

		public void setVitrines(List vitrines) {
			this.vitrines = vitrines;
		}

		public List getProduits() {
			return produits;
		}

		public void setProduits(List produits) {
			this.produits = produits;
		}

		public Map<String,String> getModeleAffichage() {
			return modeleAffichage;
		}

		public void setModeleAffichage(Map<String,String> modeleAffichage) {
			this.modeleAffichage = modeleAffichage;
		}
	    	   	
		
}
