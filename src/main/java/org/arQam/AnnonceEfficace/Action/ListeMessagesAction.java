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

import org.apache.struts2.ServletActionContext;
import org.arQam.AnnonceEfficace.Metier.MessagePrive;
import org.arQam.AnnonceEfficace.Metier.Utilisateur;
import org.arQam.AnnonceEfficace.Metier.Ville;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ListeMessagesAction extends ActionSupport {	
	ArrayList messages;
	 public List users;
	 public List usersEmetters;
    
    public String execute() throws Exception {
    	//System.out.println(ServletActionContext.getRequest().getSession().); 
    	users = (List)MessagePrive.listUsers();
    	 Map session = ActionContext.getContext().getSession();
         Utilisateur user = (Utilisateur) session.get("utilisateur");
         usersEmetters=MessagePrive.listMessages(user.getId());
         
		   
        return SUCCESS;       
    }

	public ArrayList getMessages() {
		return messages;
	}

	public void setMessages(ArrayList messages) {
		this.messages = messages;
	}    

}