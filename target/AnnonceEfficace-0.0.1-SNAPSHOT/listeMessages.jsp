<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!-- Include the header -->
<jsp:include page="header.jsp" />

<!-- BEGIN : page body content -->

<!-- BEGIN CONTAINER -->
<div class="container_12">
	<br /> <br /> <br />
	
	<div style="margin-left: 160px;">
	
		<table id="login">
			<tr>
			
				<td>
					<div class="form-2">
						Charger la liste des messages ici<br/>
						<a href="#" class="show_hide">envoyer message</a>
						<div class="slidingDiv">
<s:form action="envoyerMessage">

      <s:textarea name="contenuMessage" rows="10" cols="40"/>
      <table>
     								<tr><td>	<label>destinataire</label> </td>
     								</tr>
     								<tr>
										<td><s:select list="users" name="userId"/>
													</td>																														
										</tr>
										
										<tr><td><input type="submit" value="envoyer"></td></tr>
										</table>
										
										
      </s:form>
    </div>
    <script>
	$(document).ready(function(){


    $(".slidingDiv").hide();
	$(".show_hide").show();
	
	$('.show_hide').click(function(){
	$(".slidingDiv").slideToggle();
	});

});
	
	</script>
					</div>
					
				</td>
			</tr>
		</table>

	</div>

	<!-- begin .grid_12 - COMMENTS -->
	<div id="strip" class="grid_12">
		<img id="users" src="template/images/users.png" alt="" />
		<ul id="comments">
			<li>"Maecenas pharetra egestas adipiscing. Nullam consequat
				velit in felis sodales in facilisis justo fringilla. Pellentesque
				nec lobortis dolor. Praesent et mi eu magna dapibus condimentum."<br />
				<span class="signature">John Doe - 4 October 2011</span>
			</li>
			<li>"Ut dapibus fringilla volutpat. Sed ullamcorper augue nec
				risus facilisis eu venenatis metus tristique. In hac habitasse
				platea dictumst. Aenean at lacus urna. Donec pretium mattis
				gravida."<br /> <span class="signature">John Doe - 4 October
					2011</span>
			</li>
		</ul>
	</div>
	<!-- end .grid_12 -->

</div>
<!-- END CONTAINER -->

<!-- END : page body content -->

<!-- Include the footer -->
<jsp:include page="footer.jsp" />