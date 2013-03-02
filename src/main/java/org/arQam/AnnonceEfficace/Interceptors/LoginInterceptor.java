package org.arQam.AnnonceEfficace.Interceptors;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.StrutsStatics;
import org.arQam.AnnonceEfficace.Metier.Notification;
import org.arQam.AnnonceEfficace.Metier.Utilisateur;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
 
public class LoginInterceptor implements Interceptor{
 
    private static final long serialVersionUID = 1L;
 
    public String intercept(ActionInvocation invocation) throws Exception {
 
    	// ####### code execut� avant l'invocation de l'actio    	    	
    	    	
    	
        Map session = ActionContext.getContext().getSession();        
        if(session.get("utilisateur") != null){
        	Utilisateur user = (Utilisateur) session.get("utilisateur");        	        	
        	session.put("nbrOfNotifications", Notification.count(user.getId()));
            String result = invocation.invoke();          
        }
        
       /* HttpServletRequest request = (HttpServletRequest) invocation.  
        							  getInvocationContext().get(StrutsStatics.HTTP_REQUEST);  
        request.getSession().invalidate();*/  
        
       HttpServletResponse response = (HttpServletResponse)invocation.  
                    				  getInvocationContext().get(StrutsStatics.HTTP_RESPONSE);  
       // ServletActionContext.getRequest().getSession(false).invalidate();  
          
       response.sendRedirect("login");  
        
        // code execut� apr�s l'invocation de l'actio
              
        return "connexionPage"; // not used : return a global result name 
    }
 
    public void destroy() {
        //System.out.println("Destroying MyLoggingInterceptor...");
    }
    public void init() {
        //System.out.println("Initializing MyLoggingInterceptor...");
    }
}