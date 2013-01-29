package org.arQam.AnnonceEfficace.Metier;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;
@Entity
@Table(name="annonce")
public class Annonce {
	@Id
    @GeneratedValue
	private int id;
	@Column
	private String titre;
	@Column
	private String description;
	@Column
	private String type;
	@Column
	private Date datePostulation;
	@Column
	private int positionGeographiqueId;
	@Column
	private int objetId;

	public Annonce() {

	}

	public Annonce(String titre, String description, String type,
			Date datePostulation, int positionGeographiqueId, int objetId) {
		this.titre = titre;
		this.description = description;
		this.type = type;
		this.datePostulation = datePostulation;
		this.positionGeographiqueId = positionGeographiqueId;
		this.objetId = objetId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDatePostulation() {
		return datePostulation;
	}

	public void setDatePostulation(Date datePostulation) {
		this.datePostulation = datePostulation;
	}

	public int getPositionGeographiqueId() {
		return positionGeographiqueId;
	}

	public void setPositionGeographiqueId(int positionGeographiqueId) {
		this.positionGeographiqueId = positionGeographiqueId;
	}

	public int getObjetId() {
		return objetId;
	}

	public void setObjetId(int objetId) {
		this.objetId = objetId;
	}
	
	
}
