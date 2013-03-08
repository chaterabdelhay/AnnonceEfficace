

import org.arQam.AnnonceEfficace.Action.*;
import org.junit.Test;
import static org.junit.Assert.*;
 
public class DetailsAnnonceActionTest {
	
		@Test public void estUnMembre() throws Exception {	  
			DetailsAnnonceAction m = new DetailsAnnonceAction();
	    	//m.q ="sal";	    	
	    	String res = m.execute();
	    	assertEquals("success", res);
    	}
  
}