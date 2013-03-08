

import org.arQam.AnnonceEfficace.Action.*;
import org.junit.Test;
import static org.junit.Assert.*;
 
public class CreateCompteActionTest {
	
		@Test public void estUnMembre() throws Exception {	  
			CreateCompteAction m = new CreateCompteAction();
	    	//m.q ="sal";	    	
	    	String res = m.execute();
	    	assertEquals("success", res);
    	}
  
}