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
					<p>
						<span style="font-weight: 800">Type de l'annonce : <s:property value="%{typeAnnonce}"/><br/>Titre : <s:property value="%{annonce.titre}"/></span>
						<div>
							<table cellpadding="4" style="display: inline; margin-left:5px;">
								<tr>									
									<td>
											<h3><a href="#" id="voirPosition">Position géographique</a></h3>
										</td>
									<td><img src="template/images/marker.png" /></td>
								</tr>
							</table>
						</div>
						<span style="float: right">																				
		
		<s:if test="%{!evaluatedByUser}">
		<s:if test="%{userConnected}">
		

							
	<div id="rating_cont">	
	

		<div id="rating_btns">
			<ul>
				<li>0.5</li>
				<li>1.0</li>
				<li>1.5</li>
				<li>2.0</li>
				<li>2.5</li>
				<li>3.0</li>
				<li>3.5</li>
				<li>4.0</li>
				<li>4.5</li>
				<li>5.0</li>
			</ul>
		</div>
		<script>

			//rating java script
			$(document).ready(
					function() {

						// hover
						$('#rating_btns li').hover(function() {
							$rating = $(this).text();
							$('#rating_on').css('width', rateWidth($rating));
						});

						// mouseout
						$('#rating_btns li').mouseout(
								function() {

									$rating = $('#rating').text();
									if ($rating == "not rated") {
										$('#rating_on').css('width', "0px");
									} else {
										$('#rating_on').css('width',
												rateWidth($rating));
									}
								});

						//click
						$('#rating_btns li').click(
								function() {
									$rating = $(this).text();
									$('#rating').text($rating);
									$('#rating_output').val($rating);
									$pos = starSprite($rating);
									$('#small_stars').css(
											'background-position',
											"0px " + $pos);

									$('#rated').fadeIn();
									$('#rating_btns').hide();
$('#rating_on').hide();
$.ajax({
										type : "GET",
										url : "evaluer.action?note="
												+ parseFloat($rating)
												+ "&annonceId=" + <s:property value="annonceId"/>,
										error : function(msg) {
											alert("non ajoute");
										},
										success : function(data) {
											$('#avg').html(data);
											alert($rating);
										}
									});
								});

						function rateWidth($rating) {

							$rating = parseFloat($rating);
							switch ($rating) {
							case 0.5:
								$width = "14px";
								break;
							case 1.0:
								$width = "28px";
								break;
							case 1.5:
								$width = "42px";
								break;
							case 2.0:
								$width = "56px";
								break;
							case 2.5:
								$width = "70px";
								break;
							case 3.0:
								$width = "84px";
								break;
							case 3.5:
								$width = "98px";
								break;
							case 4.0:
								$width = "112px";
								break;
							case 4.5:
								$width = "126px";
								break;
							case 5.0:
								$width = "140px";
								break;
							default:
								$width = "84px";
							}
							return $width;
						}

						function starSprite($rating) {

							$rating = parseFloat($rating);
							switch ($rating) {
							case 0.5:
								$pos = "-11px";
								break;
							case 1.0:
								$pos = "-22px";
								break;
							case 1.5:
								$pos = "-33px";
								break;
							case 2.0:
								$pos = "-44px";
								break;
							case 2.5:
								$pos = "-55px";
								break;
							case 3.0:
								$pos = "-66px";
								break;
							case 3.5:
								$pos = "-77px";
								break;
							case 4.0:
								$pos = "-88px";
								break;
							case 4.5:
								$pos = "-99px";
								break;
							case 5.0:
								$pos = "-110px";
								break;
							//default:  $pos =  "-77px";
							}
							return $pos;
						}

					});
			//fin rating java script
		</script>
		<div id="rating_on" >&nbsp;</div>
		<div id="rated">
			<div id="rating" style="height: 17px; line-height: 17px;"><s:property value="average"/></div>
			<div> - &nbsp;</div>
			<div id="small_stars">&nbsp;</div>			
		</div>
		</div>
		</s:if>
		</s:if>		
	
	
	<input type="hidden" id="rating_output" name="rating_output" value="not rated" />
</div>	 
		<span id="avg" style="float:right;">Evaluation moyenne : <s:property value="average"/></div> </span>			
						
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
					<div class="commentairesContainer">
						<h3>Liste des commentaires</h3>
						<div id="addCommentContainer">																					
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
									//alert("msg sended");
									//affiche le contenu du fichier dans le conteneur dédié
									$("<div>").html(data).insertAfter("#commentaire").hide().slideDown("slow");
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