package org.arQam.AnnonceEfficace.Metier;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
 
@Entity
@Table(name="categorie")
public class Categorie {
	@Id
	@GeneratedValue
	private int id;	
	@Column
	public String nom;	
	
	public Categorie(){
		
	}
	
	public Categorie(String nom){
		this.nom = nom;		
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
	
}
