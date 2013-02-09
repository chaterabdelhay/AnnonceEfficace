<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!-- Include the header -->

<jsp:include page="header.jsp" />

<!-- BEGIN : page body content -->
<!-- BEGIN CONTAINER -->

<div class="container_12">
<div id="demo">
	
	<br /> <br /> <br />
	<div style="margin: 40px 10px 160px 10px; padding: 20px 20px;"
		class="whiteBG">
		<table id="login">
			<tr>
				<td colspan="2"
					style="padding-bottom: 5px; border-bottom: 1px solid #ddd;">
					<p>
						<span style="font-weight: 800">Type de l'annonce : <s:property value="%{typeAnnonce}"/><br/>Titre : <s:property value="%{annonce.titre}"/></span>
						<span style="float: right">	
											
					

					
<div id="demo">
							Evaluation moyenne :<s:property value="%{average}" />
	<div id="rating_cont">	
	
		<div id="rating_btns">
			<ul>
				<li>0.5</li>
				<li>1.0</li>
				<li>1.5</li>
				<li>2.0</li>
				<li>2.5</li>
				<li>3.0</li>
				<li>3.5</li>
				<li>4.0</li>
				<li>4.5</li>
				<li>5.0</li>
			</ul>
		</div>
			
		<div id="rating_on" >&nbsp;</div>
		<div id="rated">
			<div id="rating" style="height: 17px; line-height: 17px;"></div>
			<div> - &nbsp;</div>
			<div id="small_stars">&nbsp;</div>
			
		</div>	
			
	</div>
	
	<input type="hidden" id="rating_output" name="rating_output" value="not rated" />
</div>

		 
							 
		<div class="avg"> evaluation moyenne </div> </span>			
						
					</p>
				</td>
			</tr>
			<tr>
				<td style="padding-top: 10px;"><img class="boxImage tiptop" width="222px" height="142px"
					src="uploadedImage/objet/<s:property value="%{annonce.objet.image}"/>" alt="" title="&plusmn;&nbsp;zoom" />
				</td>
				<td
					style="vertical-align: top; padding-left: 10px; padding-top: 10px;">
					<p>
						<span style="font-weight: 800">Publiée par <s:property value="%{annonce.utilisateur.nomUtilisateur}"/>, le <s:property value="%{annonce.datePostulation}"/></span>
					</p>
					<p style="font-weight: 800">Description</p>
					<p><s:property value="%{annonce.description}"/></p>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<div class="commentaire">
						<div id="addCommentContainer">
							<p>Add a Comment</p>
							
							<p><div id="commentaire">
							</div></p>	
							<s:iterator value="commentaires" var="resultObject">
							<div class="commentaire" style="margin-bottom: 20px;"><s:property value="#resultObject"/> </div>
							</s:iterator>	
							<form id="addCommentForm" method="post" action="">
								<s:textarea name="contenu" id="msgTxt"
									placeholder="Commentez cette annonce !" cols="80" rows="10" />
								<s:submit id="submit" value="Submit" />
								
							</form>							
						</div>										
					</div>

<s:textfield type="hidden" id="annonceId" value="%{annonceId}" />

					<script>						
					//commentaire javascript
						$('#addCommentForm').submit(function(e) {
							e.preventDefault();
						
							$.ajax({
								type : "GET",
								url : "commenter.action?contenu=" + $("#msgTxt").val()+"&annonceId="+ $("#annonceId").val(),
								error : function(msg) {
									$('#commentaire').html("Error !: " + msg);
								},
								success : function(data) {
									//alert("msg sended");
									//affiche le contenu du fichier dans le conteneur dédié
									$("<div>").html(data).insertAfter("#commentaire").hide().slideDown("slow");
									//$('#commentaire').html(data).insertBefore('#commentaire').slideDown();
								}
							});
						});
						//fin commentaire javascript
						
						
						//rating java script
						$(document).ready(function(){
	
	// hover
	$('#rating_btns li').hover(function(){	
			$rating = $(this).text();
			$('#rating_on').css('width', rateWidth($rating));
	});	
	
	// mouseout
	$('#rating_btns li').mouseout(function(){
		
		$rating = $('#rating').text();
		if($rating == "not rated"){		
			$('#rating_on').css('width', "0px");
		}
		else{
			$('#rating_on').css('width', rateWidth($rating));		
		}
	});
	
	//click
	$('#rating_btns li').click(function(){
		$rating = $(this).text();
		$('#rating').text($rating);
		$('#rating_output').val($rating);
		$pos = starSprite($rating);
		$('#small_stars').css('background-position', "0px " + $pos );							   
		
		$('#rated').fadeIn();
		$('#rating_btns').hide();
		$('#rating_on').hide();
		$.ajax({
			type : "GET",
			url : "evaluer.action?note="+parseInt($rating)+"&annonceId=3",
			error : function(msg) {
				alert("non ajoute");
			},
			success : function(data) {
				$('#commentaire').html(data);
				alert($rating);
			}
		});
	});
	
	
	
	function rateWidth($rating){
		
		$rating = parseFloat($rating);
		switch ($rating){
			case 0.5: $width = "14px"; break;
			case 1.0: $width = "28px"; break;
			case 1.5: $width = "42px"; break;
			case 2.0: $width = "56px"; break;
			case 2.5: $width = "70px"; break;
			case 3.0: $width = "84px"; break;
			case 3.5: $width = "98px"; break;
			case 4.0: $width = "112px"; break;
			case 4.5: $width = "126px"; break;
			case 5.0: $width = "140px"; break;
			default:  $width =  "84px";
		}
		return $width;
	}				
	
	function starSprite($rating){
		
		$rating = parseFloat($rating);
		switch ($rating){
			case 0.5: $pos = "-11px"; break;
			case 1.0: $pos = "-22px"; break;
			case 1.5: $pos = "-33px"; break;
			case 2.0: $pos = "-44px"; break;
			case 2.5: $pos = "-55px"; break;
			case 3.0: $pos = "-66px"; break;
			case 3.5: $pos = "-77px"; break;
			case 4.0: $pos = "-88px"; break;
			case 4.5: $pos = "-99px"; break;
			case 5.0: $pos = "-110px"; break;
			//default:  $pos =  "-77px";
		}
		return $pos;
	}
	
});	
						//fin rating java script
						
					</script>
<script type="text/javascript" src="js/star_rating.js"></script>
<script type="text/javascript" src="js/jquery-1.3.2.min.js"></script>
				</td>
			</tr>
		</table>
	</div>
</div>

<!-- END CONTAINER -->

<!-- END : page body content -->

<!-- Include the footer -->
<jsp:include page="footer.jsp" />