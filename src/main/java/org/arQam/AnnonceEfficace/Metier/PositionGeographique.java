package org.arQam.AnnonceEfficace.Metier;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.arQam.AnnonceEfficace.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
 
@Entity
@Table(name="positiongeographique")
public class PositionGeographique {
	@Id
	@GeneratedValue
	private int id;	
	@Column
	private double latitude;
	@Column
	private double longitude;
	
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
	
	
	
	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public void save() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();    
        id = (Integer) session.save(this);             
        session.getTransaction().commit();             
        session.close();     
    }
	
	public static void delete(int id) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();    
        session.createQuery( "delete PositionGeographique where id = :id" ).setParameter("id", id).executeUpdate();             
        session.getTransaction().commit();             
        session.close();     
    }
	
	public void delete() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();    
        session.delete(this);             
        session.getTransaction().commit();             
        session.close();     
    }

}
