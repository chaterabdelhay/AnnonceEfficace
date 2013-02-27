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
		<p><a href="detailsAnnonce.action?annonceId=<s:property value="#resultObject[0].id"/>">Consulter</a></p>
	</div>
</s:iterator>