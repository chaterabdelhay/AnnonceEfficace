<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!-- Include the header -->
<jsp:include page="header.jsp" />

<!-- BEGIN : page body content -->

<div id="sideBar">
	<img id="quickMenu" src="template/images/sideMenu.png" />
</div>

<!-- BEGIN CONTAINER -->
<div class="container_12">
	<br /> <br /> <br />
	<div style="margin-left: 160px;">
		<table id="login">
			<tr>
				<td>
					<div class="form-2">
						<table>
							<tr  valign="top">
								<td>
									<s:form action="login" theme="css_xhtml" style="width:350px">
										<h1>
											<span class="log-in">Création de compte</span>
										</h1>
										<p>
											<label for="typeAnnonce">Type</label>
											<select id="typeAnnonce" name="field_nomville_value">
												<option value="">Vente</option>
												<option value="">Evenement</option>
												<option value="">Offre d'emploi</option>
												<option value="">Offre de stage</option>
											</select>
										</p>	
										<p>
											<label for="login">Titre</label>
											<s:textfield name="username" maxlength="20" id="username"
												placeholder="Titre de l'annonce" />
										</p>
										<p>
											<label for="password">Description</label>
											<s:textfield type="password" name="password" maxlength="20"
												id="username" placeholder="Mot de passe" class="showpassword" />
										</p>																												
										<p><a href="#" id="setPosition">Selectionner la position</a></p>																																													
										<p class="clearfix">
											<input type="submit" value="Créer">
										</p>
									</s:form>
								</td>
								<td>
									
								</td>							
							</tr>
						</table>
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
					<p><span style="font-weight:800;">Position actuelle : </span><span id="latlongclicked"></span><a href="#"  id="GMapConfirmPosition">Confirmer</a></p>
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
				document.getElementById('latlongclicked').innerHTML = initLatitude + ', ' + initLongitude;
				GEvent.addListener(map, 'click', function(overlay, point) {
					document.getElementById('latlongclicked').innerHTML = point.lat() + ', ' + point.lng();
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
		
		$("#GMapConfirmPosition").click(function () {
  			$("#topGrayLayer1").fadeOut(300);  			
		});	
	</script>

	<!-- begin .grid_12 - COMMENTS -->
	<div id="strip" class="grid_12">
		<img id="users" src="template/images/users.png" alt="" />
		<ul id="comments">
			<li>"Maecenas pharetra egestas adipiscing. Nullam consequat
				velit in felis sodales in facilisis justo fringilla. Pellentesque
				nec lobortis dolor. Praesent et mi eu magna dapibus condimentum."<br />
				<span class="signature">John Doe - 4 October 2011</span>
			</li>
			<li>"Ut dapibus fringilla volutpat. Sed ullamcorper augue nec
				risus facilisis eu venenatis metus tristique. In hac habitasse
				platea dictumst. Aenean at lacus urna. Donec pretium mattis
				gravida."<br /> <span class="signature">John Doe - 4 October
					2011</span>
			</li>
		</ul>
	</div>
	<!-- end .grid_12 -->

</div>
<!-- END CONTAINER -->

<!-- END : page body content -->
<!-- Include the footer -->
<jsp:include page="footer.jsp" />