<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<!-- Include the header -->
<jsp:include page="header.jsp" />

<!-- BEGIN : page body content -->

<!-- BEGIN CONTAINER -->
<div class="container_12">	   
    <br/><br/><br/>      	   	    	
	<div style="margin:40px 0px 160px 10px;">
		<s:if test="%{espaceProId == null}">
		<h3 style="margin-bottom:10px;">		 
			<a href="#" id="editModeleAffichage">Modifier le modèle d'affichage</a>&nbsp;|&nbsp;
			<a href="#" id="augmenterTailleVitrine">Augmenter la taille de ma vitirine</a>
		</h3>
		</s:if>		
		<table class="espaceProfessionnel <s:property value="%{modeleAffichage['bg']}"/>">
			<tr>
				<td class="header">
					<img class="<s:property value="%{modeleAffichage['logo']}"/>" src="uploadedImage/espaceProfessionnel/<s:property value="espaceProfessionnel.logo"/>"/>
					<h2><s:property value="espaceProfessionnel.nom"/></h2>					
					<p class="description_<s:property value="%{modeleAffichage['description']}"/>"><s:property value="espaceProfessionnel.description"/></p>
				</td>
			</tr>
			<tr>				
				<td>
				   <div class="vitrines">							
					 <p>
					 <s:iterator value="vitrines" var="vitrine">
						<h3><s:property value="#vitrine.nom"/></h3>
						<s:if test="%{espaceProId == null}">						
						<div class="produit <s:property value="%{modeleAffichage['produit']}"/>" style="cursor:pointer;" onclick="window.location='createProduct.action?vitrineId=<s:property value="#vitrine.id"/>'">
					 		<div class="image">					 							 							 			
					 			<img  src="template/images/new.png"/> <p style="color:rgba(0,0,0,0.3);font-weight:800;">nouveau</p>					 			
					 		</div>
					 		<div class="nom">&nbsp;</div>					 		
					 		<div class="prix">&nbsp;</div>	
					 	</div> 	
					 	</s:if>					 	
						 <s:iterator value="produits" var="produit">						 	
						 	<s:if test="%{#vitrine.id == #produit.vitrine.id}">
					 		<div class="produit <s:property value="%{modeleAffichage['produit']}"/>">					 		
					 			<div>
					 				<img class="image" src="uploadedImage/produit/<s:property value="#produit.photo"/>"/>
					 			</div>
					 			<div class="nom">
					 				<s:property value="#produit.nom"/>
					 			</div>					 		
					 			<div class="prix">
					 				<s:property value="#produit.prix"/> Dhs
					 			</div>
					 		</div>					 							 		
					 		</s:if>
					 	</s:iterator>					 						 						 
					 </s:iterator>					
					 </p>
				   </div>	
				</td>				
			</tr>
		</table>								
	</div>	   
</div><!-- END CONTAINER -->
<div id="topGrayLayer2" class="topGrayLayer">
	<div id="mapDiv">
		<div class="whiteBG" style="margin-top:200px; padding: 10px;">				     	    
			<p><a id="link1" href="changeModeleAffichageEspaceProfesionnel.action?modeleId=1">Modèle 1</a> : Arrière plan blanc avec logo à droite de l'entête</p>
			<p><a id="link1" href="changeModeleAffichageEspaceProfesionnel.action?modeleId=2">Modèle 2</a> : Arrière plan gris avec logo à droite de l'entête</p>
			<p><a id="link1" href="changeModeleAffichageEspaceProfesionnel.action?modeleId=3">Modèle 3</a> : Arrière plan rose et logo placé à gauche</p>
			<br/>			
 			<h3><a href="#" id="topLayer2Close">Fermer</a></h3>
			<script>									
			$("#editModeleAffichage").click(function(){							
				$("#topGrayLayer2").fadeIn(500);										
			});
			$("#topLayer2Close").click(function(){							
				$("#topGrayLayer2").fadeOut(500);										
			});	
			</script>			    		
 		</div>		
	</div>
</div>

<div id="topGrayLayer1" class="topGrayLayer">
	<div id="mapDiv">
		<div class="whiteBG" style="margin-top:200px; padding: 10px;">				     	    

			<p>Ce service n'est pas disponible actuellement.</p>
			<br/>			
 			<h3><a href="#" id="topLayer1Close">Fermer</a></h3>
			<script>									
			$("#augmenterTailleVitrine").click(function(){							
				$("#topGrayLayer1").fadeIn(500);										
			});
			$("#topLayer1Close").click(function(){							
				$("#topGrayLayer1").fadeOut(500);										
			});	
			</script>			    		
 		</div>		
	</div>
</div>
<!-- END : page body content -->

<!-- Include the footer -->
<jsp:include page="footer.jsp" />