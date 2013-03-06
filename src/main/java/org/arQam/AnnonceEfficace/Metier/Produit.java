package org.arQam.AnnonceEfficace.Metier;

import java.sql.Date;
import java.util.List;

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
@Table(name="produit")
public class Produit {
	@Id
    @GeneratedValue
	private int id;
	@Column
	private String nom;
	@Column
	private float prix;
	@Column
	private String photo;
	
	@ManyToOne
	@JoinColumn(name="vitrineId")
	private Vitrine vitrine;
	

	public Produit() {

	}

	public Produit(String nom, float prix, String photo)
			{
		this.nom = nom;
		this.prix = prix;
		this.photo = photo;
			
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
	public static List list() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
     
        List result = session.createQuery("from Produit").list();
        session.close();
        return result;
    }
	
	public static Produit load(long id) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

		List result = session.createQuery("from Produit WHERE id = "+id).list();
		if(result != null)
			return (Produit) result.get(0);                        
		return null;		
	}

	public void save() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();    
		long id = (Integer) session.save(this);             
		session.getTransaction().commit();             
		session.close();     
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Vitrine getVitrine() {
		return vitrine;
	}

	public void setVitrine(Vitrine vitrine) {
		this.vitrine = vitrine;
	}
	

	
}

