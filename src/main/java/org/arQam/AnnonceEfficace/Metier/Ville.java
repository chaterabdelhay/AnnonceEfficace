package org.arQam.AnnonceEfficace.Metier;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;
 
@Entity
@Table(name="ville")
public class Ville {
	@Id	
	private int id;	
	@Column
	public String nom;
	@Column	
	public Integer positionGeographiqueId;
	
	public Ville(){
		
	}
	
	public Ville(String nom,Integer positionGeographiqueId){
		this.nom = nom;
		this.positionGeographiqueId = positionGeographiqueId;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
