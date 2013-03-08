

import org.arQam.AnnonceEfficace.Action.*;
import org.junit.Test;
import static org.junit.Assert.*;
 
public class CreateProductActionTest {
	
		@Test public void estUnMembre() throws Exception {	  
			CreateProductAction m = new CreateProductAction();
	    	//m.q ="sal";	    	
	    	String res = m.execute();
	    	assertEquals("success", res);
    	}
  
}