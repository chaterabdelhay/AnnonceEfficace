

import org.arQam.AnnonceEfficace.Action.*;
import org.junit.Test;
import static org.junit.Assert.*;
 
public class MessagesActionTest {
	
		@Test public void estUnMembre() throws Exception {	  
			MessageAction m = new MessageAction();
			//m.id = Long.valueOf(1);			
	    	String res = m.execute();
	    	assertEquals("success", res);
    	}
  }