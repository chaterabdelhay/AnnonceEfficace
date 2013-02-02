package org.arQam.AnnonceEfficace.Metier;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
 
@Entity
@Table(name="ville")
public class Ville {
	@Id	
	private int id;	
	@Column
	public String nom;
	@ManyToOne
	@JoinColumn(name="positionGeographiqueId")
	private PositionGeographique positionGeographique;

	public Ville(){
		
	}
	
	public Ville(String nom,Integer positionGeographiqueId){
		this.nom = nom;
		//this.positionGeographiqueId = positionGeographiqueId;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public PositionGeographique getPositionGeographique() {
		return positionGeographique;
	}

	public void setPositionGeographique(PositionGeographique positionGeographique) {
		this.positionGeographique = positionGeographique;
	}

}
