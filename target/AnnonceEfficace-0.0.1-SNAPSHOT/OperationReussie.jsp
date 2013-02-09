<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!-- Include the header -->
<jsp:include page="header.jsp" />

<!-- BEGIN : page body content -->

<!-- BEGIN CONTAINER -->
<div class="container_12">
	<br /> <br /> <br />
	<div style="margin: 40px 10px 160px 10px; padding: 20px 20px;"
		class="whiteBG">									
		<s:if test="%{operation == 'publier annonce'}">
			Votre annonce a été publiée !
			<p><a href="listeAnnonces">consulter la liste des annonces</a></p>
			<p><a href="publierAnnonce">publier une autre annonce</a></p>		
		</s:if>		
	</div>	
</div>
<!-- END CONTAINER -->

<!-- END : page body content -->

<!-- Include the footer -->
<jsp:include page="footer.jsp" />