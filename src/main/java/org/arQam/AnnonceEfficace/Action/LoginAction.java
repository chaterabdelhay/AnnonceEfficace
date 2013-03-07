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

import java.util.Map;

import org.arQam.AnnonceEfficace.Metier.Utilisateur;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {	
    private String username;
    private String password;
   
    public String execute() throws Exception {
    	System.out.println(getUsername());
        if (isInvalid(getUsername())) return INPUT;
        if (isInvalid(getPassword())) return INPUT;
        Utilisateur user = Utilisateur.exists(username,password);        
        if(user != null){
        	if(ActionContext.getContext() != null){
        		Map session = ActionContext.getContext().getSession();
        		session.put("utilisateur", user);   
        		session.put("id", user.getId()); 
        	}
        	//System.out.println(ActionContext.getContext().getSession().get("id"));
        	// mettre code pour tester si l'utilisateur existe !
            return SUCCESS;
        }        
        return INPUT;
    }

    private boolean isInvalid(String value) {
        return (value == null || value.length() == 0);
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }    

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}