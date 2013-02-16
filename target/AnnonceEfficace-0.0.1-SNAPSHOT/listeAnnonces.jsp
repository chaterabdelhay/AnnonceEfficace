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
	       <td><p><a href="#" id="setPosition">Modifier votre position géographique</a></p></td>
	       <td style="width:605px"></td>
	       <td><img src="template/images/search.png"/></td>
	       <td><p><a id="searchTool" href="#">Outil recherche</a></p></td>
		  </tr>
		</table>		
	</div>
    <!-- begin boxes -->
    <div id="boxes">
    	<!--<div class="grid_3">
            <a href="template/images/slider/1.jpg" title="Maecenas pharetra egestas adipiscing." class="colorbox"><img class="boxImage tiptop" src="template/images/boxes/1.jpg" alt="" title="&plusmn;&nbsp;zoom" /></a>
                    
            <h3>Morbi fermentum sollicitudin diam vel vehicula</h3>
            <p>Maecenas pharetra egestas adipiscing. Nullam consequat velit in felis sodales in facilisis justo fringilla. Pellentesque nec lobortis dolor. Praesent et mi eu magna dapibus condimentum.&nbsp;
            <a href="detailsAnnonce.action?id=1">Détails annonce&nbsp;&rarr;</a>
            </p>
        </div>                
        <div class="grid_3">
            <a href="template/images/slider/2.jpg" title="Maecenas pharetra egestas adipiscing." class="colorbox"><img class="boxImage tiptop" src="template/images/boxes/2.jpg" alt="" title="&plusmn;&nbsp;zoom" /></a>
                    
            <h3>Morbi fermentum sollicitudin diam vel vehicula</h3>
            <p>Maecenas pharetra egestas adipiscing. Nullam consequat velit in felis sodales in facilisis justo fringilla. Pellentesque nec lobortis dolor. Praesent et mi eu magna dapibus condimentum.&nbsp;
            <a href="detailsAnnonce.action?id=2">Détails annonce&nbsp;&rarr;</a></p>
        </div>                
        <div class="grid_3">
            <a href="template/images/slider/3.jpg" title="Maecenas pharetra egestas adipiscing." class="colorbox"><img class="boxImage tiptop" src="template/images/boxes/3.jpg" alt="" title="&plusmn;&nbsp;zoom" /></a>
                    
            <h3>Morbi fermentum sollicitudin diam vel vehicula</h3>
            <p>Maecenas pharetra egestas adipiscing. Nullam consequat velit in felis sodales in facilisis justo fringilla. Pellentesque nec lobortis dolor. Praesent et mi eu magna dapibus condimentum.&nbsp;
            <a href="detailsAnnonce.action?id=3">Détails annonce&nbsp;&rarr;</a></p>
        </div>-->                
        <s:if test="%{posGeoLatitude == null}">
        	<p>Le système n'arrive pas à charger votre position géographique, <a href="#" id="unauthenifiedUserSetPosition">Selectionnez la position</a> où vous voulez trouver des annonces. Et le système vous va chercher les annonces les plus proches de cet emplacement.</p>
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
				<p>
					<s:property value="#resultObject[0].description"/>.
					<a href="detailsAnnonce.action?annonceId=<s:property value="#resultObject[0].id"/>">Détails	annonce&nbsp;&rarr;</a>
				</p>
			</div>                    
        </s:iterator>
     </div><!-- end boxes -->    	        	    
	
     <!-- begin .grid_12 - COMMENTS -->
     <div id="strip" class="grid_12">
         <img id="users" src="template/images/users.png" alt="" />
         <ul id="comments">
             <li>"Maecenas pharetra egestas adipiscing. Nullam consequat velit in felis sodales in facilisis justo fringilla. Pellentesque nec lobortis dolor. Praesent et mi eu magna dapibus condimentum."<br /><span class="signature">John Doe - 4 October 2011</span></li>
             <li>"Ut dapibus fringilla volutpat. Sed ullamcorper augue nec risus facilisis eu venenatis metus tristique. In hac habitasse platea dictumst. Aenean at lacus urna. Donec pretium mattis gravida."<br /><span class="signature">John Doe - 4 October 2011</span></li>
         </ul>
     </div><!-- end .grid_12 -->

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
					<a href="#" id="GMapCancel">Annuler</a><a href="#" id="GMapConfirmPosition">Confirmer</a>
				</p>
			</div>
		</div>
	</div>
</div>

<div id="topGrayLayer2" class="topGrayLayer">
	<div id="mapDiv">
		<div class="whiteBG" style="margin-top:200px; padding: 10px;">				     	    

			<p><a id="link1" href="#">Annonces de vente</a></p>
			<p><a id="link2" href="#">Annonces d'achat</a></p>
			<p><a id="link3" href="#">Evenements</a></p>
			<script>
			function ajaxGetListAnnonces() {
				if($("#currentPosGeoLatitude").val() == '' || $("#currentPosGeoLongitude").val() == ''){
					alert("Vous devez d'abord selectionner votre postion depuis la carte");
					return;
				}
				$.ajax({
							type : "GET",
							url : "ajax_getListeAnnonces.action?type=" + $("#currentAnnonceType").val() + "&posGeoLatitude=" + $("#currentPosGeoLatitude").val() +
								  "&posGeoLongitude=" + $("#currentPosGeoLongitude").val(),
							error : function(msg) {
								$('#boxes').html("Error !: " + msg);
							},
							success : function(data) {
								//affiche le contenu du fichier dans le conteneur dédié
								$('#boxes').html(data);															
							}
						});
			}
			$("#link1").click(	function(){
							$("#currentAnnonceType").val("V");
							ajaxGetListAnnonces();
							$("#topGrayLayer2").fadeOut(500);
			});				
			$("#link2").click(	function(){
					$("#currentAnnonceType").val("A");
					ajaxGetListAnnonces();
					$("#topGrayLayer2").fadeOut(500);
			});	
			$("#link3").click(	function(){
					$("#currentAnnonceType").val("E");
					ajaxGetListAnnonces();
					$("#topGrayLayer2").fadeOut(500);
			});	
			</script>			
    		<br/>			
 			<a href="#" id="searchToolClose">Fermer</a>
 		</div>		
	</div>
</div>
<script type="text/javascript">
	var GMapInitialized = false;
	var initLatitude  = <s:if test="%{posGeoLatitude == null}">33.742612777346885</s:if><s:else><s:property value="posGeoLatitude"/></s:else>;
	var initLongitude = <s:if test="%{posGeoLongitude == null}">-6.053466796875</s:if><s:else><s:property value="posGeoLongitude"/></s:else>;
	function initGMap() {
		if (GBrowserIsCompatible()) {
			map = new GMap2(document.getElementById("mapa"));
			map.addControl(new GLargeMapControl());
			map.addControl(new GMapTypeControl(3));
			map.setCenter(new GLatLng(initLatitude, initLongitude), 4, 0);
			map.setZoom(8);
			document.getElementById('selectedLatitude').innerHTML = initLatitude;
			document.getElementById('selectedLongitude').innerHTML = initLongitude;
			GEvent.addListener(map, 'click', function(overlay, point) {
				document.getElementById('selectedLatitude').innerHTML = point.lat();
				document.getElementById('selectedLongitude').innerHTML = point.lng();				
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