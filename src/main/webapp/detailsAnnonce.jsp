<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!-- Include the header -->

<jsp:include page="header.jsp" />

<!-- BEGIN : page body content -->
<!-- BEGIN CONTAINER -->

<div class="container_12">
<div id="demo">
	
	<br /> <br /> <br />
	<div style="margin: 40px 10px 160px 10px; padding: 20px 20px;"
		class="whiteBG">
		<table id="login">
			<tr>
				<td colspan="2"
					style="padding-bottom: 5px; border-bottom: 1px solid #ddd;">					
						<div style="float:right" style="width:200px;"> 						
						<p>Evaluation moyenne : <span id="avgValue"><s:property value="average"/></span></p>
						<s:if test="%{#session.utilisateur != null}">
						<s:if test="%{!evaluatedByUser}">
						<div id="evaluateControl">
							<p>
							<input name="star1" type="radio" value="1" class="star"/>
							<input name="star1" type="radio" value="2" class="star"/>
							<input name="star1" type="radio" value="3" class="star"/>
							<input name="star1" type="radio" value="4" class="star"/>
							<input name="star1" type="radio" value="5" class="star"/>
							<a style="display:none" href="#" id="evaluerLink">évaluer</a>
						</p>
						</div>
						</s:if>
						</s:if>
						</div>																
						<div style="float:left;">
							<h3>Type de l'annonce : <s:property value="%{typeAnnonce}"/><br/>Titre : <s:property value="%{annonce.titre}"/></h3>
							<div>																											
											<!-- <h3><a href="#" id="cloturer?annonceId=<s:property value="%{annonce.id}"/>">Cloturer</a></h3>
											<h3><a href="#" id="supprimer.action?annonceId=<s:property value="%{annonce.id}"/>">Supprimer</a></h3>
											<h3><a href="#" id="modifier.action?annonceId=<s:property value="%{annonce.id}"/>">Modifier</a></h3>
											<h3><a href="#" id="signaler.action?annonceId=<s:property value="%{annonce.id}"/>">Signaler</a></h3>																											
											<h3><a href="#" id="advertise.action?annonceId=<s:property value="%{annonce.id}"/>">faire de la publicité</a></h3>
											 -->
							</div>							
						</div> 	
				<script>

			//rating java script
			$(document).ready(function() {
				
						$('.star').click(
						function() {																								
									$('#evaluerLink').show();
								});						
						$('#evaluerLink').click(
								function() {								
								$.ajax({
										type : "GET",
										url : "evaluer.action?note="
												+ $('input:radio[name=star1]:checked').val()
												+ "&annonceId=" + <s:property value="annonceId"/>,
										error : function(msg) {
											alert("error lors de l'évaluation");
										},
										success : function(data) {
											$('#avgValue').html(data);											
											$('#evaluateControl').hide();
										}
									});
								});
					});
										
			//fin rating java script
			</script>															
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
					<s:if test="%{annonce.type == \"E\"}">
						<p><span style="font-weight: 800">Type de l'évenement : </span><s:property value="%{annonceExtraInfos[1]}"/></p>	
						<p><span style="font-weight: 800">Date : </span><s:property value="%{annonceExtraInfos[2]}"/></p>
						<p><span style="font-weight: 800">Heure : </span><s:property value="%{annonceExtraInfos[3]}"/></p>
					</s:if>
					<s:if test="%{annonce.type == \"V\"}">
						<p><span style="font-weight: 800">Prix : </span><s:property value="%{annonceExtraInfos[1]}"/> Dhs</p>
						<s:if test="%{annonceExtraInfos[2] == 1}">
							<p>Négociable</p>
						</s:if>
						<s:if test="%{annonceExtraInfos[2] == 0}">
							<p>Non Négociable</p>
						</s:if>							
					</s:if>
					<s:if test="%{annonce.type == \"OE\"}">
						<p><span style="font-weight: 800">Poste : </span><s:property value="%{annonceExtraInfos[1]}"/></p>
						<p><span style="font-weight: 800">Compètences : </span><s:property value="%{annonceExtraInfos[2]}"/></p>
						<p><span style="font-weight: 800">Type du contrat : </span><s:property value="%{annonceExtraInfos[3]}"/></p>
						<p><span style="font-weight: 800">Salaire : </span><s:property value="%{annonceExtraInfos[4]}"/> Dhs</p>						
					</s:if>
					<s:if test="%{annonce.type == \"OS\"}">
						<p><span style="font-weight: 800">Compètences : </span><s:property value="%{annonceExtraInfos[1]}"/></p>
						<p><span style="font-weight: 800">Durée : </span><s:property value="%{annonceExtraInfos[2]}"/></p>
						<s:if test="%{annonceExtraInfos[3] == 1}">						
							<p>Stage rémunéré</p>
						</s:if>
						<s:if test="%{annonceExtraInfos[3] == 0}">
							<p>Stage non rémunéré</p>
						</s:if>
						<p><span style="font-weight: 800">Rémuneration : </span><s:property value="%{annonceExtraInfos[4]}"/> Dhs</p>							
						<s:if test="%{annonceExtraInfos[5] == 1}">						
							<p>Préembauche</p>
						</s:if>						
					</s:if>
					<p style="font-weight: 800">Description</p>
					<p><s:property value="%{annonce.description}"/></p>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<table>
					   <tr>
							<td><img src="template/images/marker.png" /></td>
							<td><h3><a href="#" id="voirPosition">Position géographique</a></h3></td>
					   </tr>	
					</table>					
					<div class="commentairesContainer">
						<h3>Liste des commentaires</h3>
						<div id="CommentsContainer">																					
							<s:iterator value="commentaires" var="resultObject">
							<div class="commentaire" style="margin-bottom: 20px;"><p><span class="auteur"><s:property value="#resultObject[1]"/></span> a dit :<br/><span class="contenu"><s:property value="#resultObject[0]"/></span></p></div>
							</s:iterator>	
							<form id="addCommentForm" method="post" action="">
								<p  style="float:right;">Nouveau commentaire</p>
								<s:textarea name="contenu" id="msgTxt"
									placeholder="Commentez cette annonce !" cols="80" rows="4" />
								<s:submit id="submit" value="Envoyer" />								
							</form>							
						</div>										
					</div>

<s:textfield type="hidden" id="annonceId" value="%{annonceId}" />

					<script>						
					//commentaire javascript
						$('#addCommentForm').submit(function(e) {
							e.preventDefault();
						
							$.ajax({
								type : "GET",
								url : "commenter.action?contenu=" + $("#msgTxt").val()+"&annonceId="+ $("#annonceId").val(),
								error : function(msg) {
									$('#commentaire').html("Error !: " + msg);
								},
								success : function(data) {
									//alert(data);
									//affiche le contenu du fichier dans le conteneur dédié
									$("#CommentsContainer").append(data).fadein();
									//$('#commentaire').html(data).insertBefore('#commentaire').slideDown();
								}
							});
						});
						//fin commentaire javascript
					</script>
				</td>
			</tr>
		</table>
	</div>
</div>

<div id="topGrayLayer1" class="topGrayLayer">
		<div id="mapDiv">
			<div id="mapa"></div>
			<div class="eventtext">				
				<div id="mapDivBottomBar">
					<p>						
						<!-- BEGIN condition for user marker-->
						<s:if test="%{#session.utilisateur!=null}">
						<a href="#" id="centerMapOnUserPos">Centrer sur votre position</a>&nbsp;|&nbsp;
						</s:if>						
						<a href="#" id="centerMapOnAnnoncePos">Centrer sur la position de l'annonce</a>						
						<span id="GMapRightActions"><a href="#" id="GMapCancel">Fermer</a></span>
					</p>
				</div>				
			</div>
		</div>
	</div>
	<script type="text/javascript">
				
		var GMapInitialized = false;
		<!-- BEGIN condition for user marker-->
		<s:if test="%{#session.utilisateur!=null}">
		var userLatitude  = <s:property value="%{#session.utilisateur.userPositionGeographique.latitude}"/>;
		var userLongitude = <s:property value="%{#session.utilisateur.userPositionGeographique.longitude}"/>;
		var userIcon = new GIcon(G_DEFAULT_ICON);		
		userIcon.image = "template/images/GMap/markers/user.png";		
		var userMarkerOptions = { icon:userIcon, width:24, height:21};
		var UserMarker = new GMarker(new GLatLng(userLatitude,userLongitude),userMarkerOptions);
		</s:if> 
		<!-- END condition for user marker-->
		var annonceLatitude = <s:property value="%{annonce.positionGeographique.latitude}"/>;
		var annonceLongitude = <s:property value="%{annonce.positionGeographique.longitude}"/>;
		var annonceIcon = new GIcon(G_DEFAULT_ICON);
		annonceIcon.image = "template/images/GMap/markers/annonce.png";		
		var annonceMarkerOptions = { icon:annonceIcon , width:24, height:21};
		var AnnonceMarker = new GMarker(new GLatLng(annonceLatitude,annonceLongitude),annonceMarkerOptions);
		var doubleClick = false;
		var GMap = null;
		var GMapControlMode = 1; // 1: ZoomMode, 2: SelectPositionMode
		function initGMap(){		
			if (GBrowserIsCompatible()) {
				map = new GMap2(document.getElementById("mapa"));				
				map.addControl(new GLargeMapControl());
				map.addControl(new GMapTypeControl(3));
				map.setCenter(new GLatLng(annonceLatitude,annonceLongitude ), 11, 0);
				map.setZoom(8);								
				<!-- BEGIN condition for user marker-->
				<s:if test="%{#session.utilisateur!=null}">
				map.addOverlay(UserMarker);
				</s:if>
				map.addOverlay(AnnonceMarker);
				//map.setOptions({disableDoubleClickZoom:true});
				GMap = map;
				GEvent.addListener(map,'dblclick', function(overlay, point) {
					//doubleClick = true;
			    });
				GEvent.addListener(map, 'click', function(overlay, point) {								
				});			
			}
		}	
		$("#voirPosition").click(function () {
  			$("#topGrayLayer1").fadeIn(500);
  			if(GMapInitialized == false){
				initGMap();
				GMapInitialized = true;
			} 	
		});
		$("#GMapCancel").click(function () {
			$("#topGrayLayer1").fadeOut(300);
		});		
		<!-- BEGIN condition for user marker-->
		<s:if test="%{#session.utilisateur!=null}">
		$("#centerMapOnUserPos").click(function () {
			map.setCenter(new GLatLng(userLatitude,userLongitude ), 6, 0);			
		});
		</s:if>
		$("#centerMapOnAnnoncePos").click(function () {
			map.setCenter(new GLatLng(annonceLatitude,annonceLongitude ), 6, 0);			
		});			
	</script>

<!-- END CONTAINER -->

<!-- END : page body content -->

<!-- Include the footer -->
<jsp:include page="footer.jsp" />