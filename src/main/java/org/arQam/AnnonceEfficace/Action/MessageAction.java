package org.arQam.AnnonceEfficace.Action;


import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.arQam.AnnonceEfficace.Metier.MessagePrive;
import org.arQam.AnnonceEfficace.Metier.Utilisateur;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class MessageAction extends ActionSupport {	
    /**
	 * 
	 */
	public String userdestinataire;
	public String contenuMessage;
	public String objet;
	
	
	public String execute() throws Exception {
    	//int a=Utilisateur.load(userId);
    		MessagePrive mp = new MessagePrive();
		Calendar calendar = Calendar.getInstance();
        java.util.Date currentDate = calendar.getTime();        
        java.sql.Date date = new java.sql.Date(currentDate.getTime());
        mp.setDateenvoi(date);
        Map session = ActionContext.getContext().getSession();
        Utilisateur user = (Utilisateur) session.get("utilisateur");
        mp.setUtilisateur1(user); 
        mp.setObjet(objet);
        
       //Utilisateur user1=Utilisateur.load(userId);
       
       mp.setUtilisateur2(Utilisateur.load(Utilisateur.loadByName(userdestinataire)));
        mp.setMessage(contenuMessage);
        
        System.out.println(contenuMessage);
		System.out.println(Utilisateur.load(Utilisateur.loadByName(userdestinataire)));
      // System.out.println(contenuMessage);
	mp.save();
		
		
    	
		
		 return SUCCESS; 
		
    }

	
}
