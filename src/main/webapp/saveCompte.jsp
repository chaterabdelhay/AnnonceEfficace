<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

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
								<td>
									<s:form action="createcompte" theme="css_xhtml" style="width:550px" >
										<h1>
											<span class="log-in">Vous etes bien enregistré:</span>
										</h1>
										<p>
											<label for="login">Username</label>
											<s:textfield value="%{user.nomUtilisateur}"  maxlength="20" id="user.nomUtilisateur" disabled="true"/>
												 
										</p>
										<p>
											<label for="password">Password</label>
											<s:textfield  value="%{user.motDePasse}"  maxlength="20"
												id="user.motDePasse" placeholder="Mot de passe" class="showpassword" disabled="true"/>
										</p>
																			
										<p>
											<label for="email">E-mail</label>
											<s:textfield value="%{user.email}" maxlength="20"
												id="email" placeholder="votre email, ex: mohamed@gmail.com" disabled="true"/>
										</p>
										<p>
											<label for="email">Telephone</label>
											<s:textfield value="%{user.telephone}" maxlength="20"
												id="telephone" placeholder="votre numéro de téléphone" disabled="true"/>
										</p>
										<p>
											<label for="villeId">Ville</label>
											<s:textfield value="%{user.ville.nom}" disabled="true" />
</div>											
										</p>																			
										
									</s:form>
								</td>							
							</tr>
						</table>
					</div>
				</td>
			</tr>
		</table>

	</div>

	<!-- begin .grid_12 - COMMENTS -->
	<div id="strip" class="grid_12">
		<img id="users" src="template/images/users.png" alt="" />
		<ul id="comments">
			<li>"Maecenas pharetra egestas adipiscing. Nullam consequat
				velit in felis sodales in facilisis justo fringilla. Pellentesque
				nec lobortis dolor. Praesent et mi eu magna dapibus condimentum."<br />
				<span class="signature">John Doe - 4 October 2011</span>
			</li>
			<li>"Ut dapibus fringilla volutpat. Sed ullamcorper augue nec
				risus facilisis eu venenatis metus tristique. In hac habitasse
				platea dictumst. Aenean at lacus urna. Donec pretium mattis
				gravida."<br /> <span class="signature">John Doe - 4 October
					2011</span>
			</li>
		</ul>
	</div>
	<!-- end .grid_12 -->

</div>
<!-- END CONTAINER -->

<!-- END : page body content -->

<!-- Include the footer -->
<jsp:include page="footer.jsp" />