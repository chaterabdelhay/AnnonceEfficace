<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!-- Include the header -->
<jsp:include page="header.jsp" />

<!-- BEGIN : page body content -->

<!-- BEGIN CONTAINER -->
<div class="container_12">
	<br /> <br /> <br /><br/><br/><br/>
	<div>
		<table>
			<tr>
				<td>
					<div style="width:800px">
					<s:form action="publierAnnonce" theme="css_xhtml" >
						<table>
							<tr>
								<td colspan="4">
									<h3>
										<span>Selectionnez le type de votre annonce</span>
									</h3>
									<br/>
								</td>
							</tr>
							<tr>
								<td>
									<a href="publierAnnonce.action?type=V">
										<img src="template/images/annonceType/vente.png"/>
									</a>
								</td>
								<td style="padding-left:20px">
									<a href="publierAnnonce.action?type=E">
										<img src="template/images/annonceType/evenement.png"/>
									</a>
								</td>
								<td  style="padding-left:20px">
									<a href="publierAnnonce.action?type=OE">
										<img src="template/images/annonceType/offreStage.png"/>
									</a>
								</td>																				
								<td  style="padding-left:20px">
									<a href="publierAnnonce.action?type=OS">
										<img src="template/images/annonceType/offreStage.png"/>
									</a>
								</td>														
							</tr>
							<tr>
								<td colspan="4">
									<br/>
								</td>
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
						<span style="font-weight:800;">Position actuelle : </span>
						<span id="selectedLatitude"></span>;<span id="selectedLongitude"></span>
						<a href="#" id="GMapCancel">Annuler</a>
						<a href="#" id="GMapConfirmPosition">Confirmer</a>
					</p>
				</div>				
			</div>
		</div>
	</div>
	<script type="text/javascript">
		var GMapInitialized = false;
		var initLatitude  = 32.99023555965106;
		var initLongitude = -7.3828125;
		function initGMap(){		
			if (GBrowserIsCompatible()) {
				map = new GMap2(document.getElementById("mapa"));				
				map.addControl(new GLargeMapControl());
				map.addControl(new GMapTypeControl(3));
				map.setCenter(new GLatLng(initLatitude,initLongitude ), 11, 0);
				map.setZoom(8);				
				document.getElementById('selectedLatitude').innerHTML = initLatitude;
				document.getElementById('selectedLongitude').innerHTML = initLongitude;
				GEvent.addListener(map, 'click', function(overlay, point) {
				document.getElementById('selectedLatitude').innerHTML = point.lat();
				document.getElementById('selectedLongitude').innerHTML = point.lng();
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
		$("#GMapCancel").click(function () {
			$("#topGrayLayer1").fadeOut(300);
		});
		$("#GMapConfirmPosition").click(function () {
			$("#posGeoLatitude").val($("#selectedLatitude").html());
			$("#posGeoLongitude").val($("#selectedLongitude").html());
  			$("#topGrayLayer1").fadeOut(300);  			
		});	
	</script>	
</div>
<br/><br/><br/><br/><br/>
<!-- END CONTAINER -->

<!-- END : page body content -->
<!-- Include the footer -->
<jsp:include page="footer.jsp" />