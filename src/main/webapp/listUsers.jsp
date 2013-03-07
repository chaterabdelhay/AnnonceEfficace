<!-- Include the header -->
<jsp:include page="header.jsp" />
<%@ taglib prefix="s" uri="/struts-tags" %>
<!-- BEGIN : page body content -->

<!-- BEGIN CONTAINER -->

<div class="container_12">
    <br/><br/><br/><br/><br/><br/>                
         <div id="updatePosition">
		<table cellpadding="4" style="display:inline;">
	      <tr>
	       
	       <td>
	       <form class="ajax" action="search.php" method="get">
				<p>		
					<input type="text" name="q" id="q" />
				</p>
			</form>
			</td>
		<td><img src="template/images/search.png"/></td>
	       <td style="width:605px"></td>	       
		  </tr>
		</table>		
	</div>	
	<br/><br/>
	<div id="contenu">         	
    	<s:iterator value="users" var="resultObject">               
			<div class="grid_2">
				<img
					class="boxImage tiptop" src="template/images/noImg.png" alt=""
					title="&plusmn;&nbsp;zoom" width="128px" height="90px"
					 style="margin:0"/>				
				<h3><a href="userProfile?id=<s:property value="#resultObject.id"/>"><s:property value="#resultObject.nomUtilisateur"/></a>					
																	
     				<br/>
     				<s:if test="%{isFollowed(#resultObject.id)}">
						<a href="#" style="display:none" id="suivre_<s:property value="#resultObject.id"/>" class="abonnementLink" 
     						onclick="suivre(<s:property value="#resultObject.id"/>,0);" style="fonti-size:9px">
     						S'abonner
     					</a>     
      					<a href="#" class="abonnementLink" id="annulerSuivre_<s:property value="#resultObject.id"/>" 
      						onclick="suivre(<s:property value="#resultObject.id"/>,1);">
     						Se desabonner
     					</a>
					</s:if>
					<s:else>
						<a href="#" id="suivre_<s:property value="#resultObject.id"/>" class="abonnementLink" 
     						onclick="suivre(<s:property value="#resultObject.id"/>,0);" style="fonti-size:9px">
     						S'abonner
     					</a>     
      					<a href="#" class="abonnementLink" style="display:none" id="annulerSuivre_<s:property value="#resultObject.id"/>" 
      						onclick="suivre(<s:property value="#resultObject.id"/>,1);">
     						Se desabonner
     					</a>
					</s:else>     				
      			</h3>
      </div>  

        </s:iterator>
        </div>
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
 		<!-- script de recherche --> 
 		<script>
 		$(document).ready( function() {
 			  // détection de la saisie dans le champ de recherche
 			  $('#q').keyup( function(){
 			    $field = $(this);
 			    $('#results').html(''); // on vide les resultats
 			    $('#ajax-loader').remove(); // on retire le loader
 			 
 			    // on commence à traiter à partir du 2ème caractère saisie
 			    if( $field.val().length > 0 )
 			    {
 			      // on envoie la valeur recherché en GET au fichier de traitement
 			      $.ajax({
 			  	type : 'GET', // envoi des données en GET ou POST
 			  	//data : 'q='+$(this).val(),
 				url : "userSearch.action?"+$(this).val(), // url du fichier de traitement
 				data : 'q='+$(this).val() , // données à envoyer en  GET ou POST
 				beforeSend : function() { // traitements JS à faire AVANT l'envoi
 					$('#contenu').html('<br/><br/><center><img src="template/images/loader.gif" alt="loader" id="ajax-loader" /></center><br/><br/><br/>'); // ajout d'un loader pour signifier l'action
 				},
 				success : function(data){ // traitements JS à faire APRES le retour d'ajax-search.php
 					$('#ajax-loader').remove(); // on enleve le loader
 					$('#contenu').html(data); // affichage des résultats dans le bloc
 				}
 			      });
 			    }		
 			  });
 			});
 		</script>
    </div><!-- end boxes -->    	        	       
</div><!-- END CONTAINER -->
<!-- Include the footer -->
<jsp:include page="footer.jsp" />