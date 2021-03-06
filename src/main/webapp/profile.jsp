<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<!-- Include the header -->
<jsp:include page="header.jsp" />

<!-- BEGIN : page body content -->

<!-- BEGIN CONTAINER -->
<div class="container_12">	   
    <br/><br/><br/>      	   	    	
	<div style="margin:100px 0px 160px 10px;">
		<table id="login">
			<tr>
				<td>
				
	 <s:iterator value="users" var="resultObject"> 								
					<h2>Bienvenu dans le profile de, M. <s:property value="#resultObject.nomUtilisateur"/></h2>
					<img
					class="boxImage tiptop" src="template/images/noImg.png" alt=""
					title="&plusmn;&nbsp;zoom" width="222px" height="142px"/>
					<h3>						  
	   <s:if test="%{#session.utilisateur!=null && #session.utilisateur.id != id}">		
		  <s:if test="%{abonneToThisUser == 0}">				 			  						    
     		<a href="#" id="suivre_<s:property value="#resultObject.id"/>" onclick="suivre(<s:property value="#resultObject.id"/>,0);">
     		S'abonner
     		</a>     
	        <a href="#" style="display:none" id="annulerSuivre_<s:property value="#resultObject.id"/>" onclick="suivre(<s:property value="#resultObject.id"/>,1);">
    	 	Se désabonner
     	 	</a>     	                 
      	  </s:if>
      	   <s:if test="%{abonneToThisUser == 1}">				 			  						    
     		<a href="#"  style="display:none" id="suivre_<s:property value="#resultObject.id"/>" onclick="suivre(<s:property value="#resultObject.id"/>,0);">
     		S'abonner
     		</a>     
	        <a href="#"id="annulerSuivre_<s:property value="#resultObject.id"/>" onclick="suivre(<s:property value="#resultObject.id"/>,1);">
    	 	Se désabonner
     	 	</a>     	                 
      	  </s:if>
      </s:if>		
      </h3>			
					<h3>Ville  : <s:property value="#resultObject.ville.nom"/></h3>
					<h3>Email  : <s:property value="#resultObject.email"/></h3>
					<h3>Telephone  : <s:property value="#resultObject.telephone"/></h3>
					<h3>Votre position géographique : [<s:property value="#resultObject.userPositionGeographique.latitude"/>, <s:property value="#resultObject.userPositionGeographique.longitude"/>]</h3>
			</s:iterator>
				</td>
				<td>
					<div id="createAccount" style="line-height:30px;width:250px; font-size:13px; margin-left:50px; color:#555">
						<h2>Voici quelques détails...</h2><br/>
						<h3>ces annonces</h3><br/>
					<s:if test="%{annonces.size()!=0}">	
					<div id="outerContainer">
			<div id="imageScroller">
				<div id="viewer" class="js-disabled">
				<s:iterator value="annonces" var="resultObject">  
					<a class="wrapper" href="http://jqueryui.com" title="jQuery UI">
					<div class="grid_3">

				<img
					class="boxImage tiptop" src="uploadedImage/objet/<s:property value="#resultObject.objet.image"/>" alt=""
					title="&plusmn;&nbsp;zoom" width="222px" height="142px"/>
				<h3><s:property value="#resultObject.titre"/></h3>
				<h3><s:property value="#resultObject[0].titre"/></h3>
				

		
			</div>  </a>
			
					</s:iterator>
				</div>
			</div>
		</div>
		<script type="text/javascript" src="http://jqueryjs.googlecode.com/files/jquery-1.3.2.min.js"></script>
		<script type="text/javascript">
			$(function() {
			
			  //remove js-disabled class
				$("#viewer").removeClass("js-disabled");
			
			  //create new container for images
				$("<div>").attr("id", "container").css({ position:"absolute"}).width($(".wrapper").length * 170).height(170).appendTo("div#viewer");
			  	
				//add images to container
				$(".wrapper").each(function() {
					$(this).appendTo("div#container");
				});
				
				//work out duration of anim based on number of images (1 second for each image)
				var duration = $(".wrapper").length * 3000;
				
				//store speed for later (distance / time)
				var speed = (parseInt($("div#container").width()) + parseInt($("div#viewer").width())) / duration;
								
				//set direction
				var direction = "rtl";
				
				//set initial position and class based on direction
				(direction == "rtl") ? $("div#container").css("left", $("div#viewer").width()).addClass("rtl") : $("div#container").css("left", 0 - $("div#container").width()).addClass("ltr") ;
				
				//animator function
				var animator = function(el, time, dir) {
				 
					//which direction to scroll
					if(dir == "rtl") {
					  
					  //add direction class
						el.removeClass("ltr").addClass("rtl");
					 		
						//animate the el
						el.animate({ left:"-" + el.width() + "px" }, time, "linear", function() {
												
							//reset container position
							$(this).css({ left:$("div#imageScroller").width(), right:"" });
							
							//restart animation
							animator($(this), duration, "rtl");
							
							//hide controls if visible
							($("div#controls").length > 0) ? $("div#controls").slideUp("slow").remove() : null ;			
											
						});
					} else {
					
					  //add direction class
						el.removeClass("rtl").addClass("ltr");
					
						//animate the el
						el.animate({ left:$("div#viewer").width() + "px" }, time, "linear", function() {
												
							//reset container position
							$(this).css({ left:0 - $("div#container").width() });
							
							//restart animation
							animator($(this), duration, "ltr");
							
							//hide controls if visible
							($("div#controls").length > 0) ? $("div#controls").slideUp("slow").remove() : null ;			
						});
					}
				}
				
				//start anim
				animator($("div#container"), duration, direction);
				
				//pause on mouseover
				$("a.wrapper").live("mouseover", function() {
				  
					//stop anim
					$("div#container").stop(true);
					
					//show controls
					($("div#controls").length == 0) ? $("<div>").attr("id", "controls").appendTo("div#outerContainer").css({ opacity:0.7 }).slideDown("slow") : null ;
					($("a#rtl").length == 0) ? $("<a>").attr({ id:"rtl", href:"#", title:"rtl" }).appendTo("#controls") : null ;
					($("a#ltr").length == 0) ? $("<a>").attr({ id:"ltr", href:"#", title:"ltr" }).appendTo("#controls") : null ;
					
					//variable to hold trigger element
					var title = $(this).attr("title");
					
					//add p if doesn't exist, update it if it does
					($("p#title").length == 0) ? $("<p>").attr("id", "title").text(title).appendTo("div#controls") : $("p#title").text(title) ;
				});
				
				//restart on mouseout
				$("a.wrapper").live("mouseout", function(e) {
				  
					//hide controls if not hovering on them
					(e.relatedTarget == null) ? null : (e.relatedTarget.id != "controls") ? $("div#controls").slideUp("slow").remove() : null ;
					
					//work out total travel distance
					var totalDistance = parseInt($("div#container").width()) + parseInt($("div#viewer").width());
														
					//work out distance left to travel
					var distanceLeft = ($("div#container").hasClass("ltr")) ? totalDistance - (parseInt($("div#container").css("left")) + parseInt($("div#container").width())) : totalDistance - (parseInt($("div#viewer").width()) - (parseInt($("div#container").css("left")))) ;
					
					//new duration is distance left / speed)
					var newDuration = distanceLeft / speed;
				
					//restart anim
					animator($("div#container"), newDuration, $("div#container").attr("class"));

				});
												
				//handler for ltr button
				$("#ltr").live("click", function() {
				 					
					//stop anim
					$("div#container").stop(true);
				
					//swap class names
					$("div#container").removeClass("rtl").addClass("ltr");
										
					//work out total travel distance
					var totalDistance = parseInt($("div#container").width()) + parseInt($("div#viewer").width());
					
					//work out remaining distance
					var distanceLeft = totalDistance - (parseInt($("div#container").css("left")) + parseInt($("div#container").width()));
					
					//new duration is distance left / speed)
					var newDuration = distanceLeft / speed;
					
					//restart anim
					animator($("div#container"), newDuration, "ltr");
				});
				
				//handler for rtl button
				$("#rtl").live("click", function() {
										
					//stop anim
					$("div#container").stop(true);
					
					//swap class names
					$("div#container").removeClass("ltr").addClass("rtl");
					
					//work out total travel distance
					var totalDistance = parseInt($("div#container").width()) + parseInt($("div#viewer").width());

					//work out remaining distance
					var distanceLeft = totalDistance - (parseInt($("div#viewer").width()) - (parseInt($("div#container").css("left"))));
					
					//new duration is distance left / speed)
					var newDuration = distanceLeft / speed;
				
					//restart anim
					animator($("div#container"), newDuration, "rtl");
				});
			});
		</script>
		</s:if>
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
						<h3>Abonnements</h3>
				<ul>		
				<s:iterator value="suivis" var="resultObject">  
				
				<li><a href="#"></a><s:property value="#resultObject[1]"/> </a></li>

								
					</s:iterator>
					</ul>
				</div>
			
					
				</td>
			</tr>
		</table>		
							
	</div>

</div><!-- END CONTAINER -->

<!-- END : page body content -->

<!-- Include the footer -->
<jsp:include page="footer.jsp" />