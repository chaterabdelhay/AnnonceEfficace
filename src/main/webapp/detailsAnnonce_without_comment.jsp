<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!-- Include the header -->
<jsp:include page="header.jsp" />

<!-- BEGIN : page body content -->
<link rel="stylesheet" type="text/css" href="styles.css" />
<!-- BEGIN CONTAINER -->
<div class="container_12">
	<br /> <br /> <br />
	<div style="margin: 40px 10px 160px 10px; padding: 20px 20px;"
		class="whiteBG">
		<table id="login">
			<tr>
				<td colspan="2"
					style="padding-bottom: 5px; border-bottom: 1px solid #ddd;">
					<p>
						<span style="font-weight: 800">[Type de l'annonce] : </span>Titre
						annonce de l'annonce ici <span style="float: right"><s:a
								action="evaluer?ev.note=1&ev.annonceId=2">
								<input name="star1" type="radio" class="star" value="1" />
							</s:a>
							<s:a action="evaluer?ev.note=2&ev.annonceId=2">
								<input name="star2" type="radio" class="star" value="2" />
							</s:a>
							<s:a action="evaluer?ev.note=3&ev.annonceId=2">
								<input name="star3" type="radio" class="star" value="3" />
							</s:a>
							<s:a action="evaluer?ev.note=4&ev.annonceId=2">
								<input name="star4" type="radio" class="star" value="4" />
							</s:a> evaluation moyenne :<s:property value="%{average}" /> </span>
					</p>
				</td>
			</tr>
			<tr>
				<td style="padding-top: 10px;"><img class="boxImage tiptop"
					src="template/images/boxes/2.jpg" alt="" title="&plusmn;&nbsp;zoom" />
				</td>
				<td
					style="vertical-align: top; padding-left: 10px; padding-top: 10px;">
					<p>
						<span style="font-weight: 800">Publiée le 22 juin 2012, par
							Saladin </span>
					</p>
					<p style="font-weight: 800">Description</p>
					<p>Maecenas pharetra egestas adipiscing. Nullam consequat velit
						in felis sodales in facilisis justo fringilla. Pellentesque nec
						lobortis dolor. Praesent et mi eu magna dapibus condimentum.&nbsp;
						adipiscing. Nullam consequat velit in felis sodales in facilisis
						justo fringilla. Pellentesque nec lobortis dolor. Praesent et mi
						eu magna dapibu adipiscing. Nullam consequat velit in felis
						sodales in facilisis justo fringilla. Pellentesque nec lobortis
						dolor. Praesent et mi eu magna dapibu</p>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<a href="login.action">login pour commenter</a>

				</td>
			</tr>
		</table>
	</div>
</div>

<!-- END CONTAINER -->

<!-- END : page body content -->

<!-- Include the footer -->
<jsp:include page="footer.jsp" />