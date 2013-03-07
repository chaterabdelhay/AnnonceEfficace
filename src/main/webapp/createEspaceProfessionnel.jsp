<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!-- Include the header -->
<jsp:include page="header.jsp" />

<!-- BEGIN : page body content -->

<!-- BEGIN CONTAINER -->
<div class="container_12">
	<br /> <br /> <br /><br /><br /><br />
	
		<h3>Vous n'avez pas d'espace professionnel !</h3>
		<p>Vous pouvez le créer maintenant. C'est gratuit :) ! Remplissez le formulaire ci-dessous. </p>	
	<div>
		<table>
			<tr>
				<td>
					
					<div class="form-2"  style="width:800px">					
					<s:form action="createEspaceProfessionnel" theme="css_xhtml" id="form1" method="POST">
						<table>
						<tr>
						
								<td colspan="2">
								
									<s:iterator value="errorMessages" id="errorMsg">
										<p style="color: red;"><s:property value="%{#errorMsg}" /><p>
										
									</s:iterator>										
										<s:if test="%{errorMessages.size > 0}">
										<hr />											
										</s:if>
								</td>

							</tr>
							<tr>
								<td colspan="2">
									<h1>
										<span class="log-in">Créer votre espace professionnel</span>
									</h1>
								</td>
							</tr>
							<tr>
								
							</tr>
							<tr style="width:400px" valign="top">						
								<td>
																																																																				
										<!--<p>
											<label for="typeAnnonce">Type</label>
											<s:select  
												headerKey="-1" headerValue="Selectionnez" list="#{'V':'Vente', 'A':'Achat', 'E':'Evenement', 'OE':'Offre emploi'}" 												
												name="type" />												
										</p> -->	
										<p>
											<label for="titre">nom</label>
											<s:textfield name="nom" maxlength="30" id="titre"
												placeholder="nom du produit" />
										</p>
										
										<p>
											<label for="description">description</label>
											<s:textfield name="description" 
												id="description" placeholder="description"/>
										</p>
										<p>											
											  <s:file name="logo" label="Logo" />
										</p>																																																																																																																							
										<br>																																			
										<p class="clearfix">
											<input type="submit" id="submit" value="Créer">
										</p>																																							
							</tr>
						</table>
					  </s:form>	
					</div>
				</td>
			</tr>
		</table>

	</div>
	<script>
	$(document).ready(function() {
	   // $('#form1').on('submit', function() {
	 
	    	 alert("ajout avec succes");
	           // $.ajax({
	             //   url:"saveProduct.action", // le nom du fichier indiqué dans le formulaire
	               
	               // success: function() { // je récupère la réponse du fichier PHP
	                 //   alert("ajout avec succes"); // j'affiche cette réponse
	                //}
	           
	   // });
	    }
	}
	</script>
	
	<!-- begin .grid_12 - COMMENTS -->
	
	<!-- end .grid_12 -->

</div>
<!-- END CONTAINER -->

<!-- END : page body content -->
<!-- Include the footer -->
<jsp:include page="footer.jsp" />