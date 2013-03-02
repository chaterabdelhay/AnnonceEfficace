package org.arQam.AnnonceEfficace.Metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.arQam.AnnonceEfficace.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

@Entity
@Table(name="espaceprofessionnel")
public class EspaceProfessionnel {
	@Id
    @GeneratedValue
	private int id;
	@Column
	private String nom;
	@Column
	private String logo;
	@Column
	private String description;
	
	@ManyToOne
	@JoinColumn(name="utilisateurId")
	private Utilisateur user;
	@ManyToOne
	@JoinColumn(name="modeleAffichageId")
	private ModeleAffichage ma;
	

	public EspaceProfessionnel() {

	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getLogo() {
		return logo;
	}



	public void setLogo(String logo) {
		this.logo = logo;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public Utilisateur getUser() {
		return user;
	}



	public void setUser(Utilisateur user) {
		this.user = user;
	}



	public ModeleAffichage getMa() {
		return ma;
	}



	public void setMa(ModeleAffichage ma) {
		this.ma = ma;
	}

	
	
	
	
}

