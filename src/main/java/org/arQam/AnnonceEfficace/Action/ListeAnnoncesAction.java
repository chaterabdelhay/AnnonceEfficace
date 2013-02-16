/*
 * $Id: Login.java 739661 2009-02-01 00:06:00Z davenewton $
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.arQam.AnnonceEfficace.Action;

import java.util.List;
import java.util.Map;

import org.arQam.AnnonceEfficace.Metier.Annonce;
import org.arQam.AnnonceEfficace.Metier.PositionGeographique;
import org.arQam.AnnonceEfficace.Metier.Utilisateur;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ListeAnnoncesAction extends ActionSupport {	
    private List annonces;    
    private Double posGeoLatitude;
    private Double posGeoLongitude;    
    
    public String execute() throws Exception {
    	//setAnnonces(Annonce.list());
    	// set positionGeographique    	
    	Map session = ActionContext.getContext().getSession();
    	if(session.get("utilisateur") != null){
    		Utilisateur user = (Utilisateur) session.get("utilisateur");          
        	// get PositionGeographique
    		PositionGeographique positionGeographique = user.getUserPositionGeographique();
    		if(positionGeographique != null){
    			posGeoLatitude = positionGeographique.getLatitude();
            	posGeoLongitude = positionGeographique.getLongitude();
            	// set annonces
            	setAnnonces(Annonce.listOrderByDistance("%",posGeoLatitude,posGeoLongitude));
    		}        	
    	}    	
        return SUCCESS;       
    }

	public List getAnnonces() {
		return annonces;
	}

	public void setAnnonces(List annonces) {
		this.annonces = annonces;
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