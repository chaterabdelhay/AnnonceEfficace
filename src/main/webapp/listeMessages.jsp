<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!-- Include the header -->
<jsp:include page="header.jsp" />

	<link rel="stylesheet" href="template/stylesheets/style.css" type="text/css" media="print, projection, screen" />
	<link rel="stylesheet" href="template/stylesheets/jNotify.jquery.css" type="text/css" media="print, projection, screen" />

	<script type="text/javascript" src="template/javascripts/jquery-latest.js"></script>
	<script type="text/javascript" src="template/javascripts/jquery.tablesorter.js"></script>
	
	<script type="text/javascript" src="template/javascripts/docs.js"></script>
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
		
					<table id="tablesorter-demo" class="tablesorter" border="0" cellpadding="0" cellspacing="0" style="width:600px">
		<thead>
			<tr>
			
				<th><h3>Par</h3></th>
				<th><h3>Titre</h3></th>
				<th><h3>Message</h3></th>
				
			</tr>
		</thead>
		<tbody>
			<s:iterator value="usersEmetters" var="resultObject"> 
						
							<tr>
								<td><s:property value="#resultObject[0]"/></td>
								<td><s:property value="#resultObject[1]"/></td>
								<td><s:property value="#resultObject[2].nomUtilisateur"/></td></tr>												
						</s:iterator>
		</tbody>
	</table>					
					<script type="text/javascript">
	$(function() {		
		$("#tablesorter-demo").tablesorter({sortList:[[0,0],[2,1]], widgets: ['zebra']});
		$("#options").tablesorter({sortList: [[0,0]], headers: { 3:{sorter: false}, 4:{sorter: false}}});
	});	
	</script>
		
					
						<br/>
						<h3><a href="#" class="show_hide">Envoyer un message</a></h3>
						<a href="#" class="success">It's a success !</a><br />
						<div class="t">
						
<div class="container_12">
	
	<div>
		<table>
			<tr>
				<td>
					<div class="form-2"  style="width:800px">
					<s:form action="envoyerMessage" theme="css_xhtml" id="messageForm">
						
						<table>
							<tr>
								<td colspan="2">
									<h1>
										<span class="log-in">Envoi d'un message</span>
									</h1>
								</td>
							</tr>
							<tr>
								

							</tr>
							<tr style="width:400px" valign="top">						
								<td>
																																																																				
										<!--<p>
											<label for="typeAnnonce">Type</label>
											<s:select  
												headerKey="-1" headerValue="Selectionnez" list="#{'V':'Vente', 'A':'Achat', 'E':'Evenement', 'OE':'Offre emploi'}" 												
												name="type" />												
										</p> -->	
										<p>
											<label for="objet">objet</label>
											<s:textfield name="objet"/>
										</p>
										<p>
											<label for="password">Message</label>
											<s:textarea name="contenuMessage" rows="10" cols="40" />
										</p>																												
										<p><label for="password">Destinataire</label><s:select headerKey="-1"  list="users" 												
												name="userdestinataire" />	</p>
												<br>																																			
										<p class="clearfix">
										<input type="submit" id="submit" value="Envoi">
										</p>																				
									
								</td>
								</tr>
								</table>
								</s:form>
								</div>
								</td>
								</tr>
								</table>
								</div>
								</div>
								</td>
								</tr>
								</table>
								</div>
								</div>
								   
         
          
    <script>
	$(document).ready(function(){


    $(".t").hide();
	$(".show_hide").show();

	$('.show_hide').click(function(){
	$(".t").slideToggle();
	});

});

	</script>
	
<script type="text/javascript" src="template/javascripts/jNotify.jquery.js"></script>
<script type="text/javascript">
$('#messageForm').submit(function(e) {
	e.preventDefault();
		/** success **/
		
		$.ajax({
			type : "GET",
			url : "envoyerMessage.action",
			error : function(msg) {
				alert("rien");
			},
			success : function(e) {
				//e.preventDefault();
				//alert("bien");
				//$("a").click(function(e){
					//e.preventDefault();
					//alert("bien");
					jSuccess('message envoyé');
					
									}
							}); 
							
				
					
			
	});
		
	
</script>
					</div>
					
    </div>  
 
								</div>
								   

		
			


<!-- END CONTAINER -->

<!-- END : page body content -->

<!-- Include the footer -->
<jsp:include page="footer.jsp" />