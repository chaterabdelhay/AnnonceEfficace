


import org.arQam.AnnonceEfficace.Action.*;
import org.junit.Test;
import static org.junit.Assert.*;
 
public class ChangeModeleAffichaeEspaceProfesionnelActionTest {
	
		@Test public void estUnMembre() throws Exception {	  
			ChangeModeleAffichaeEspaceProfesionnelAction m = new ChangeModeleAffichaeEspaceProfesionnelAction();
	    	//m.q ="sal";	    	
	    	String res = m.execute();
	    	assertEquals("success", res);
    	}
  }