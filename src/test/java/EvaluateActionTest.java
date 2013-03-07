

import org.arQam.AnnonceEfficace.Action.*;
import org.junit.Test;
import static org.junit.Assert.*;
 
public class EvaluateActionTest {
	
		@Test public void estUnMembre() throws Exception {	  
			EvaluateAction m = new EvaluateAction();
	    	//m.q ="sal";	    	
	    	String res = m.execute();
	    	assertEquals("success", res);
    	}
  
}