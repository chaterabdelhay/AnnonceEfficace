package org.arQam.AnnonceEfficace.Action;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.arQam.AnnonceEfficace.Metier.Produit;
import org.arQam.AnnonceEfficace.Metier.Vitrine;
import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;


public class SaveProductAction extends ActionSupport implements ServletRequestAware {
	private HttpServletRequest servletRequest;
	
	
	public String nom;
	public File productimage;
	public String productimageContentType; // filled automaticly
	public String productimageFileName;// filled automaticly
	//public String productimageFileName;
	public float prix;
	public String vitrineId;	
	private String type; 
	public List errorMessages;	
	
	public String execute() throws Exception {				
		if(!isValid()) {					
			return INPUT;
		}
		// upload the file
		try {
            String filePath = servletRequest.getSession().getServletContext().getRealPath("/") + "\\uploadedImage";
            System.out.println("Server path:" + filePath);
            System.out.println("Image name:" + productimage.getPath());
            File fileToCreate = new File(filePath, productimageFileName);            
            FileUtils.copyFile(this.productimage, fileToCreate);
            System.out.println("new file :" + fileToCreate.getPath());
            System.out.println("new file :" + productimageFileName);
        } catch (Exception e) {
            e.printStackTrace();
            addActionError(e.getMessage()); 
            return INPUT;
        }
		// save the product entity to database
		Produit pr = new Produit();
        pr.setNom(nom);
        pr.setPhoto(productimageFileName);
        pr.setPrix(prix);
        // set current date
        int vitrineId = Integer.valueOf(this.vitrineId);
        pr.setVitrine(Vitrine.load(vitrineId));
        System.out.print(vitrineId);
        pr.save();
        return SUCCESS;
    }
	 public List getErrorMessages() {
		return errorMessages;
	}
	public void setErrorMessages(List errorMessages) {
		this.errorMessages = errorMessages;
	}
	public boolean isValid(){
		boolean errorExists= false;
		if(nom != null & productimage != null & Float.toString(prix)!=null & vitrineId!=null)
		{
			errorMessages = new ArrayList();
			if(nom.isEmpty() || productimage == null||Float.toString(prix).isEmpty() ){ // champs vides{
				errorMessages.add("veuillez remplir tous les champs svp ");
				errorExists = true;
				System.out.print("a");
			}	
			if(nom.isEmpty()){
				errorMessages.add("Vous devez entrer un nom du produit");
				errorExists = true;
				System.out.print("b");
			}
			if(productimage == null){
				errorMessages.add("Selectionnez l'image du produit");
				errorExists = true;
				System.out.print("c");
			}
			if(Float.toString(prix).isEmpty()){
				errorMessages.add("Vous devez entrer un prix");
				errorExists = true;
				System.out.print("d");
			}
		}else{
			return false;
		}
		if(errorExists) return false;
			return true; 			
	}
	
	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;			
	}
		
}