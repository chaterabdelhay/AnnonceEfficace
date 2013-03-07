

import org.arQam.AnnonceEfficace.Action.*;
import org.junit.Test;
import static org.junit.Assert.*;
 
public class OperationReussieActionTest {
	
		@Test public void estUnMembre() throws Exception {	  
			OperationReussieAction m = new OperationReussieAction();	    		    
	    	String res = m.execute();
	    	assertEquals("success", res);
    	}
  }