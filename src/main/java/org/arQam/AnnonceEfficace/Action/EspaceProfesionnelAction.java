package org.arQam.AnnonceEfficace.Action;

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
	 	
	    public String execute() throws Exception {	       
	        Map session = ActionContext.getContext().getSession();
	        Utilisateur user = (Utilisateur) session.get("utilisateur");
	        //session.put("userPositionGeographique",user.getUserPositionGeographique());	        	
	        espaceProfessionnel = EspaceProfessionnel.getUserEspaceProfessionnel(user.getId());
	        setVitrines(Vitrine.getEspaceProfessionnelVitrines(espaceProfessionnel.getId()));
	        setProduits(Produit.list());
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
	    	   	
		
}
