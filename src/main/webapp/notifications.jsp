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
								<s:if test="%{#resultObject[4] != 1}">
									<div  class="notification_unreaded">
										<p>
											<s:property value="#resultObject[2]"/>
											<a style="float:right" href="readNotification.action?notificationId=<s:property value="#resultObject[0]"/>&lien=<s:property value="#resultObject[3]"/>">>></a>
										</p>
									</div>
								</s:if>																					
								<s:if test="%{#resultObject[4] == 1}">
									<div  class="notification_readed">
										<p>
											<s:property value="#resultObject[2]"/>
											<a style="float:right" href="readNotification.action?notificationId=<s:property value="#resultObject[0]"/>&lien=<s:property value="#resultObject[3]"/>">>></a>
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