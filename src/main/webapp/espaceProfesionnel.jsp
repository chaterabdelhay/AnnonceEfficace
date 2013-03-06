<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<!-- Include the header -->
<jsp:include page="header.jsp" />

<!-- BEGIN : page body content -->

<!-- BEGIN CONTAINER -->
<div class="container_12">	   
    <br/><br/><br/>      	   	    	
	<div style="margin:100px 0px 160px 10px;">
		<table class="espaceProfessionnel grayEP">
			<tr>
				<td colspan="2" class="header">
					<img class="logo" src="uploadedImage/espaceProfessionnel/<s:property value="espaceProfessionnel.logo"/>"/>
					<h3><s:property value="espaceProfessionnel.nom"/></h3>					
					<p class="description"><s:property value="espaceProfessionnel.description"/></p>
				</td>
			</tr>
			<tr>				
				<td>
				   <div class="left">
					 			
					 <p>
					 <s:iterator value="vitrines" var="vitrine">
						<h3>Vitrine : <s:property value="#vitrine.nom"/></h3>
						<div class="produit" style="cursor:pointer;" onclick="window.location='createProduct.action?vitrineId=<s:property value="#vitrine.id"/>'">
					 		<div class="image">					 							 							 			
					 			<img  src="template/images/new.png"/> <p style="color:rgba(0,0,0,0.3);font-weight:800;">nouveau</p>					 			
					 		</div>
					 		<div class="nom">&nbsp;</div>					 		
					 		<div class="prix">&nbsp;</div>	
					 	</div> 	
						 <s:iterator value="produits" var="produit">						 	
						 	<s:if test="%{#vitrine.id == #produit.vitrine.id}">
					 		<div class="produit">					 		
					 			<div>
					 				<img class="image" src="uploadedImage/produit/<s:property value="#produit.photo"/>"/>
					 			</div>
					 			<div class="nom">
					 				<s:property value="#produit.nom"/> Dhs
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
				<td>
				   <div class="right">
					<p><a href="createProduct?vitrineId=">Modifier le modèle d'affichage</a></p>
				   </div>					
				</td>
			</tr>
		</table>								
	</div>	   
</div><!-- END CONTAINER -->

<!-- END : page body content -->

<!-- Include the footer -->
<jsp:include page="footer.jsp" />