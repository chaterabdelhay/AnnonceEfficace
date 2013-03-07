<!-- Include the header -->
<jsp:include page="header.jsp" />
<%@ taglib prefix="s" uri="/struts-tags" %>
<!-- BEGIN : page body content -->

<!-- BEGIN CONTAINER -->
<div class="container_12">	   
    <br/><br/><br/><br/><br/>  
    <div id="hiddenValues" style="display:none">
    	<input type="hidden" id="currentPosGeoLatitude" name="currentPosGeoLatitude" value="<s:property value="posGeoLatitude"/>"/>
    	<input type="hidden" id="currentPosGeoLongitude" name="currentPosGeoLongitude" value="<s:property value="posGeoLongitude"/>"/>
    	<input type="hidden" id="currentAnnonceType" name="currentAnnonceType" value="All"/>
    </div>    
	<div id="updatePosition">
		<table cellpadding="4" style="display:inline;">
	      <tr>
	       <td><img src="template/images/marker.png"/></td>
	       <td><p>&nbsp;<a href="#" id="setPosition">Modifier votre emplacement</a></p></td>
	       <s:if test="%{#session.utilisateur!=null}">
	       <td>&nbsp;&nbsp;&nbsp;<img src="template/images/gmap.png"/></td>
	       <td><p>&nbsp;&nbsp;<a href="GMapAnnoncesExplorer">Explorer avec Google Maps</a></p></td>	       
	       <td style="width:410px"></td>
	       <td><img src="template/images/search.png"/></td>
	       <td><p><a id="searchTool" href="#">Outil recherche</a></p></td>
	       </s:if>
	       <s:if test="%{#session.utilisateur==null}">
	       <td style="width:640px"></td>
	       <td><img src="template/images/search.png"/></td>
	       <td><p><a id="searchTool" href="#">Outil recherche</a></p></td>
	       </s:if>
		  </tr>
		</table>		
	</div>
    <!-- begin boxes -->
    <div id="boxes">    	                   
        <s:if test="%{posGeoLatitude == null}">
        	<p>Le système n'arrive pas à charger votre position géographique, <a href="#" id="unauthenifiedUserSetPosition">Selectionnez la position</a> où vous voulez trouver des annonces. Et le système va vous chercher les annonces les plus proches de vous.</p>
        	<script>
        	$("#unauthenifiedUserSetPosition").click(function() {
        		$("#topGrayLayer1").fadeIn(500);
        		if (GMapInitialized == false) {
        			initGMap();
        			GMapInitialized = true;
        		}
        	});
        	</script>
        </s:if>           	
    	<s:iterator value="annonces" var="resultObject">               
			<div class="grid_3">
				<a href="uploadedImage/objet/<s:property value="#resultObject[0].objet.image"/>"
					title="Maecenas pharetra egestas adipiscing." class="colorbox"><img
					class="boxImage tiptop" src="uploadedImage/objet/<s:property value="#resultObject[0].objet.image"/>" alt=""
					title="&plusmn;&nbsp;zoom" width="222px" height="142px"/></a>
				<h3><s:property value="#resultObject[0].titre"/></h3>
				<h3>distance : <s:property value="#resultObject[1]"/></h3>
				<p><a href="detailsAnnonce.action?annonceId=<s:property value="#resultObject[0].id"/>&type=<s:property value="#resultObject[0].type"/>">Consulter</a></p>
			</div>                    
        </s:iterator>
     </div><!-- end boxes -->    	        	    
</div><!-- END CONTAINER -->
<!-- BEGIN GMapLayer -->
<div id="topGrayLayer1" class="topGrayLayer">
	<div id="mapDiv">
		<div id="mapa"></div>
		<div class="eventtext">
			<div id="mapDivBottomBar">
				<p>
					<span style="font-weight: 800;">Position actuelle : </span>
					<span id="selectedLatitude"></span>;<span id="selectedLongitude"></span>
					<span id="GMapRightActions"><a href="#" id="GMapCancel">Fermer</a>&nbsp;|&nbsp;<a href="#" id="GMapConfirmPosition">Confirmer</a></span>
				</p>
			</div>
		</div>
	</div>
</div>

<div id="topGrayLayer2" class="topGrayLayer">
	<div id="mapDiv">
		<div class="whiteBG" style="margin-top:200px; padding: 10px;">				     	    
			<p><a id="link0" href="#">Toutes les annonces</a></p>
			<p><a id="link1" href="#">Annonces de vente</a></p>			
			<p><a id="link2" href="#">Evenements</a></p>
			<p><a id="link3" href="#">Offres d'emploi</a></p>
			<p><a id="link4" href="#">Offres de stages</a></p>
			<br/>			
 			<h3><a href="#" id="searchToolClose">Fermer</a></h3>
			<script>
			function ajaxGetListAnnonces() {
				if($("#currentPosGeoLatitude").val() == '' || $("#currentPosGeoLongitude").val() == ''){
					alert("Vous devez d'abord selectionner votre postion depuis la carte");
					return;
				}
				$('#boxes').html('<center>Chargement en cours...<br/><img width="24" height="24" src="template/images/load.gif"/></center>');
				$.ajax({
							type : "GET",
							url : "ajax_getListeAnnonces.action?type=" + $("#currentAnnonceType").val() + "&posGeoLatitude=" + $("#currentPosGeoLatitude").val() +
								  "&posGeoLongitude=" + $("#currentPosGeoLongitude").val(),
							error : function(msg) {
								$('#boxes').html("Error !: " + msg);
							},
							success : function(data) {
								//affiche le contenu du fichier dans le conteneur indique
								$('#boxes').html(data);															
							}
						});
			}
			$("#link0").click(	function(){
				$("#currentAnnonceType").val("All");
				ajaxGetListAnnonces();
				$("#topGrayLayer2").fadeOut(500);
			});	
			$("#link1").click(	function(){
							$("#currentAnnonceType").val("V");
							ajaxGetListAnnonces();
							$("#topGrayLayer2").fadeOut(500);
			});				
			$("#link2").click(	function(){
					$("#currentAnnonceType").val("E");
					ajaxGetListAnnonces();
					$("#topGrayLayer2").fadeOut(500);
			});	
			$("#link3").click(	function(){
					$("#currentAnnonceType").val("OE");
					ajaxGetListAnnonces();
					$("#topGrayLayer2").fadeOut(500);										
			});	
			$("#link3").click(	function(){
					$("#currentAnnonceType").val("OS");
					ajaxGetListAnnonces();
					$("#topGrayLayer2").fadeOut(500);										
			});	
			// related to : explorer les annonces using GMap 
			function ajaxLoadGoogleMapAnnoncesExplorer() {			
				$('#boxes').html('<center>Chargement en cours...<br/><img width="24" height="24" src="template/images/load.gif"/></center>');
				$.ajax({
							type : "GET",
							url : "ajax_useGMapAnnoncesExplorer.action",
							error : function(msg) {
								$('#boxes').html("Error !: " + msg);
							},
							success : function(data) {
								//affiche le contenu du fichier dans le conteneur d�di�
								$('#boxes').html(data);															
							}
						});
			}
			$("#toggleUseGMap").click(	function(){
				ajaxLoadGoogleMapAnnoncesExplorer();
			});				
			</script>			    		
 		</div>		
	</div>
</div>
<script type="text/javascript">
	var GMapInitialized = false;
	<s:if test="%{#session.utilisateur!=null}">
	var userLatitude  = <s:property value="%{#session.utilisateur.userPositionGeographique.latitude}"/>;
	var userLongitude = <s:property value="%{#session.utilisateur.userPositionGeographique.longitude}"/>;	
	</s:if> 
	<s:if test="%{#session.utilisateur==null}">
	var userLatitude  = 33.742612777346885;
	var userLongitude = -6.053466796875;
	</s:if> 
	var userIcon = new GIcon(G_DEFAULT_ICON);		
	userIcon.image = "template/images/GMap/markers/user.png";		
	var userMarkerOptions = { icon:userIcon};
	var UserMarker = new GMarker(new GLatLng(userLatitude,userLongitude),userMarkerOptions);
	function initGMap() {
		if (GBrowserIsCompatible()) {
			map = new GMap2(document.getElementById("mapa"));
			map.addControl(new GLargeMapControl());
			map.addControl(new GMapTypeControl(3));
			map.setCenter(new GLatLng(userLatitude, userLongitude), 4, 0);
			map.setZoom(8);
			document.getElementById('selectedLatitude').innerHTML = userLatitude;
			document.getElementById('selectedLongitude').innerHTML = userLatitude;
			<s:if test="%{#session.utilisateur!=null}">
			map.addOverlay(UserMarker);
			</s:if>
			GEvent.addListener(map, 'click', function(overlay, point) {
				document.getElementById('selectedLatitude').innerHTML = point.lat();
				document.getElementById('selectedLongitude').innerHTML = point.lng();
				if(UserMarker != null)
					map.removeOverlay(UserMarker);
				newMarker = new GMarker(point,userMarkerOptions);
				map.addOverlay(newMarker);
				UserMarker = newMarker;
			});
		}
	}	
	$("#setPosition").click(function() {
		$("#topGrayLayer1").fadeIn(500);
		if (GMapInitialized == false) {
			initGMap();
			GMapInitialized = true;
		}
	});
	$("#GMapCancel").click(function () {
		$("#topGrayLayer1").fadeOut(300);
	});

	$("#GMapConfirmPosition").click(function() {
		$("#currentPosGeoLatitude").val($("#selectedLatitude").html());
		$("#currentPosGeoLongitude").val($("#selectedLongitude").html());
		ajaxGetListAnnonces();
		$("#topGrayLayer1").fadeOut(300);
	});
	
	$("#searchTool").click(function() {		
		$("#topGrayLayer2").fadeIn(300);
	});
	
	$("#searchToolRun").click(function() {
		alert("Utiliser Ajax");
		$("#topGrayLayer2").fadeOut(300);
	});
	
	$("#searchToolClose").click(function() {		
		$("#topGrayLayer2").fadeOut(300);
	});
</script><!-- END GMapLayer -->
<!-- END : page body content -->

<!-- Include the footer -->
<jsp:include page="footer.jsp" />