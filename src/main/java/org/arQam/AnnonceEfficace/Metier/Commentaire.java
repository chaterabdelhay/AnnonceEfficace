package org.arQam.AnnonceEfficace.Metier;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="commentaire")
public class Commentaire {
	@Id
    @GeneratedValue
	private int id;
	@Column
	private Date datePostulation;
	@Column
	private String contenu;
	@Column
	private int utilisateur_id;
	@Column
	private int annonce_id;	
	
	public Commentaire(){
		
	}
	
	public Commentaire(Date datePostulation, String contenu, int utilisateur_id, int annonce_id){
		this.datePostulation = datePostulation;
		this.contenu = contenu;
		this.utilisateur_id = utilisateur_id;
		this.annonce_id = annonce_id;		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDatePostulation() {
		return datePostulation;
	}

	public void setDatePostulation(Date datePostulation) {
		this.datePostulation = datePostulation;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public int getUtilisateur_id() {
		return utilisateur_id;
	}

	public void setUtilisateur_id(int utilisateur_id) {
		this.utilisateur_id = utilisateur_id;
	}

	public int getAnnonce_id() {
		return annonce_id;
	}

	public void setAnnonce_id(int annonce_id) {
		this.annonce_id = annonce_id;
	}	
		
}
