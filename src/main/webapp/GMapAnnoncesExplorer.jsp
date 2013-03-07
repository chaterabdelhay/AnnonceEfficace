<!-- Include the header -->
<jsp:include page="header.jsp" />
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
	       <td>&nbsp;&nbsp;&nbsp;<img src="template/images/listIcon.png"/></td>
	       <td><p>&nbsp;&nbsp;<a href="listeAnnonces">Liste normale</a></p></td>
	       <td style="width:715px"></td>
	       <td><img src="template/images/search.png"/></td>
	       <td><p><a id="searchTool" href="#">Outil recherche</a></p></td>
		  </tr>
		</table>		
	</div>
    <!-- begin boxes -->
    <div id="boxes">    

		<div style="width:960px; height:360px; margin:0px;">
			<div id="mapa" style="margin-top:0px;" class="blackBorder"></div>
			<div class="eventtext">				
				<div id="mapDivBottomBar">
					<p>						
						<!-- BEGIN condition for user marker-->
						<s:if test="%{#session.utilisateur!=null}">
						<a href="#" id="centerMapOnUserPos">Centrer sur votre position</a>&nbsp;|&nbsp;
						</s:if>						
						<a href="#" id="centerMapOnAnnoncePos">Centrer sur la position de l'annonce</a>												
					</p>
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
		var userMarkerOptions = { icon:userIcon};
		var UserMarker = new GMarker(new GLatLng(userLatitude,userLongitude),userMarkerOptions);		
		</s:if>								
		var annonceIcon = new GIcon(G_DEFAULT_ICON);
		annonceIcon.image = "template/images/GMap/markers/annonce.png";		
		var annonceMarkerOptions = { icon:annonceIcon };					
		var doubleClick = false;
		var GMap = null;
		var GMapControlMode = 1; // 1: ZoomMode, 2: SelectPositionMode
		function initGMap(){		
			if (GBrowserIsCompatible()) {
				map = new GMap2(document.getElementById("mapa"));				
				map.addControl(new GLargeMapControl());
				map.addControl(new GMapTypeControl(3));
				map.setCenter(new GLatLng(userLatitude,userLongitude ), 1, 0);
				map.setZoom(5);								
				// setting user marker
				<!-- BEGIN condition for user marker-->
				<s:if test="%{#session.utilisateur!=null}">				
				</s:if>
				// setting annonces marker
				<s:iterator value="annonces" var="resultObject">
				var AnnonceMarker = new GMarker(new GLatLng(<s:property value="#resultObject[0].positionGeographique.latitude"/>,<s:property value="#resultObject[0].positionGeographique.longitude"/>),annonceMarkerOptions);				
				map.addOverlay(AnnonceMarker);
				GEvent.addListener(AnnonceMarker, "click", function(point) {
				    var myHtml = '<h3><s:property value="#resultObject[0].titre"/><br/><a href="detailsAnnonce?annonceId=<s:property value="#resultObject[0].id"/>">Voir</a></h3>';				    
				    map.openInfoWindowHtml(point, myHtml);
				  });
				</s:iterator>
				map.addOverlay(UserMarker);								
				//map.addOverlay(AnnonceMarker);
				//map.setOptions({disab	leDoubleClickZoom:true});
				GMap = map;
				GEvent.addListener(map,'dblclick', function(overlay, point) {
					//doubleClick = true;
			    });
				GEvent.addListener(map, 'click', function(overlay, point) {								
				});			
			}
		}	
		initGMap();		
		$("#GMapCancel").click(function () {
			$("#topGrayLayer1").fadeOut(300);
		});		
		<!-- BEGIN condition for user marker-->
		<s:if test="%{#session.utilisateur!=null}">
		$("#centerMapOnUserPos").click(function () {
			map.setCenter(new GLatLng(userLatitude,userLongitude ), 6, 0);			
		});
		</s:if>		
	</script>
</div>
</div>	
<!-- Include the footer -->
<jsp:include page="footer.jsp" />