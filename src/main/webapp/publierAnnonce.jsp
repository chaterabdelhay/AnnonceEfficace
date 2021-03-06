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
					<s:form action="publierAnnonce.action" theme="css_xhtml" enctype="multipart/form-data">
						<input type="hidden" name="type" value="<s:property value="%{type}" />"/>
						<table>
							<tr>
								<td colspan="2">
									<h1>
										<span class="log-in">Publier une annonce</span>
									</h1>
								</td>
							</tr>
							<tr>
								<td colspan="2">
									<s:iterator value="errorMessages" id="errorMsg">
										<p style="color: red;">											
											<s:property value="%{#errorMsg}" /><p>
										
									</s:iterator>										
										<s:if test="%{errorMessages.size > 0}">
										<hr />											
										</s:if>
								</td>

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
											<label for="titre">Titre</label>
											<s:textfield name="titre" maxlength="30" id="titre"
												placeholder="Titre de l'annonce" />
										</p>
										<p>
											<label for="password">Description</label>
											<s:textfield name="description" 
												id="description" placeholder="Desription"/>
										</p>
										<p>
											<s:if test="%{type == \"E\" || type == 'OE' || type == 'OS'}">
											<label for="titre">image</label>
											<s:file name="imageObjet"/>		
											</s:if>									
										</p>																												
										<p><a href="#" id="setPosition">Selectionner la position</a></p>
										<s:hidden name="posGeoLatitude" id="posGeoLatitude" value=""/>
										<s:hidden name="posGeoLongitude" id="posGeoLongitude" value=""/>																																					
										<p class="clearfix">
											<input type="submit" value="Créer">
										</p>																				
									
								</td>
								<s:if test="%{type == \"V\"}">								
								<td style="padding-left:50px;">
									<p>
											<label for="categorieObjet">Catègorie</label>
											<s:select headerKey="-1" headerValue="Selectionnez"
												list="#{'1':'Ordinateur', '2':'Télephone','3':'Moto','4':'Voiture','5':'Autre'}"
												name="categorieObjet" />
										</p>
										<p>
											<label for="titre">Nom</label>
											<s:textfield name="nomObjet" maxlength="30" id="titre"
												placeholder="Nom de l'objet" />
										</p>
										<p>
											<label for="titre">image</label>
											<s:file name="imageObjet" label="image"/>																						
										</p>
										<p>
											<label for="titre">description</label>
											<s:textfield name="descriptionObjet" id="titre"
												placeholder="descripotion de l'objet" />
										</p>	
										<p>
											<label for="poste">Prix (ex: 1500,00)</label>
											<s:textfield name="prix" id="titre"
												placeholder="Le prix" />
										</p>
										<p>											
											 <s:checkbox name="negociable" fieldValue="false" label="Négociable"/>																		
										</p>																		
								</td>
								</s:if>	
								<s:if test="%{type == \"E\"}">								
								<td style="padding-left:50px;">
									<p>
											<label for="typeEvenement">Type de l'évenement</label>
											<s:select headerKey="-1" headerValue="Selectionnez"
												list="#{'Séminaire':'Séminaire', 'Conférence':'Conférence' ,'Culturel':'Culturel', 'Festival':'Festival','Autre':'Autre'}"
												name="typeEvenement" />
										</p>
										<p>
											<label for="dateEvenement">Date</label>
											<s:date name="currentDate" var="formattedDate" format="dd/MM/yyyy"/> 
											<s:textfield name="dateEvenement" value="%{formattedDate}"/>											
										</p>
										<p>
											<label for="heureEvenement">Heure (ex: 10:30:00)</label>
											<s:textfield name="heureEvenement" id="titre"/>											
										</p>																		
								</td>
								</s:if>										
								<s:if test="%{type == \"OE\"}">								
								<td style="padding-left:50px;">
										<p>
											<label for="poste">Poste</label>
											<s:textfield name="poste" maxlength="30" id="titre"
												placeholder="Le poste" />
										</p>
										<p>
											<label for="competences">Competences</label>
											<s:textfield name="competences" maxlength="30" id="titre"
												placeholder="Les compètences" />
										</p>
										<p>
											<label for="dateEvenement">Type de contrat</label>
											<s:select headerKey="-1" headerValue="Selectionnez"
												list="#{'CDI':'CDI', 'CTP':'CTP'}"
												name="typeContrat" />
										</p>
										<p>
											<label for="heureEvenement">Salaire</label>
											<s:textfield name="salaire" id="titre"
												placeholder="Le salaire" />											
										</p>																		
								</td>
								</s:if>
								<s:if test="%{type == \"OS\"}">								
								<td style="padding-left:50px;">										
										<p>
											<label for="competences">Competences</label>
											<s:textfield name="competences" maxlength="30" id="titre"
												placeholder="Les compètences" />
										</p>
										<p>
											<label for="poste">Durée</label>
											<s:textfield name="duree" maxlength="30" id="titre"
												placeholder="La durée du stage" />
										</p>
										<p>
											Rémuneration : <s:checkbox name="remuneration" fieldValue="false"/>
										</p>
										<p>
											<label for="poste">Montant</label>
											<s:textfield name="montant" maxlength="30" id="titre"
												placeholder="Le montant" />
										</p>
										<p>											
											Préembauche : <s:checkbox name="preembauche" fieldValue="false"/>								
										</p>																		
								</td>
								</s:if>								
							</tr>
						</table>
					  </s:form>	
					</div>
				</td>
			</tr>
		</table>

	</div>
	<div id="topGrayLayer1" class="topGrayLayer">
		<div id="mapDiv">
			<div id="mapa"></div>
			<div class="eventtext">				
				<div id="mapDivBottomBar">
					<p>
						<span><a href="#" id="GMapGetCurrentPos">Position actuelle</a></span>
						<span id="selectedLatitude" style="display:none;"></span><span id="selectedLongitude" style="display:none;"></span>&nbsp;|&nbsp;
						<a href="#" id="centerMapOnSelectPos">Centrer sur la position selectionnée</a>&nbsp;|&nbsp;
						<a href="#" id="ZoomMode" title="Double click pour zoomer" style="font-weight:800">Mode zoom</a>&nbsp;|&nbsp;
						<a href="#" id="SelectPositionMode" title="Click pour choisir la position">Mode selection de position</a>						
						<span id="GMapRightActions"><a href="#" id="GMapCancel">Fermer</a>&nbsp;|&nbsp;<a href="#" id="GMapConfirmPosition">Confirmer</a></span>
					</p>
				</div>				
			</div>
		</div>
	</div>
	<script type="text/javascript">
		var GMapInitialized = false;
		var initLatitude  = <s:property value="%{#session.utilisateur.userPositionGeographique.latitude}"/>;
		var initLongitude = <s:property value="%{#session.utilisateur.userPositionGeographique.longitude}"/>;
		var drawnMarker = new GMarker(new GLatLng(initLatitude,initLongitude));
		var doubleClick = false;
		var GMap = null;
		var GMapControlMode = 1; // 1: ZoomMode, 2: SelectPositionMode
		function initGMap(){		
			if (GBrowserIsCompatible()) {
				map = new GMap2(document.getElementById("mapa"));				
				map.addControl(new GLargeMapControl());
				map.addControl(new GMapTypeControl(3));
				map.setCenter(new GLatLng(initLatitude,initLongitude ), 11, 0);
				map.setZoom(8);				
				document.getElementById('selectedLatitude').innerHTML = initLatitude;
				document.getElementById('selectedLongitude').innerHTML = initLongitude;
				map.addOverlay(drawnMarker);
				//map.setOptions({disableDoubleClickZoom:true});
				GMap = map;
				GEvent.addListener(map,'dblclick', function(overlay, point) {
					//doubleClick = true;
			    });
				GEvent.addListener(map, 'click', function(overlay, point) {
					//if(doubleClick){
					//	doubleClick = false;
					//	return;
					//}
					if(!(GMapControlMode == 2)){
						return;
					}
					var answer = confirm("Modifer l'emplacement de l'annonce vers le nouveau point selectionné ?\n--------------------------------------------------------\nPS : Si vous voulez naviguer dans la carte vous devez maitenir le button gauche de la souris enfoncé et déplacer la souris")
					if (answer){
						map.removeOverlay(drawnMarker)
						newMarker = new GMarker(point)
						map.addOverlay(newMarker);
						drawnMarker = newMarker;
						// we should replace the '.' separtor décimal to ',' or they will invalidated (implicitement) by Struts2
						document.getElementById('selectedLatitude').innerHTML = String(point.lat()).replace('.',',');
						document.getElementById('selectedLongitude').innerHTML = String(point.lng()).replace('.',',');
						//alert('we should save the new position using ajax');
					}	
				});			
			}
		}						
							
		$("#setPosition").click(function () {
  			$("#topGrayLayer1").fadeIn(500);
  			if(GMapInitialized == false){
				initGMap();
				GMapInitialized = true;
			} 	
		});
		$("#GMapGetCurrentPos").click(function () {
			alert(initLatitude + "," + initLongitude);
		});
		$("#GMapCancel").click(function () {
			$("#topGrayLayer1").fadeOut(300);
		});
		$("#ZoomMode").click(function () {
			GMapControlMode = 1;
			$("#SelectPositionMode").css("font-weight","400");
			$("#ZoomMode").css("font-weight","800");
		});
		$("#SelectPositionMode").click(function () {
			GMapControlMode = 2;
			//GMap.setOptions({draggableCursor:'crosshair'});
			$("#SelectPositionMode").css("font-weight","800");
			$("#ZoomMode").css("font-weight","400");
		});	
		$("#centerMapOnSelectPos").click(function () {
			map.setCenter(new GLatLng(initLatitude,initLongitude ), 6, 0);
		});	
		$("#GMapConfirmPosition").click(function () {
			$("#posGeoLatitude").val($("#selectedLatitude").html());
			$("#posGeoLongitude").val($("#selectedLongitude").html());
  			$("#topGrayLayer1").fadeOut(300);  			
		});	
	</script>

	 <!-- begin .grid_12 - COMMENTS -->
     <div id="strip" class="grid_12">
         <img id="users" src="template/images/users.png" alt=""/>
         <ul id="comments">
             <li>"Choisir un bon titre pour son annonce serait un atout majeur pour pousser les internautes à consulter votre annonce."</li>
             <li>"L'image que vous joignez à votre annonce est à choisir avec attention car sa qualité peut rendre votre annonce encore plus efficace."</li>
         </ul>
     </div><!-- end .grid_12 -->

</div>
<!-- END CONTAINER -->

<!-- END : page body content -->
<!-- Include the footer -->
<jsp:include page="footer.jsp" />