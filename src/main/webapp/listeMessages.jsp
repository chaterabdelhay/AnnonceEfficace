<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!-- Include the header -->
<jsp:include page="header.jsp" />

<!-- BEGIN : page body content -->

<!-- BEGIN CONTAINER -->
<div class="container_12">
	<br /> <br /> <br /><br /> <br /> <br />
	
	<div>
	 
		<table id="login">
		
			<tr>
			
				<td>
					<div>
					<div>
						<h1 class="gray">Liste des messages</h1>
					</div>
					<table style="width:600px">
						<tr>
							<td><h3>Par</h3></td><td><h3>Titre</h3></td><td><h3>Message</h3></td>
						</tr>
						<s:if test="%{usersEmetters.size() == 0}">
							<tr><td colspan="3" style="padding-left:50px;"><p>Aucun message</p></td></tr>
						</s:if>
						<s:iterator value="usersEmetters" var="resultObject"> 
							<tr>
								<td><p><s:property value="#resultObject[0]"/></p></td>
								<td><p><s:property value="#resultObject[1]"/></p></td>
								<td><p><s:property value="#resultObject[2].nomUtilisateur"/></p></td></tr>												
						</s:iterator>
						
					</table>					
						<br/>
						<h3><a href="#" class="show_hide">Envoyer un message</a></h3>
						<div class="slidingDiv">
<s:form action="envoyerMessage">
     <table>
     <tr><td colspan="2"><label>objet :</label></td></tr> <tr><td><s:textfield name="objet"/> </td></tr>
     <tr><td> <s:textarea name="contenuMessage" rows="10" cols="40" /></td></tr>
      
      
     								<tr style="width:400px" valign="top"><td>	<label>destinataire</label> </td>
     								</tr>
     								<tr>
										<td><s:select headerKey="-1"  list="users" 												
												name="userdestinataire" />	
													</td>																													
										</tr>
										
										<tr><td><input type="submit" value="envoyer"></td></tr>
										</table>
										
										
      </s:form>
      
          </div>
          
    <script>
	$(document).ready(function(){


    $(".slidingDiv").hide();
	$(".show_hide").show();
	
	$('.show_hide').click(function(){
	$(".slidingDiv").slideToggle();
	});

});
	
	</script>
					</div>
					
				</td>
			</tr>
		</table>
	
		</div>
			

</div>
<!-- END CONTAINER -->

<!-- END : page body content -->

<!-- Include the footer -->
<jsp:include page="footer.jsp" />