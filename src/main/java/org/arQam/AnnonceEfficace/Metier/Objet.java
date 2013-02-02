package org.arQam.AnnonceEfficace.Metier;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
 
@Entity
@Table(name="objet")
public class Objet {
	@Id
	@GeneratedValue
	private int id;	
	@Column
	public String nom;
	@Column
	public String image;
	@Column
	public String description;
	@ManyToOne
	@JoinColumn(name="categorieId")
	public Categorie categorie;
	
	public Objet(){
		
	}
	
	public Objet(String nom, String image, String description, Categorie categorie){
		this.nom = nom;
		this.image = image;
		this.description = description;
		this.categorie = categorie;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}		

}
