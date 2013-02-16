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

import java.util.Calendar;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.arQam.AnnonceEfficace.Metier.Commentaire;
import org.arQam.AnnonceEfficace.Metier.MessagePrive;
import org.arQam.AnnonceEfficace.Metier.Utilisateur;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class EnvoyerMessageAction extends ActionSupport {	
    private String contenuMessage;
    public int userId;
   // private String recepteur; // nom de l'utilisateur pour lequel il faut trouver l'id
    
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