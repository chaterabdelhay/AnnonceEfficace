<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!-- Include the header -->
<jsp:include page="header.jsp" />

<!-- BEGIN : page body content -->

<!-- BEGIN CONTAINER -->
<div class="container_12">
	<br /> <br /> <br />
	<div style="margin-left: 160px;">
		<table id="login">
			<tr>
				<td>
					<div class="form-2">
						<table>
							<tr>
								<td><s:form action="createCompte" theme="css_xhtml"
										style="width:550px">
										<h1>
											<span class="log-in">Création de compte</span>
										</h1>
										<p>
											<label for="login">Nom d'utilisateur</label>
											<s:textfield name="user.nomUtilisateur" maxlength="20"
												id="user_nomUtilisateur" placeholder="nom d'utilisateur"/>											    										
    										<script>
    										function ajaxQuery1(){
    											//alert("ajax_createAccounctVerification?nomUtilisateur=" + $('#user_nomUtilisateur').val());
    										    $.ajax({
    											   type: "GET",
    											   url: "ajax_createAccounctVerification?nomUtilisateur=" + $('#user_nomUtilisateur').val(),
    											   error:function(msg){
    												   $('#msg').html("Error !: " + msg );
    											   },
    											   success:function(data){
    											   	//affiche le contenu du fichier dans le conteneur dédié
    												$('#msg').html(data);
    											   }
    											});
    										}    										    										    										    									    								
    										//on keyup, start the countdown
    										$('#user_nomUtilisateur').focusout(function(){
    											ajaxQuery1();
    										});    										
    										</script>
    										
    										<div id="msg"></div>
										</p>
										<p>
											<label for="password">Mot de passe</label>
											<s:textfield type="password" name="user.motDePasse"
												maxlength="20" id="user.motDePasse"
												placeholder="Mot de passe" class="showpassword" />
										</p>
										<p>
											<label for="confirmPassword">Confirmation du mot de passe</label>
											<s:textfield type="password" name="confirmPassword"
												maxlength="20" id="confirmPassword"
												placeholder="reindiquez votre mot de passe"
												class="showpassword" />
										</p>
										<p>
											<label for="email">E-mail</label>
											<s:textfield name="user.email" maxlength="20" id="email"
												placeholder="votre email, ex: mohamed@gmail.com" />
										</p>
										<p>
											<label for="email">Telephone</label>
											<s:textfield name="user.telephone" maxlength="20"
												id="telephone" placeholder="votre numéro de téléphone" />
										</p>
										<p>
											<label for="ville">Ville</label> 
											<s:select
												headerKey="-1" headerValue="Selectionnez" list="villes" listKey="id" listValue="nom" 												
												name="villeId" />																															
										</p>
										<p class="clearfix">
											<input type="submit" value="Créer">
										</p>
									</s:form></td>
							</tr>
						</table>
					</div>
				</td>
			</tr>
		</table>
	</div>

</div>
<!-- END CONTAINER -->

<!-- END : page body content -->

<!-- Include the footer -->
<jsp:include page="footer.jsp" />