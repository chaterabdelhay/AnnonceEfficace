

import org.arQam.AnnonceEfficace.Action.*;
import org.junit.Test;
import static org.junit.Assert.*;
 
public class CreateEspaceProfessionnelActionTest {
	
		@Test public void estUnMembre() throws Exception {	  
			CreateEspaceProfessionnelAction m = new CreateEspaceProfessionnelAction();
	    	//m.q ="sal";	    	
	    	String res = m.execute();
	    	assertEquals("success", res);
    	}
  
}