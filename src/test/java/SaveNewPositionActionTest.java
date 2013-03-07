

import org.arQam.AnnonceEfficace.Action.*;
import org.junit.Test;
import static org.junit.Assert.*;
 
public class SaveNewPositionActionTest {
	
		@Test public void estUnMembre() throws Exception {	  
			SaveNewPositionAction m = new SaveNewPositionAction();
	    	m.setPosGeoLatitude((double) 13);
	    	m.setPosGeoLongitude((double) 13);
	    	String res = m.execute();
	    	assertEquals("success", res);
    	}
  }