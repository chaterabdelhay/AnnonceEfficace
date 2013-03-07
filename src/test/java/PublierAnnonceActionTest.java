

import org.arQam.AnnonceEfficace.Action.*;
import org.junit.Test;
import static org.junit.Assert.*;
 
public class PublierAnnonceActionTest {
	
		@Test public void estUnMembre() throws Exception {	  
			PublierAnnonceAction m = new PublierAnnonceAction();	    		    
	    	String res = m.execute();
	    	assertEquals("success", res);
    	}
  }