package org.arQam.AnnonceEfficace.Metier;

import java.sql.Date;

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
	
	public Commentaire(Date datePostulation, String contenu,Utilisateur utilisateur,Annonce annonce){
		this.datePostulation = datePostulation;
		this.contenu = contenu;	
		this.utilisateur=utilisateur;
		this.annonce=annonce;
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
	public void save() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();    
        Long id = (Long) session.save(this);             
        session.getTransaction().commit();             
        session.close();     
    }
		
}
