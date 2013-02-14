<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!-- Include the header -->
<jsp:include page="header.jsp" />

<!-- BEGIN : page body content -->

<!-- BEGIN CONTAINER -->
<div class="container_12">
	<br /> <br /> <br />
	<div id="updatePosition">
		<table cellpadding="4" style="display:inline;">
	      <tr>	       
	       <td><p>Il est obligatoire d'utiliser sonnar durant la présentation (on execute le projet et on laisse la main à sonnar pour créer les differentes statistiques !</p></td>	      
		  </tr>
		</table>		
	</div>
	<div style="margin-left: 160px;">
		<table id="login">
			<tr>
				<td>
					<div class="form-2">
						<table>
							<tr>
								<td>
									<s:form action="login" theme="css_xhtml" style="width:250px">
										<h1>
											<span class="sign-up">Connectez-vous</span>
										</h1>
										<p>
											<label for="login"><i class="icon-user"></i>Nom d'utilisateur</label>
											<s:textfield name="username" maxlength="20" id="username"
												placeholder="nom d'utilisateur" />
										</p>
										<p>
											<label for="password"><i class="icon-lock"></i>Mot de passe</label>
											<s:textfield type="password" name="password" maxlength="20"
												id="username" placeholder="mot de passe" class="showpassword" />
										</p>
										<p class="clearfix">
											<input type="submit" value="Login">
										</p>
									</s:form>
								</td>
								<td>
									<div id="createAccount"
										style="line-height: 30px; width: 250px; font-size: 13px; margin-left: 50px; color: #555">
										<h1 style="font-weight: 800;">Vous ne disposez pas de compte ?</h1>																				
										<p style="text-align: justify;">											
											<s:a href="creerCompte">La création d'un compte</s:a> est instantanée ! Même pas deux minutes et vous aurez votre 
											propre compte.<br/>
											<span style="color:#888">
											Les internautes authenfiés ont accès à des <s:a href="Manuel?rubrique=5">fonctionnalités très interresantes</s:a>, ne vous en privez pas ! 
											</span>
										</p>																																	
									</div>
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