package org.arQam.AnnonceEfficace.Action;

import java.util.Map;

import javax.persistence.Column;

import org.arQam.AnnonceEfficace.Metier.Utilisateur;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CreateCompteAction extends ActionSupport {	
    public String username;
    public String password;
   
	public  String email;
	
	public String telephone;

	public Integer villeId;
	Utilisateur user;
    
    
	
//test
	public String execute() throws Exception {
       if (user.nomUtilisateur.isEmpty()||user.motDePasse.isEmpty()||user.email.isEmpty()||user.telephone.isEmpty())
       { 
    	   return INPUT;
       }
       else
       {
    	   user.save();
    	   return SUCCESS;
       }
        
    }

    public Utilisateur getUser() {
		return user;
	}

	public void setUser(Utilisateur user) {
		this.user = user;
	}

	private boolean isInvalid(String value) {
        return (value == null || value.length() == 0);
    }
    private boolean isInvalid(Integer value) {
        return (value.equals(null));
    }


    
    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Integer getVilleId() {
		return villeId;
	}
	public void setVilleId(Integer villeId) {
		this.villeId = villeId;
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