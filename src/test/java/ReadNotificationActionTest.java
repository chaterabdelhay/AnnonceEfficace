

import org.arQam.AnnonceEfficace.Action.*;
import org.junit.Test;
import static org.junit.Assert.*;
 
public class ReadNotificationActionTest {
	
		@Test public void estUnMembre() throws Exception {	  
			ReadNotificationAction m = new ReadNotificationAction();	    		    
	    	String res = m.execute();
	    	assertEquals("input", res);
    	}
  }