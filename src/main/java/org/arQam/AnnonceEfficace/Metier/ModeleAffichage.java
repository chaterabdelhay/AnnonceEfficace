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
@Table(name="modeleaffichage")
public class ModeleAffichage {
	@Id
    @GeneratedValue
	private int id;
	@Column
	private String modele;
	
	

	public ModeleAffichage() {

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
     
        List result = session.createQuery("from Annonce").list();
        session.close();
        return result;
    }
	
	public static List listOrderByDistance(String type, double latitude, double longitude) {
		if(type == null || type.isEmpty() || type.equals("All")) type="%";
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        String hqlRequest = "Select a, sqrt(power(a.positionGeographique.latitude-"+latitude+",2) + " +
        				"power(a.positionGeographique.longitude-"+longitude+",2)) from Annonce a WHERE a.type LIKE'"+type+"' ORDER BY 2";
        
        List resultList = session.createQuery(hqlRequest).list();        
        return resultList;
        /*List annonces = new ArrayList();
        for (Object result : resultList) {        	
        	annonces.add(((Object[]) result)[0]);            
        }
        session.close();
        return annonces;*/
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

	

	
}

