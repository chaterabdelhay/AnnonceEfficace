<%@ taglib prefix="s" uri="/struts-tags" %>
<s:iterator value="recherche" var="resultObject">               
			<div class="grid_2">

				<img
					class="boxImage tiptop" src="template/images/noImg.png" alt=""
					title="&plusmn;&nbsp;zoom" width="128px" height="90px"
					 style="margin:0"/>				
				<h3><a href="userProfile?suiviId=<s:property value="#resultObject.id"/>"><s:property value="#resultObject.nomUtilisateur"/></a>				
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