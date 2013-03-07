

import org.arQam.AnnonceEfficace.Action.*;
import org.junit.Test;
import static org.junit.Assert.*;
 
public class CreerCompteActionTest {
	
		@Test public void estUnMembre() throws Exception {	  
			CreerCompteAction m = new CreerCompteAction();
	    	//m.q ="sal";	    	
	    	String res = m.execute();
	    	assertEquals("success", res);
    	}
  
}