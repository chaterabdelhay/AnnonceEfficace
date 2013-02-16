package org.arQam.AnnonceEfficace.Action;

import java.util.Calendar;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.arQam.AnnonceEfficace.Metier.Commentaire;
import org.arQam.AnnonceEfficace.Metier.MessagePrive;
import org.arQam.AnnonceEfficace.Metier.Utilisateur;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class EnvoiAction extends ActionSupport {	
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

private String contenuMessage;
    public int userId;
    //private String recepteur; // nom de l'utilisateur pour lequel il faut trouver l'id
    
    public String execute() throws Exception {
    	//int a=Utilisateur.load(userId);
    	/* 	MessagePrive mp = new MessagePrive();
		Calendar calendar = Calendar.getInstance();
        java.util.Date currentDate = calendar.getTime();        
        java.sql.Date date = new java.sql.Date(currentDate.getTime());
        mp.setDateenvoi(date);
        Map session = ActionContext.getContext().getSession();
        Utilisateur user = (Utilisateur) session.get("utilisateur");
        mp.setUtilisateur1(user); 
       // Utilisateur user1=Utilisateur.load(userId);
       // mp.setUtilisateur2(Utilisateur.load(userId));
        mp.setMessage(contenuMessage);
        
       System.out.println(contenuMessage);
       System.out.println("dezded");
      // System.out.println(contenuMessage);
	mp.save();*/
    	 System.out.println("zy");
        return SUCCESS;       
    }

	public String getContenuMessage() {
		return contenuMessage;
	}

	public void setContenuMessage(String contenuMessage) {
		this.contenuMessage = contenuMessage;
	}

	

}