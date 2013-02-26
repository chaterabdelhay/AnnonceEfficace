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
            <a href="#"><img src="template/images/download.png" alt="" /></a>&nbsp;<a href="http://www.youtube.com/embed/jk2cJTbwm04?rel=0&amp;hd=1" class="watch">or watch the video&nbsp;&nbsp;<img src="template/images/video.png" alt="" /></a>
        </div><!-- end .grid_4 -->

		<!-- begin .grid_8 - IMAGE SLIDER -->
        <div class="grid_8">
            <!-- NIVO SLIDER -->
            <div class="slider-wrapper theme-default">
                <div class="ribbon"></div>
                <div id="slider" class="nivoSlider">
                    <img src="template/images/slider/1.jpg" alt="" title="1# This is an example of a caption" />
                    <img src="template/images/slider/2.jpg" alt="" title="2# This is an example of a caption" />
                    <img src="template/images/slider/3.jpg" alt="" title="3# This is an example of a caption" />
                    <img src="template/images/slider/4.jpg" alt="" title="4# This is an example of a caption" />
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
	
    <!-- begin buttons -->
    <div id="buttons">
    
    	<!-- begin .grid_4 - BUTTON1 -->
        <div class="grid_4">
            <a href="#" class="tip" title="Maecenas pharetra egestas adipiscing."><img class="btn" src="template/images/btn/btn1.png" alt="" /></a>
        </div><!-- end .grid_4 -->
        
        <!-- begin .grid_4 - BUTTON2 -->
        <div class="grid_4">
            <a href="#" class="tip" title="Maecenas pharetra egestas adipiscing."><img class="btn" src="template/images/btn/btn2.png" alt="" /></a>
        </div><!-- end .grid_4 -->
        
        <!-- begin .grid_4 - BUTTON3 -->
        <div class="grid_4">
            <a href="#" class="tip" title="Maecenas pharetra egestas adipiscing."><img class="btn" src="template/images/btn/btn3.png" alt="" /></a>
        </div><!-- end .grid_4 -->
        
        <div class="clear"></div>
        
    </div>
	
    <!-- begin video & features -->
    <div id="video_features">
    	
        <!-- begin .grid_7 - FEATURES -->
        <div class="grid_7">
            <h2>Lorem ipsum dolor sit amet, consectetur eu tempus.</h2>
            <p>Sed ullamcorper augue nec risus facilisis eu venenatis metus tristique. In hac habitasse platea dictumst. Aenean at lacus urna. Donec pretium mattis gravida. Integer eu nisl erat, eu tempus nisi.</p>
            <ul id="features">
                <li><img src="template/images/list_icon/1.png" alt="" />&nbsp;&nbsp;&nbsp;Lorem ipsum dolor sit amet, eu consectetur. Ut dapibus fringilla.</li>
                <li><img src="template/images/list_icon/2.png" alt="" />&nbsp;&nbsp;&nbsp;Ut dapibus fringilla volutpat. Sed ullamcorper augue nec.</li>
                <li><img src="template/images/list_icon/3.png" alt="" />&nbsp;&nbsp;&nbsp;Maecenas pharetra egestas adipiscing. Nullam consequat velit.</li>
            </ul>
            <p>Ut dapibus fringilla volutpat. Sed ullamcorper augue nec risus facilisis eu venenatis metus tristique. In hac habitasse platea dictumst. Aenean at lacus urna. Donec pretium mattis gravida.</p>
        </div><!-- end .grid_7 -->
        
        <!-- begin .grid_5 - VIDEO -->
        <div id="video" class="grid_5">
            <iframe src="http://player.vimeo.com/video/23428725?title=0&amp;byline=0&amp;portrait=0" width="380" height="285" frameborder="0"></iframe>
        </div><!-- end .grid_5 -->
        
        <div class="clear"></div>
        
     </div>
	
      <!-- begin .grid_12 - COMMENTS -->
     <div id="strip" class="grid_12">
         <img id="users" src="template/images/users.png" alt="" />
         <ul id="comments">
             <li>"Choisir un bon titre pour son annonce serait un atout majeur pour pousser les internautes à consulter votre annonce."</li>
             <li>"L'image que vous joignez à votre annonce est à choisir avec attention car sa qualité peut rendre votre annonce encore plus efficace."</li>
         </ul>
     </div><!-- end .grid_12 -->

</div><!-- END CONTAINER -->

<!-- END : page body content -->

<!-- Include the footer -->
<jsp:include page="footer.jsp" />