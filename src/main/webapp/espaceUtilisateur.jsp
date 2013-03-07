<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<!-- Include the header -->
<jsp:include page="header.jsp" />

<!-- BEGIN : page body content -->

<!-- BEGIN CONTAINER -->
<div class="container_12">	   
    <br/><br/><br/>      	   	    	
	<div style="margin:100px 0px 160px 10px;">
		<table id="login">
			<tr>
				<td>				
					<h2>Bienvenu dans votre espace personnel, M. <s:property value="%{#session.utilisateur.nomUtilisateur}"/></h2>					
					<h3>Votre Ville  : <s:property value="%{#session.utilisateur.ville.nom}"/></h3>
					<h3>Votre position géographique : [<s:property value="%{#session.utilisateur.userPositionGeographique.latitude}"/>, <s:property value="%{#session.utilisateur.userPositionGeographique.longitude}"/>]</h3>
					<p>Vous pouvez modifier votre emplacement géographique en utilisant la carte ci-dessous !</p>
					<div style="width:400px; height:300px; margin:0px;">
						<div id="mapa"></div>
					</div>
					<script type="text/javascript">
					//AJAX functions
					
					function ajaxSaveNewPosition(latitude,longitude) {
								var strLatitude = String(latitude);
								var strLongitude = String(longitude);
								//alert("ajax_saveNewPosition.action?posGeoLatitude=" + strLatitude.replace('.',',') + "&posGeoLongitude=" + strLongitude.replace('.',','));
								$.ajax({
										type : "GET",
										url : "ajax_saveNewPosition.action?posGeoLatitude=" + strLatitude.replace('.',',') + "&posGeoLongitude=" + strLongitude.replace('.',','),
										error : function(msg) {
											alert("error lors de l'évaluation");
										},
										success : function(data) {																																
											//alert('ssss');
										}
									});
								};
					
					// GMAP
		var GMapInitialized = false;
		var initLatitude  = <s:property value="%{#session.utilisateur.userPositionGeographique.latitude}"/>;
		var initLongitude = <s:property value="%{#session.utilisateur.userPositionGeographique.longitude}"/>;		
		var drawnMarker = new GMarker(new GLatLng(initLatitude,initLongitude));
		function initGMap(){		
			if (GBrowserIsCompatible()) {
				map = new GMap2(document.getElementById("mapa"));				
				map.addControl(new GLargeMapControl());
				map.addControl(new GMapTypeControl(3));
				map.setCenter(new GLatLng(initLatitude,initLongitude ), 11, 0);
				map.setZoom(6);				
				//document.getElementById('selectedLatitude').innerHTML = initLatitude;
				//document.getElementById('selectedLongitude').innerHTML = initLongitude;
								
				map.addOverlay(drawnMarker);
				GEvent.addListener(map, 'click', function(overlay, point) {
					//var map = new GMap2(document.getElementById("mapa"));
					var answer = confirm("Modifer votre position vers le nouveau point selectionné ?\n--------------------------------------------------------\nPS : Si vous voulez naviguer dans la carte vous devez maitenir le button gauche de la souris enfoncé et déplacer la souris")
					if (answer){
						map.removeOverlay(drawnMarker)
						newMarker = new GMarker(point)
						map.addOverlay(newMarker);
						drawnMarker = newMarker;
						// save the position to database
						ajaxSaveNewPosition(point.lat(), point.lng());
					}					
				});							
			}
		}	
		initGMap();		
		
		</script>					
				</td>
				<td>
					<div style="line-height:30px;width:250px; font-size:13px; margin-left:50px; color:#555">
						<!--<h2>Voici quelques détails...</h2><br/>
						
							<h3>Mes annonces</h3><br/>
							<h3>Les utilisateurs auxquels je suis abonné</h3><br/>
							<h3>Les notifications...</h3>
						 -->			
					</div>
				</td>
			</tr>
		</table>		
							
	</div>	   
</div><!-- END CONTAINER -->

<!-- END : page body content -->

<!-- Include the footer -->
<jsp:include page="footer.jsp" />