package org.arQam.AnnonceEfficace.Action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.arQam.AnnonceEfficace.Metier.EspaceProfessionnel;
import org.arQam.AnnonceEfficace.Metier.Produit;
import org.arQam.AnnonceEfficace.Metier.Utilisateur;
import org.arQam.AnnonceEfficace.Metier.Vitrine;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class EspaceProfesionnelAction extends ActionSupport {
		private Integer espaceProId;
	
	 	private EspaceProfessionnel espaceProfessionnel;
	 	private List vitrines;
	 	private List produits;	 		 	
	 	private Map<String,String> modeleAffichage = new HashMap<String,String>();
	    public String execute() throws Exception {
	    	
	    	if(espaceProId != null){ /* si (id!= null) alors il s'agit de la consultation d'un espace professionnel*/
	    		espaceProfessionnel = EspaceProfessionnel.load(Long.valueOf(espaceProId));
		        setVitrines(Vitrine.getEspaceProfessionnelVitrines(espaceProfessionnel.getId()));
		        setProduits(Produit.list());
		        parseModeleAffichageToMap();		        
	    	}else{
	    		Map session = ActionContext.getContext().getSession();
		        Utilisateur user = (Utilisateur) session.get("utilisateur");
		        if(user == null) return INPUT;		      		       
		        //session.put("userPositionGeographique",user.getUserPositionGeographique());	        	
		        espaceProfessionnel = EspaceProfessionnel.getUserEspaceProfessionnel(user.getId());
		        if(espaceProfessionnel==null){
		        	//redirect to see the link
		            HttpServletResponse response = ServletActionContext.getResponse();
		    		response.sendRedirect("createEspaceProfessionnel");
		        }
		        setVitrines(Vitrine.getEspaceProfessionnelVitrines(espaceProfessionnel.getId()));
		        setProduits(Produit.list());
		        parseModeleAffichageToMap();   		    		    		    			        	
	    	}
	        return SUCCESS;
	    }

	    private void parseModeleAffichageToMap(){
	    	String[] modeleAffichageValues = espaceProfessionnel.getModeleAffichage().getModele().split(";");	        
	        for(int i = 0; i < modeleAffichageValues.length; i++){	        	
	        	String[] splitedValue = modeleAffichageValues[i].split("=");	        		        
	        	modeleAffichage.put(splitedValue[0],splitedValue[1]);
	        }	 
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

		public Integer getEspaceProId() {
			return espaceProId;
		}

		public void setEspaceProId(Integer espaceProId) {
			this.espaceProId = espaceProId;
		}
	    	   	
		
}
