package org.arQam.AnnonceEfficace.Action;

import org.arQam.AnnonceEfficace.Metier.Utilisateur;

import com.opensymphony.xwork2.ActionSupport;


public class CreateAccountVerificationAction extends ActionSupport {	
	private String nomUtilisateur;
	private String message;    	
	private String couleur ="green";
	
	public String execute() throws Exception {
		Utilisateur user = Utilisateur.exists(nomUtilisateur);
		setMessage(getText("CreateAccount.Success.UserNameDisponible"));
		if(user!=null){
			setMessage(getText("CreateAccount.Error.UserNameIndisponible"));
			setCouleur("red");
		}               		
        return SUCCESS;
    }

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String m_message) {
		this.message = m_message;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

}