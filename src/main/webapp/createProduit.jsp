<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!-- Include the header -->
<jsp:include page="header.jsp" />

<!-- BEGIN : page body content -->

<!-- BEGIN CONTAINER -->
<div class="container_12">
	<br /> <br /> <br />
	<div>
		<table>
			<tr>
				<td>
					<div class="form-2"  style="width:800px">
					<s:form action="createProduct" theme="css_xhtml" id="form1" >
						<table>
						<tr>
						
								<td colspan="2">
								
									<s:iterator value="errorMessages" id="errorMsg">
										<p style="color: red;">	
										dddd										
											<s:property value="%{#errorMsg}" /><p>
										
									</s:iterator>										
										<s:if test="%{errorMessages.size > 0}">
										<hr />											
										</s:if>
								</td>

							</tr>
							<tr>
								<td colspan="2">
									<h1>
										<span class="log-in">ajouter un produit</span>
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
											<label for="password">prix</label>
											<s:textfield name="prix" 
												id="image" placeholder="prix"/>
										</p>
										<p>
											
											  <s:file name="productimage" label="Product Image" />
										</p>
										<p>
										<label for="password">vitrine:</label>
										<s:select headerKey="-1"  list="vitres" 												
												name="vitre" />	
																																									
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