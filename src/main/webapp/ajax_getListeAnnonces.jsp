<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<s:if test="%{posGeoLatitude==null}">
	<p style="color:red;">La position (latitude, longitude) indiquée est nulle !!!</p>
	<p>Type param value : <s:property value="type" /></p>
	<p>posGeoLatitude param value : <s:property value="posGeoLatitude" /></p>
	<p>posGeoLongitude param value : <s:property value="posGeoLongitude" /></p>
</s:if>

<s:iterator value="annonces" var="resultObject">
	<div class="grid_3">
		<a
			href="uploadedImage/objet/<s:property value="#resultObject[0].objet.image"/>"
			title="Maecenas pharetra egestas adipiscing." class="colorbox"><img
			class="boxImage tiptop"
			src="uploadedImage/objet/<s:property value="#resultObject[0].objet.image"/>"
			alt="" title="&plusmn;&nbsp;zoom" width="222px" height="142px" /></a>
		<h3>
			<s:property value="#resultObject[0].titre" />
		</h3>
		<h3>
			distance :
			<s:property value="#resultObject[1]" />
		</h3>
		<p>
			<s:property value="#resultObject[0].description" />
			. <a
				href="detailsAnnonce.action?annonceId=<s:property value="#resultObject[0].id"/>">Détails
				annonce&nbsp;&rarr;</a>
		</p>
	</div>
</s:iterator>
<!-- 
<s:if test="%{p == \"a\"}">	

	<div class="grid_3">
		<a href="template/images/slider/1.jpg"
			title="Maecenas pharetra egestas adipiscing." class="colorbox"><img
			class="boxImage tiptop" src="template/images/boxes/1.jpg" alt=""
			title="&plusmn;&nbsp;zoom" /></a>

		<h3>Vente de PC Portable Asus</h3>
		<p>
			En bonne état, superbe configuration ...<a href="#">Read
				more&nbsp;&rarr;</a>
		</p>
	</div>

	<div class="grid_3">
		<a href="template/images/slider/2.jpg"
			title="Maecenas pharetra egestas adipiscing." class="colorbox"><img
			class="boxImage tiptop" src="template/images/boxes/2.jpg" alt=""
			title="&plusmn;&nbsp;zoom" /></a>

		<h3>PC Acer X</h3>
		<p>
			Hmiza pour vous ! <a href="#">Read more&nbsp;&rarr;</a>
		</p>
	</div>
</s:if>
<s:if test="%{p == \"b\"}">	
	<div class="grid_3">
		<a href="template/images/slider/4.jpg"
			title="Maecenas pharetra egestas adipiscing." class="colorbox"><img
			class="boxImage tiptop" src="template/images/boxes/4.jpg" alt=""
			title="&plusmn;&nbsp;zoom" /></a>

		<h3>Morbi fermentum sollicitudin diam vel vehicula</h3>
		<p>
			Maecenas pharetra egestas adipiscing. Nullam consequat velit in felis
			sodales in facilisis justo fringilla. Pellentesque nec lobortis
			dolor. Praesent et mi eu magna dapibus condimentum.&nbsp;<a href="#">Read
				more&nbsp;&rarr;</a>
		</p>
	</div>		
	<div class="grid_3">
		<a href="template/images/slider/4.jpg"
			title="Maecenas pharetra egestas adipiscing." class="colorbox"><img
			class="boxImage tiptop" src="template/images/boxes/4.jpg" alt=""
			title="&plusmn;&nbsp;zoom" /></a>

		<h3>Morbi fermentum sollicitudin diam vel vehicula</h3>
		<p>
			Maecenas pharetra egestas adipiscing. Nullam consequat velit in felis
			sodales in facilisis justo fringilla. Pellentesque nec lobortis
			dolor. Praesent et mi eu magna dapibus condimentum.&nbsp;<a href="#">Read
				more&nbsp;&rarr;</a>
		</p>
	</div>
	<div class="grid_3">
		<a href="template/images/slider/4.jpg"
			title="Maecenas pharetra egestas adipiscing." class="colorbox"><img
			class="boxImage tiptop" src="template/images/boxes/4.jpg" alt=""
			title="&plusmn;&nbsp;zoom" /></a>

		<h3>Morbi fermentum sollicitudin diam vel vehicula</h3>
		<p>
			Maecenas pharetra egestas adipiscing. Nullam consequat velit in felis
			sodales in facilisis justo fringilla. Pellentesque nec lobortis
			dolor. Praesent et mi eu magna dapibus condimentum.&nbsp;<a href="#">Read
				more&nbsp;&rarr;</a>
		</p>
	</div>	
</s:if> -->	