


import org.arQam.AnnonceEfficace.Action.*;
import org.junit.Test;
import static org.junit.Assert.*;
 
public class CreateAccountVerificationActionTest {
	
		@Test public void estUnMembre() throws Exception {	  
			CreateAccountVerificationAction m = new CreateAccountVerificationAction();
	    	//m.q ="sal";	    	
	    	String res = m.execute();
	    	assertEquals("success", res);
    	}
  
}