

import org.arQam.AnnonceEfficace.Action.*;
import org.junit.Test;
import static org.junit.Assert.*;
 
public class EspaceUtilisateurActionTest {
	
		@Test public void estUnMembre() throws Exception {	  
			EspaceUtilisateurAction m = new EspaceUtilisateurAction();
	    	//m.q ="sal";	    	
	    	String res = m.execute();
	    	assertEquals("success", res);
    	}
  
}