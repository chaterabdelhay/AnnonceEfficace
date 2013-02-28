<!-- Include the header -->
<jsp:include page="header.jsp" />
<%@ taglib prefix="s" uri="/struts-tags" %>
<!-- BEGIN : page body content -->

<!-- BEGIN CONTAINER -->
<div class="container_12">	   
    <br/><br/><br/><br/><br/>  
    

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
               	
    	<s:iterator value="users" var="resultObject">               
			<div class="grid_3">

				<img
					class="boxImage tiptop" src="uploadedImage/objet/<s:property value="#resultObject[0]"/>" alt=""
					title="&plusmn;&nbsp;zoom" width="222px" height="142px"/>
				<h3><s:property value="#resultObject[0]"/></h3>
				<h3>name : <s:property value="#resultObject.nomUtilisateur"/></h3>
				<h3><a href="userProfile?suiviId=<s:property value="#resultObject.id"/>">details</a></h3>

				<form id="suiviForm" method="post" action="suivre?suiviId=<s:property value="#resultObject.id"/>">
				<a id="buttonsend" class="notsosmall pink button">
     <span>
     	<a href="#" id="suivre_<s:property value="#resultObject.id"/>" onclick="suivre(<s:property value="#resultObject.id"/>,0);">
     	S'abonner
     	</a>
     </span>
      <a href="#" style="display:none" id="annulerSuivre_<s:property value="#resultObject.id"/>" onclick="suivre(<s:property value="#resultObject.id"/>,1);">
     	Se désabonner
     	</a>
      
      </a>
      </form>
 
 

			</div>  

        </s:iterator>
        <script>
			function suivre(suivitId, remove) {				
				$.ajax({
							type : "GET",
							url : "suivre.action?suivitId=" + suivitId + "&remove="+ remove,
							error : function(msg) {
								$('#boxes').html("Error !: " + msg);
							},
							success : function(data) {
								//affiche le contenu du fichier dans le conteneur dédié
								//$('#boxes').html(data);
								if(remove==0){
									$('#suivre_' + suivitId).hide();
									$('#annulerSuivre_' + suivitId).show();	
								}else{
									$('#suivre_' + suivitId).show();
									$('#annulerSuivre_' + suivitId).hide();
								}								
							}
						});
			}			
 		</script>      
    </div><!-- end boxes -->    	        	       
</div><!-- END CONTAINER -->
<!-- Include the footer -->
<jsp:include page="footer.jsp" />