package org.arQam.AnnonceEfficace.Action;


import java.util.Calendar;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.arQam.AnnonceEfficace.HibernateUtil;
import org.arQam.AnnonceEfficace.Metier.EspaceProfessionnel;
import org.arQam.AnnonceEfficace.Metier.MessagePrive;
import org.arQam.AnnonceEfficace.Metier.ModeleAffichage;
import org.arQam.AnnonceEfficace.Metier.Notification;
import org.arQam.AnnonceEfficace.Metier.Suivi;
import org.arQam.AnnonceEfficace.Metier.Utilisateur;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
//import org.apache.commons.lang.StringEscapeUtils;

public class ChangeModeleAffichaeEspaceProfesionnelAction extends ActionSupport {	 	
	private long modeleId;
	
	public String execute() throws Exception {
		Suivi mp=new Suivi();
        Map session = ActionContext.getContext().getSession();
        Utilisateur user = (Utilisateur) session.get("utilisateur");
        // update espace pro.             
        EspaceProfessionnel espaceProfessionnel = EspaceProfessionnel.getUserEspaceProfessionnel(user.getId());        
        espaceProfessionnel.setModeleAffichage(ModeleAffichage.load(modeleId));
        espaceProfessionnel.update();
        // redirect to espace professionnel
        HttpServletResponse response = ServletActionContext.getResponse();                        
		response.sendRedirect("espaceProfessionnel");		
        return SUCCESS;
	}			

	public long getModeleId() {
		return modeleId;
	}

	public void setModeleId(long modeleId) {
		this.modeleId = modeleId;
	}		
	
}

