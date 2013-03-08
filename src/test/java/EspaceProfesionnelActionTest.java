import org.arQam.AnnonceEfficace.Action.*;
import org.junit.Test;
import static org.junit.Assert.*;
 
public class EspaceProfesionnelActionTest {
	
		@Test public void estUnMembre() throws Exception {	  
			EspaceProfesionnelAction m = new EspaceProfesionnelAction();
	    	//m.q ="sal";	    	
	    	String res = m.execute();
	    	assertEquals("success", res);
    	}
  
}
