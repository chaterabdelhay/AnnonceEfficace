<!-- Include the header -->
<jsp:include page="header.jsp" />
<%@ taglib prefix="s" uri="/struts-tags" %>
<!-- BEGIN : page body content -->

<!-- BEGIN CONTAINER -->
<div class="container_12">	   
    <br/><br/><br/><br/><br/><br/>                
               	
    	<s:iterator value="users" var="resultObject">               
			<div class="grid_2">
				<img
					class="boxImage tiptop" src="template/images/noImg.png" alt=""
					title="&plusmn;&nbsp;zoom" width="128px" height="90px"
					 style="margin:0"/>				
				<h3><a href="userProfile?id=<s:property value="#resultObject.id"/>"><s:property value="#resultObject.nomUtilisateur"/></a>				
     				<br/>
     				<a href="#" id="suivre_<s:property value="#resultObject.id"/>" class="abonnementLink" 
     					onclick="suivre(<s:property value="#resultObject.id"/>,0);" style="fonti-size:9px">
     					S'abonner
     				</a>     
      				<a href="#" class="abonnementLink" style="display:none" id="annulerSuivre_<s:property value="#resultObject.id"/>" 
      					onclick="suivre(<s:property value="#resultObject.id"/>,1);">
     					Se désabonner
     				</a>
      			</h3>
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