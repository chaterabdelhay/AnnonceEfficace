package org.arQam.AnnonceEfficace.Metier;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
 
@Entity
@Table(name="commentaire")
public class Commentaire {
	@Id
    @GeneratedValue
	private long id;
	@Column
	private Date datePostulation;
	@Column
	private String contenu;
	@ManyToOne
	@JoinColumn(name="utilisateurId")
	private Utilisateur utilisateur;
	@ManyToOne
	@JoinColumn(name="annonceId")
	private Annonce annonce;	
	
	public Commentaire(){
		
	}
	
	public Commentaire(Date datePostulation, String contenu){
		this.datePostulation = datePostulation;
		this.contenu = contenu;			
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Annonce getAnnonce() {
		return annonce;
	}

	public void setAnnonce(Annonce annonce) {
		this.annonce = annonce;
	}
		
}
