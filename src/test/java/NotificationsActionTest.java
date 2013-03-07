

import org.arQam.AnnonceEfficace.Action.*;
import org.junit.Test;
import static org.junit.Assert.*;
 
public class NotificationsActionTest {
	
		@Test public void estUnMembre() throws Exception {	  
			NotificationsAction m = new NotificationsAction();				
	    	String res = m.execute();
	    	assertEquals("success", res);
    	}
  }