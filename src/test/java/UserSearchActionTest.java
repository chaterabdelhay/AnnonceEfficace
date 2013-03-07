

import org.arQam.AnnonceEfficace.Action.*;
import org.junit.Test;
import static org.junit.Assert.*;
 
public class UserSearchActionTest {
	
		@Test public void estUnMembre() throws Exception {	  
			UserSearchAction m = new UserSearchAction();
	    	m.q ="sal";	    	
	    	String res = m.execute();
	    	assertEquals("success", res);
    	}
  }