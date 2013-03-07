package org.arQam.AnnonceEfficace;

import org.arQam.AnnonceEfficace.Action.*;
import org.junit.Test;
import static org.junit.Assert.*;
 
public class LoginActionTest {
  @Test public void estUnMembre() throws Exception {
	  
	  LoginAction m = new LoginAction();
	    m.setUsername("saladin");
	    m.setUsername("123");
	    String res = m.execute();
	    assertEquals("Saladin est un membre", "Success", res);
    }
  }