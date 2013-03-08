<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!-- Include the header -->
<jsp:include page="header.jsp" />

<!-- BEGIN : page body content -->

<!-- BEGIN CONTAINER -->
<div class="container_12">
	
    <!-- begin image slider -->
    <div id="sliderWrapper">
    
    	<!-- begin .grid_4 - SLIDER TEXT -->
        <div id="sliderText" class="grid_4">
            <h1>Qu'est ce que "Annonce Efficace" ?</h1>
            <p id="sliderPar">Annonce Efficace (AE) est un site web qui offre plusieurs fonctionnalités pour rendre l'action d'annoncer plus efficace. Vous aurez la possibilité de consulter les annonces à proximté de votre emplacement ou d'indiquer l'emplacement où vous désirez mettre en vente un objet, trouver un job...
            le site web offre la possiblité de créer divers types d'annonces : de vente, d'offre d'emploi, évenement...
            Avec AE les annonces n'ont jamais été aussi efficaces</p>           
        </div><!-- end .grid_4 -->

		<!-- begin .grid_8 - IMAGE SLIDER -->
        <div class="grid_8">
            <!-- NIVO SLIDER -->
            <div class="slider-wrapper theme-default">                
                <div id="slider" class="nivoSlider">
                    <img src="template/images/slider/1.jpg" alt="" title="Le titre de l'annonce" />
                    <img src="template/images/slider/2.jpg" alt="" title="Le titre de l'annonce" />
                    <img src="template/images/slider/3.jpg" alt="" title="Le titre de l'annonce" />
                    <img src="template/images/slider/4.jpg" alt="" title="Le titre de l'annonce" />
                </div>
            </div>
        </div><!-- end .grid_8 -->
        
        <div class="clear"></div>
        
    </div><!-- end image slider -->
    
    <!-- begin .grid_12 - CAROUSEL -->
    <!-- <div id="carouselWrapper" class="grid_12">
        <ul id="carousel">
            <li><a href="#"><img src="template/images/carousel/1.jpg" alt="" /></a><br />Slide one</li>
            <li><a href="#"><img src="template/images/carousel/2.jpg" alt="" /></a><br />Slide two</li>
            <li><a href="#"><img src="template/images/carousel/3.jpg" alt="" /></a><br />Slide three</li>
            <li><a href="#"><img src="template/images/carousel/4.jpg" alt="" /></a><br />Slide four</li>
            <li><a href="#"><img src="template/images/carousel/5.jpg" alt="" /></a><br />Slide five</li>
            <li><a href="#"><img src="template/images/carousel/6.jpg" alt="" /></a><br />Slide six</li>
            <li><a href="#"><img src="template/images/carousel/7.jpg" alt="" /></a><br />Slide seven</li>
        </ul>
    </div> 	
	--> 
	<!-- end .grid_12 --> 
    
    <div class="clear"></div>
    <br/>
	
    <!-- begin boxes -->
    <div id="boxes" style="margin-top:30px;">
    	<s:iterator value="annonces" var="resultObject">
			<div class="grid_3">
				<a
					href="uploadedImage/objet/<s:property value="#resultObject.objet.image"/>"
					title="Maecenas pharetra egestas adipiscing." class="colorbox"><img
					class="boxImage tiptop"
					src="uploadedImage/objet/<s:property value="#resultObject.objet.image"/>"
					alt="" title="&plusmn;&nbsp;zoom" width="222px" height="142px" /></a>
				<h3>
					<a href="detailsAnnonce.action?annonceId=<s:property value="#resultObject.id"/>">
						<s:property value="#resultObject.titre" />
					</a>
				</h3>								
			</div>
		</s:iterator>
        
        <div class="clear"></div>
        
    </div><!-- end boxes -->	    
	
      <!-- begin .grid_12 - COMMENTS -->
     <div id="strip" class="grid_12">
         <img id="users" src="template/images/users.png" alt=""/>
         <ul id="comments">
             <li>"Choisir un bon titre pour son annonce serait un atout majeur pour pousser les internautes à consulter votre annonce."</li>
             <li>"L'image que vous joignez à votre annonce est à choisir avec attention car sa qualité peut rendre votre annonce encore plus efficace."</li>
         </ul>
     </div><!-- end .grid_12 -->

</div><!-- END CONTAINER -->

<!-- END : page body content -->

<!-- Include the footer -->
<jsp:include page="footer.jsp" />