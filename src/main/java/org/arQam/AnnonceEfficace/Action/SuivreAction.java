package org.arQam.AnnonceEfficace.Action;


import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.arQam.AnnonceEfficace.Metier.MessagePrive;
import org.arQam.AnnonceEfficace.Metier.Suivi;
import org.arQam.AnnonceEfficace.Metier.Utilisateur;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SuivreAction extends ActionSupport {	
    /**
	 * 
	 */
	public int suiviId;
	
	
	public String execute() throws Exception {
		Suivi mp=new Suivi();
        Map session = ActionContext.getContext().getSession();
        Utilisateur user = (Utilisateur) session.get("utilisateur");
        mp.setUtilisateur1(user); 
       
        
       //Utilisateur user1=Utilisateur.load(userId);
       
       mp.setUtilisateur2(Utilisateur.load(suiviId));
       
      // System.out.println(contenuMessage);
	mp.save();
		
return SUCCESS;
	}
	
}

