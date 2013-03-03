package org.arQam.AnnonceEfficace;

import java.util.Calendar;
import java.util.Map;

import org.arQam.AnnonceEfficace.Metier.Notification;
import org.arQam.AnnonceEfficace.Metier.Objet;
import org.arQam.AnnonceEfficace.Metier.PositionGeographique;
import org.arQam.AnnonceEfficace.Metier.Utilisateur;

import com.opensymphony.xwork2.ActionContext;

public class TestSaveNotification {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Calendar calendar = Calendar.getInstance();
	        java.util.Date currentDate = calendar.getTime();        
	        java.sql.Date date = new java.sql.Date(currentDate.getTime());	        	        
	        Notification notification = new Notification();
	        notification.setDate(date);
	        notification.setContenu("L'utilisateur ");
	        notification.setLien("detailsAnnonce.action?annonceId=" + 12);
	        Long i = new Long(12);
	        notification.save(11);
	}

}
