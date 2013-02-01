package org.arQam.AnnonceEfficace.Metier;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
 
@Entity
@Table(name="positiongeographique")
public class PositionGeographique {
	@Id
	@GeneratedValue
	private int id;	
	@Column
	public double latitude;
	@Column
	public double longitude;
	
	public PositionGeographique(){
		
	}
	
	public PositionGeographique(double latitude, double longitude){
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
