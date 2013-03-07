

import org.arQam.AnnonceEfficace.Action.*;
import org.junit.Test;
import static org.junit.Assert.*;
 
public class SuivreActionTest {
	
		@Test public void estUnMembre() throws Exception {	  
			SuivreAction m = new SuivreAction();
	    	m.setSuivitId(2);	    	
	    	String res = m.execute();
	    	assertEquals("success", res);
    	}
  }