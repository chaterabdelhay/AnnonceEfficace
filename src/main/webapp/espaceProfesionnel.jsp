<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<!-- Include the header -->
<jsp:include page="header.jsp" />

<!-- BEGIN : page body content -->

<!-- BEGIN CONTAINER -->
<div class="container_12">	   
    <br/><br/><br/>      	   	    	
	<div style="margin:100px 0px 160px 10px;">
		<table class="espaceProfessionnel">
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
					 <h3>Vos vitrines :</h3> 				
					 <p>
					 <s:iterator value="vitrines" var="vitrine">
						<s:property value="#vitrine.nom"/>&nbsp;
					 </s:iterator>
					 </p>
				   </div>	
				</td>
				<td>
				   <div class="right">
					<p><a href="createProduct?vitrineId=">Ajouter un produit</a></p>
				   </div>					
				</td>
			</tr>
		</table>		
							
	</div>	   
</div><!-- END CONTAINER -->

<!-- END : page body content -->

<!-- Include the footer -->
<jsp:include page="footer.jsp" />