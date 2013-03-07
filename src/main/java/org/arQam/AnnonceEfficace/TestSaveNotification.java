package org.arQam.AnnonceEfficace;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Map;

import org.arQam.AnnonceEfficace.Action.LoginAction;

public class TestSaveNotification {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		 		
		LoginAction m = new LoginAction();
    	m.setUsername("saladin");
    	m.setUsername("123");
    	String res = m.execute();
    	System.out.println(res + "," + m.execute());
		
		/*Calendar calendar = Calendar.getInstance();
	        java.util.Date currentDate = calendar.getTime();        
	        java.sql.Date date = new java.sql.Date(currentDate.getTime());	        	        
	        Notification notification = new Notification();
	        notification.setDate(date);
	        notification.setContenu("L'utilisateur ");
	        notification.setLien("detailsAnnonce.action?annonceId=" + 12);
	        Long i = new Long(12);
	        notification.save(11);*/
	}

}
