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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.arQam.AnnonceEfficace.Metier.Annonce;
import org.arQam.AnnonceEfficace.Metier.PositionGeographique;
import org.arQam.AnnonceEfficace.Metier.Utilisateur;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ListUsersAction extends ActionSupport {	    
	
	public List users;
	public List<Integer> followedUsers = new ArrayList<Integer>();    
    
    public String execute() throws Exception {
    	//setAnnonces(Annonce.list());
    	// set positionGeographique
    	Map session = ActionContext.getContext().getSession();
        Utilisateur user = (Utilisateur) session.get("utilisateur");
        if(user == null) return INPUT;
    	users=Utilisateur.list();
    	List listOfFollowedUsers = user.listOfFollowedUsers();
    	for(Object u : listOfFollowedUsers) {
    		Object[] tab = (Object[]) u;
    		//System.out.println((Integer)tab[0]);
    		followedUsers.add((Integer)tab[0]);
    	}
        return SUCCESS;       
    }
    
    public boolean isFollowed(int userId){
    	System.out.println(userId);
    	for(Integer followedUsedId : followedUsers) {
    		if(userId == followedUsedId) return true;    		
    	}
    	return false;
    }

}