<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!-- Include the header -->
<jsp:include page="header.jsp" />

<!-- BEGIN : page body content -->

<!-- BEGIN CONTAINER -->
<div class="container_12">
	<br /> <br /> <br /><br /><br />
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
												placeholder="nom d'utilisateur" value="saladin"/>
										</p>
										<p>
											<label for="password"><i class="icon-lock"></i>Mot de passe</label>
											<s:textfield type="password" name="password" maxlength="20"
												id="username" placeholder="mot de passe" class="showpassword" value="123"/>
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
											Les internautes authenfiés ont accès à des <s:a href="userGuide">fonctionnalités très interresantes</s:a>, ne vous en privez pas ! 
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
</div>
<!-- END CONTAINER -->

<!-- END : page body content -->

<!-- Include the footer -->
<jsp:include page="footer.jsp" />