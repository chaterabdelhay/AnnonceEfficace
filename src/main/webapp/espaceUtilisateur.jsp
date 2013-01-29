<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<!-- Include the header -->
<jsp:include page="header.jsp" />

<!-- BEGIN : page body content -->

<div id="sideBar">
	<img id="quickMenu" src="template/images/sideMenu.png" />
</div>

<!-- BEGIN CONTAINER -->
<div class="container_12">	   
    <br/><br/><br/>      	   	    	
	<div style="margin:100px 0px 160px 10px;">
		<table id="login">
			<tr>
				<td>
				
					<h2>Bienvenu dans votre espace personnel, M. <s:property value="%{#session.utilisateur.nomUtilisateur}"/></h2>																		
				</td>
				<td>
					<div id="createAccount" style="line-height:30px;width:250px; font-size:13px; margin-left:50px; color:#555">
						<h2>Voici quelques détails...</h2><br/>
						<h3>Vos annonces</h3><br/>
						<h3>Vos utilisateurs suivi</h3><br/>
						<h3>Les notifications...</h3>			
					</div>
				</td>
			</tr>
		</table>		
							
	</div>
	
     <!-- begin .grid_12 - COMMENTS -->
     <div id="strip" class="grid_12">
         <img id="users" src="template/images/users.png" alt="" />
         <ul id="comments">
             <li>"Maecenas pharetra egestas adipiscing. Nullam consequat velit in felis sodales in facilisis justo fringilla. Pellentesque nec lobortis dolor. Praesent et mi eu magna dapibus condimentum."<br /><span class="signature">John Doe - 4 October 2011</span></li>
             <li>"Ut dapibus fringilla volutpat. Sed ullamcorper augue nec risus facilisis eu venenatis metus tristique. In hac habitasse platea dictumst. Aenean at lacus urna. Donec pretium mattis gravida."<br /><span class="signature">John Doe - 4 October 2011</span></li>
         </ul>
     </div><!-- end .grid_12 -->

</div><!-- END CONTAINER -->

<!-- END : page body content -->

<!-- Include the footer -->
<jsp:include page="footer.jsp" />