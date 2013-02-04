<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!-- Include the header -->
<jsp:include page="header.jsp" />

<!-- BEGIN : page body content -->
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
						<span style="font-weight: 800">Type de l'annonce : <s:property value="%{typeAnnonce}"/><br/>Titre : <s:property value="%{annonce.titre}"/></span>
						<span style="float: right">							
							<input name="star1" type="radio" class="star"/>
							<input name="star1" type="radio" class="star"/>
							<input name="star1" type="radio" class="star"/>
							<input name="star1" type="radio" class="star"/>
							<input name="star1" type="radio" class="star"/>
							 evaluation moyenne :<s:property value="%{average}" />
						</span>
					</p>
				</td>
			</tr>
			<tr>
				<td style="padding-top: 10px;"><img class="boxImage tiptop" width="222px" height="142px"
					src="uploadedImage/objet/<s:property value="%{annonce.objet.image}"/>" alt="" title="&plusmn;&nbsp;zoom" />
				</td>
				<td
					style="vertical-align: top; padding-left: 10px; padding-top: 10px;">
					<p>
						<span style="font-weight: 800">Publiée par <s:property value="%{annonce.utilisateur.nomUtilisateur}"/>, le <s:property value="%{annonce.datePostulation}"/></span>
					</p>
					<p style="font-weight: 800">Description</p>
					<p><s:property value="%{annonce.description}"/></p>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<div class="commentaire">
						<div id="addCommentContainer">
							<p>Add a Comment</p>
							
							<p><div id="commentaire">
							</div></p>	
							<s:iterator value="commentaires" var="resultObject">
							<div class="commentaire" style="margin-bottom: 20px;"><s:property value="#resultObject"/> </div>
							</s:iterator>	
							<form id="addCommentForm" method="post" action="">
								<s:textarea name="contenu" id="msgTxt"
									placeholder="Commentez cette annonce !" cols="80" rows="10" />
								<s:submit id="submit" value="Submit" />
								
							</form>							
						</div>										
					</div>

<s:textfield type="hidden" id="annonceId" value="%{annonceId}" />

					<script>						
					
						$('#addCommentForm').submit(function(e) {
							e.preventDefault();
						
							$.ajax({
								type : "GET",
								url : "commenter.action?contenu=" + $("#msgTxt").val()+"&annonceId="+ $("#annonceId").val(),
								error : function(msg) {
									$('#commentaire').html("Error !: " + msg);
								},
								success : function(data) {
									//alert("msg sended");
									//affiche le contenu du fichier dans le conteneur dédié
									$("<div>").html(data).insertAfter("#commentaire").hide().slideDown("slow");
									//$('#commentaire').html(data).insertBefore('#commentaire').slideDown();
								}
							});
						});
					</script>

				</td>
			</tr>
		</table>
	</div>
</div>

<!-- END CONTAINER -->

<!-- END : page body content -->

<!-- Include the footer -->
<jsp:include page="footer.jsp" />