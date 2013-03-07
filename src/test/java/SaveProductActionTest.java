

import org.arQam.AnnonceEfficace.Action.*;
import org.junit.Test;
import static org.junit.Assert.*;
 
public class SaveProductActionTest {
	
		@Test public void estUnMembre() throws Exception {	  
			SaveProductAction m = new SaveProductAction();
	    	String res = m.execute();
	    	assertEquals("input", res);
    	}
  }