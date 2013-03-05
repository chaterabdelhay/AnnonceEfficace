<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script src="http://maps.google.com/maps?file=api&v=2&key=ABQIAAAA7A7Eu8gZ_mTslgWnRR9TGRQByQgPDcFg0q0wOb9u6rRtBOFyKBQD4QgfPHRxBFGL7JviJdz_jAlHfw" type="text/javascript"></script>
<!-- Website title -->
<title>Annonce Efficace</title>		
	
	<!-- Favicon -->
		<link rel="shortcut icon" href="favicon.ico" />

	<!-- Begin Stylesheets -->
	<link rel="stylesheet" href="template/stylesheets/message.css" type="text/css" media="screen" />
		<link rel="stylesheet" href="template/stylesheets/reset.css" type="text/css" media="screen" />
        <link rel="stylesheet" href="template/stylesheets/960_12_col.css" type="text/css" media="screen" />
        <link rel="stylesheet" href="template/stylesheets/layout.css" type="text/css" media="screen" />
        <link rel="stylesheet" href="template/stylesheets/tipTip.css" type="text/css" media="screen" />
        <link rel="stylesheet" href="template/stylesheets/colorbox.css" type="text/css" media="screen" />
        <link rel="stylesheet" href="template/stylesheets/nivoslider/nivo-slider.css" type="text/css" media="screen" />
        <link rel="stylesheet" href="template/stylesheets/nivoslider/default/default.css" type="text/css" media="screen" />
        <link rel="stylesheet" href="template/stylesheets/bx_styles/bx_styles.css" type="text/css" media="screen" />
        <link rel="stylesheet" href="template/stylesheets/top_panel.css" type="text/css" media="screen" />  
         <link rel="stylesheet" href="template/stylesheets/star_rating.css" type="text/css" media="screen" /> 
         <link rel="stylesheet" href="template/stylesheets/imageScroller.css" type="text/css" media="screen" />
         <link rel="stylesheet" href="template/stylesheets/demo_page.css" type="text/css" media="screen" /> 
         <link rel="stylesheet" href="template/stylesheets/demo_table.css" type="text/css" media="screen" /> 
            <link rel="stylesheet" href="template/stylesheets/demo_table_jui.css .css" type="text/css" media="screen" />
               <link rel="stylesheet" href="template/stylesheets/jquery.dataTables_themeroller.css" type="text/css" media="screen" />
              <link rel="stylesheet" href="template/stylesheets/jquery.dataTables.css" type="text/css" media="screen" />
              <link rel="stylesheet" href="template/stylesheets/jquery.dataTables.css" type="text/css" media="screen" />
          
         
         
	<!-- End Stylesheets -->
    
    <!-- Begin Google Web Fonts -->
    	<link href='http://fonts.googleapis.com/css?family=Lobster' rel='stylesheet' type='text/css' />
	<!-- End Google Web Fonts -->
    
	<!-- Begin JavaScript -->
    
    	<!-- jQuery -->
		<script type="text/javascript" src="template/javascripts/jquery-1.6.4.min.js"></script>
        
        <!-- jQuery plugins -->
        <script type="text/javascript" src="template/javascripts/jquery.tipTip.minified.js"></script>
        <script type="text/javascript" src="template/javascripts/jquery.colorbox-min.js"></script>
        <script type="text/javascript" src="template/javascripts/jquery.nivo.slider.pack.js"></script>
        <script type="text/javascript" src="template/javascripts/jquery.bxSlider.min.js"></script>
        <script type="text/javascript" src="template/javascripts/jquery.ticker.js"></script>
        <script type="text/javascript" src="template/javascripts/OptionPopupDescriptor.js"></script>
        
        <script type="text/javascript" src="template/javascripts/jquery.dataTables.js"></script>
        <script type="text/javascript" src="template/javascripts/jquery.dataTables.min.js"></script>                                                        
        <!-- JQUERY rating stars -->
        
        <script type="text/javascript" src="template/javascripts/jquery.rating.pack.js"></script>
 		<link href="template/stylesheets/jquery.rating.css" rel="stylesheet"/>
        <!-- JQUERY rating stars2 -->
         <script type="text/javascript" src="template/javascripts/jquery.ticker.js"></script>
        <script type="text/javascript" src="template/javascripts/OptionPopupDescriptor.js"></script>
        <!-- jQuery plugin init -->
        <script type="text/javascript">
		$(document).ready(function(){
			
			// IMAGE CAROUSEL
			$('#carousel').bxSlider({
				displaySlideQty: 6,
				moveSlideQty: 1
			});
			$('#carousel li').mouseover( function() { $(this).css("color","#3791CF"); });
			$('#carousel li').mouseout( function() { $(this).css("color","#FFFFFF"); });
			
			// IMAGE SLIDER
			$('#slider').nivoSlider();
			
			// TICKER
			$('#comments').list_ticker({
				speed:4000,
				effect:'fade'
			});
			
			// IMAGES LIGHTBOX
			$('.colorbox').colorbox();
			
			// WATCH THE VIDEO
			$('.watch').colorbox({iframe:true, innerWidth:425, innerHeight:344});
			
			// TIPS
			$(".tip").tipTip({maxWidth: "auto", edgeOffset: 18, delay:0});  
			$(".tiptop").tipTip({maxWidth: "auto", edgeOffset: 0, delay:0, defaultPosition: "top" });  
			
			// ROLLOVER EFFECT
			$('#carousel li,.watch,.boxImage').mouseover( function() { $(this).fadeTo(0,0.8); });
			$('#carousel li,.watch,.boxImage').mouseout( function() { $(this).fadeTo(0,1); });
			
			// TOP PANEL
			$("div.panel_button").click(function(){
				$("div#panel").animate({
					height: "500px"
				})
				.animate({
					height: "400px"
				}, "fast");
				$("div.panel_button").toggle();
			
			});	
			
		    $("div#hide_button").click(function(){
				$("div#panel").animate({
					height: "0px"
				}, "fast");
   			});
			
			// NEWSLETTER INPUT
				// global vars
			var searchBox = $("#newsletterInput");
			var searchBoxDefault = "your mail address";
			
			//Searchbox show/hide default text if needed
			searchBox.focus(function(){
				if($(this).attr("value") == searchBoxDefault) $(this).attr("value", "");
			});
			searchBox.blur(function(){
				if($(this).attr("value") == "") $(this).attr("value", searchBoxDefault);
			});

		});
		
		</script>
 
	<!-- End JavaScript -->
    
	
</head>
<body>
<!-- Begin top panel -->
<div id="toppanel">
    <div id="panel">
    	<div id="panel_contents">
        	<h1>Colors</h1>
            <ul>
                <li><a href="../../blue/nivo-slider/index.html">blue</a></li>
                <li><a href="../../green/nivo-slider/index.html">green</a></li>
                <li><a href="../../red/nivo-slider/index.html">red</a></li>
            </ul>
            
            <h1>Sliders</h1>
            <ul>
                <li><a href="../../blue/nivo-slider/index.html">nivo Slider</a></li>
                <li><a href="../../blue/piecemaker-slider/index.html">piecemaker Slider</a></li>
                <li><a href="../../blue/kwicks-slider/index.html">kwicks slider</a></li>
            </ul>
        </div>
    </div>
    <div class="panel_button" id="expand_button"><img src="template/images/expand.png"  alt="expand"/></div>
    <div class="panel_button" id="hide_button"><img src="template/images/collapse.png" alt="collapse" /></div>
</div><!-- End top panel -->

<!-- BEGIN HEADER -->
<div id="header">
	
    <!-- begin .grid_3 - LOGO -->
    <div id="logo" class="grid_3">
    	<img src="template/images/logo.png" alt="" />
    </div><!-- end .grid_3 -->
    
    <!-- begin .grid_9 - LINKS -->
    <div id="navigation" class="grid_9">
        <ul>
        	<li><a href="." class="selected">Acceuil</a></li>        	
        	<s:if test="%{#session.utilisateur!=null}">
            	<li><a href="espaceUtilisateur" style="color:#fff;">Mon espace</a></li>
            </s:if>
            <s:if test="%{#session.utilisateur!=null}">
            	<li><a href="listeMessages" style="color:#fff;">Mes messages</a></li>
            </s:if>
           
            <li><a href="listeAnnonces">Annonces</a></li>                        
            <s:if test="%{#session.utilisateur!=null}">
            	<li><a href="disconnect" style="color:#fff;">Se deconnecter</a></li>
            </s:if>
           
            <s:if test="%{#session.utilisateur==null}">
            	<li><a href="connexion.jsp">Se connecter</a></li>
            </s:if>                                               
        </ul>
    </div><!-- end .grid_9 -->
    
    <div class="clear"></div>
    <!-- BEGIN SIDEBAR -->
<s:if test="%{#session.utilisateur!=null}">
<div id="sideBar">
	<div id="sideBarTopPart"></div>
	<div id="sideBarMiddlePart">
		<div id="noti_Container">
			<span id="opt0" class="option">
				<span class="optionDescription" id="opt0Description">Notifications</span>
								
					<img src="template/images/sideBar/options/opt0Normal.png" 
					onmouseover="showOptionDescriptor(this)" onmouseout="timedOuthideOptionDescriptor();"									
					onclick="window.location.replace('notifications');"/>										    				    											
			</span>
				<div class="noti_bubble"><s:property value="%{#session.nbrOfNotifications}"/></div>
			</div>
		<span id="opt1" class="option"> 
			<span class="optionDescription" id="opt1Description">Voir les annonces</span> 
			<img src="template/images/sideBar/options/opt1Normal.png" 
					onmouseover="showOptionDescriptor(this)" onmouseout="timedOuthideOptionDescriptor();" 
					onclick="window.location.replace('listeAnnonces');"/>
		</span>			
			<span id="opt3" class="option"> 
				<span class="optionDescription" id="opt3Description">Publier une annonce rapidement</span> 
				<img src="template/images/sideBar/options/opt3Normal.png" 
					onmouseover="showOptionDescriptor(this)" onmouseout="timedOuthideOptionDescriptor();" 
					onclick="window.location.replace('publierAnnonce');"/> 
			</span>
			<span id="opt4" class="option"> 
				<span class="optionDescription" id="opt4Description">liste d'utilisateurs</span> 
				<img src="template/images/sideBar/options/opt2Normal.png" 
					onmouseover="showOptionDescriptor(this)" onmouseout="timedOuthideOptionDescriptor();" 
					onclick="window.location.replace('listUsers');"/>
			</span>	
			<span id="opt2" class="option"> 
				<span class="optionDescription" id="opt2Description">Participer au concours</span> 
				<img src="template/images/sideBar/options/opt2Normal.png" 
					onmouseover="showOptionDescriptor(this)" onmouseout="timedOuthideOptionDescriptor();"									
					onclick="window.location.replace('participerConcours');"/>
			</span>						
	</div>		
	<div id="sideBarBottomPart"></div>
		
</div>
</s:if>					
<table id="optionDescriptor" cellpadding="0" cellspacing="0">
	<tr>
		<td id="optionDescriptorLeftPart"></td>
		<td id="optionDescriptorMiddlePart"><span id="optionDescriptorText">Texte de descr.</span></td>
		<td id="optionDescriptorRightPart"></td>
	</tr>
</table>
<!-- END SIDEBAR -->
</div><!-- END HEADER -->