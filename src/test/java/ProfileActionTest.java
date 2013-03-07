

import org.arQam.AnnonceEfficace.Action.*;
import org.junit.Test;
import static org.junit.Assert.*;
 
public class ProfileActionTest {
	
		@Test public void estUnMembre() throws Exception {	  
			ProfileAction m = new ProfileAction();
			m.id = Long.valueOf(1);			
	    	String res = m.execute();
	    	assertEquals("success", res);
    	}
  }