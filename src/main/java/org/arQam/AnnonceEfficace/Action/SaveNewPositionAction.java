package org.arQam.AnnonceEfficace.Action;


import java.util.Calendar;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.arQam.AnnonceEfficace.HibernateUtil;
import org.arQam.AnnonceEfficace.Metier.MessagePrive;
import org.arQam.AnnonceEfficace.Metier.Notification;
import org.arQam.AnnonceEfficace.Metier.PositionGeographique;
import org.arQam.AnnonceEfficace.Metier.Suivi;
import org.arQam.AnnonceEfficace.Metier.Utilisateur;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
//import org.apache.commons.lang.StringEscapeUtils;

public class SaveNewPositionAction extends ActionSupport {	 		
	
	private Double posGeoLatitude;
	private Double posGeoLongitude;
	
	public String execute() throws Exception {
		//System.out.println(posGeoLatitude +"dddd");
        //System.out.println(posGeoLongitude);       
        Map session = ActionContext.getContext().getSession();
        Utilisateur user = (Utilisateur) session.get("utilisateur");
        if(user == null) return INPUT;
        // set new Position
        
        PositionGeographique posGeo = new PositionGeographique();
        posGeo.setLatitude(posGeoLatitude);
        posGeo.setLongitude(posGeoLongitude);
        posGeo.save();
        user.setPositionGeographique(posGeo);
        user.update();
        return SUCCESS;
	}

	public Double getPosGeoLatitude() {
		return posGeoLatitude;
	}

	public void setPosGeoLatitude(Double posGeoLatitude) {
		this.posGeoLatitude = posGeoLatitude;
	}

	public Double getPosGeoLongitude() {
		return posGeoLongitude;
	}

	public void setPosGeoLongitude(Double posGeoLongitude) {
		this.posGeoLongitude = posGeoLongitude;
	}
		
}

