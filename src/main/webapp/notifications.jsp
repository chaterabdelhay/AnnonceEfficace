<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!-- Include the header -->
<jsp:include page="header.jsp" />

<!-- BEGIN : page body content -->

<!-- BEGIN CONTAINER -->
<div class="container_12">
	<br /> <br /> <br />
	
	<div>
	 
				<div class="form-2">
					<h3>Vos notifications</h3>
					<hr/><br/>										
						<s:iterator value="notifications" var="resultObject"> 							
							<p><s:property value="#resultObject.contenu"/></p>						
						</s:iterator>											
				</div>				
	</div>
<!-- END CONTAINER -->

<!-- END : page body content -->

<!-- Include the footer -->
<jsp:include page="footer.jsp" />