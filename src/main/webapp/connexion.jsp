

<!-- Include the header -->
<jsp:include page="header.jsp" />

<!-- BEGIN : page body content -->

<div id="sideBar">
	<img id="quickMenu" src="template/images/sideMenu.png" />
</div>

<!-- BEGIN CONTAINER -->
<div class="container_12">	   
    <br/><br/><br/>      	   	    	
	<div style="margin-left:160px;">
		<table id="login">
			<tr>
				<td>
					<form class="form-2">
						<h1><span class="log-in">Log in</span> or <span class="sign-up">sign up</span></h1>
						<p class="float">
							<label for="login"><i class="icon-user"></i>Username</label>
							<input type="text" name="login" placeholder="Username or email">
						</p>
						<p class="float">
							<label for="password"><i class="icon-lock"></i>Password</label>
							<input type="password" name="password" placeholder="Password" class="showpassword">
						</p>
						<p class="clearfix"> 
							<a href="#" class="log-twitter">Log in with Twitter</a>    
							<input type="submit" name="submit" value="Log in">
						</p>
					</form>	
				</td>
				<td>
					<div id="createAccount" style="line-height:30px;width:250px; font-size:13px; margin-left:50px; color:#555">
						
						<form class="form-2">
							<p style="font-weight:800;">Vous ne disposez pas de compte ?</p>
							<p style="text-align:justify;">Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat</p>
							<input type="submit" name="submitCreateAccount" value="Créer un compte">
							<br/>
						</form>												
					</div>
				</td>
			</tr>
		</table>		
							
	</div>
	
     <!-- begin .grid_12 - COMMENTS -->
     <div id="strip" class="grid_12">
         <img id="users" src="template/images/users.png" alt="" />
         <ul id="comments">
             <li>"Maecenas pharetra egestas adipiscing. Nullam consequat velit in felis sodales in facilisis justo fringilla. Pellentesque nec lobortis dolor. Praesent et mi eu magna dapibus condimentum."<br /><span class="signature">John Doe - 4 October 2011</span></li>
             <li>"Ut dapibus fringilla volutpat. Sed ullamcorper augue nec risus facilisis eu venenatis metus tristique. In hac habitasse platea dictumst. Aenean at lacus urna. Donec pretium mattis gravida."<br /><span class="signature">John Doe - 4 October 2011</span></li>
         </ul>
     </div><!-- end .grid_12 -->

</div><!-- END CONTAINER -->

<!-- END : page body content -->

<!-- Include the footer -->
<jsp:include page="footer.jsp" />