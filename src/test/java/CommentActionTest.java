

import org.arQam.AnnonceEfficace.Action.*;
import org.junit.Test;
import static org.junit.Assert.*;
 
public class CommentActionTest {
	
		@Test public void estUnMembre() throws Exception {	  
			CommentAction m = new CommentAction();
	    	//m.q ="sal";	    	
	    	String res = m.execute();
	    	assertEquals("success", res);
    	}
  }