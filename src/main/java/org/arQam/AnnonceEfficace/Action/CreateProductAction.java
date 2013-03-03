package org.arQam.AnnonceEfficace.Action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.arQam.AnnonceEfficace.Metier.MessagePrive;
import org.arQam.AnnonceEfficace.Metier.Utilisateur;
import org.arQam.AnnonceEfficace.Metier.Vitrine;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CreateProductAction extends ActionSupport {	
	
	 public List vitres;
	
   
   public String execute() throws Exception {
   	//System.out.println(ServletActionContext.getRequest().getSession().); 
   	vitres = (List)Vitrine.listVitres();//listUsers();
   	 Map session = ActionContext.getContext().getSession();
        Utilisateur user = (Utilisateur) session.get("utilisateur");
        //usersEmetters=MessagePrive.listMessages(user.getId());
        
		   
       return SUCCESS;       
   }

  
}