<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!-- Include the header -->
<jsp:include page="header.jsp" />

<!-- BEGIN : page body content -->

<!-- BEGIN CONTAINER -->
<div class="container_12">
	<br/><br/><br/><br/><br/><br/>
	
	<div>
	 
				<div>
					<h3>Vos notifications</h3><br/>											
						<s:iterator value="notifications" var="resultObject"> 														
								<s:if test="%{#resultObject.id == 3}">
									<div  class="notification_unreaded">
										<p>
											<s:property value="#resultObject.contenu"/>
											<a style="float:right" href="#">>></a>
										</p>
									</div>
								</s:if>																					
								<s:if test="%{#resultObject.id != 3}">
									<div  class="notification_readed">
										<p>
											<s:property value="#resultObject.contenu"/>
											<a style="float:right" href="#">>></a>
										</p>
									</div>
								</s:if>
						</s:iterator>											
				</div>				
	</div>
<!-- END CONTAINER -->

<!-- END : page body content -->

<!-- Include the footer -->
<jsp:include page="footer.jsp" />