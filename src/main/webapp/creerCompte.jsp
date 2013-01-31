<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!-- Include the header -->
<jsp:include page="header.jsp" />

<!-- BEGIN : page body content -->

<div id="sideBar">
	<img id="quickMenu" src="template/images/sideMenu.png" />
</div>

<!-- BEGIN CONTAINER -->
<div class="container_12">
	<br /> <br /> <br />
	<div style="margin-left: 160px;">
		<table id="login">
			<tr>
				<td>
					<div class="form-2">
						<table>
							<tr>
								<td><s:form action="createcompte" theme="css_xhtml"
										style="width:550px">
										<h1>
											<span class="log-in">Création de compte</span>
										</h1>
										<p>
											<label for="login">Nom d'utilisateur</label>
											<s:textfield name="user.nomUtilisateur" maxlength="20"
												id="user_nomUtilisateur" />											
    										<a id="link2" href="#">test</a>
    										<script>
    										$( "#link2" ).click(function(){
    											alert("ajax_createAccounctVerification?nomUtilisateur=" + $('#user_nomUtilisateur').val());
    										    $.ajax({
    											   type: "GET",
    											   url: "ajax_createAccounctVerification?nomUtilisateur=" + $('#user_nomUtilisateur').val(),
    											   error:function(msg){
    											     alert( "Error !: " + msg );
    											   },
    											   success:function(data){
    											   	//affiche le contenu du fichier dans le conteneur dédié
    												$('#msg').html(data);
    											}});
    										});
    										</script>
    										
    										<div id="msg"></div>
										</p>
										<p>
											<label for="password">Mot de passe</label>
											<s:textfield type="password" name="user.motDePasse"
												maxlength="20" id="user.motDePasse"
												placeholder="Mot de passe" class="showpassword" />
										</p>
										<p>
											<label for="confirmPassword">Confirmation du mot de passe</label>
											<s:textfield type="password" name="confirmPassword"
												maxlength="20" id="confirmPassword"
												placeholder="reindiquez votre mot de passe"
												class="showpassword" />
										</p>
										<p>
											<label for="email">E-mail</label>
											<s:textfield name="user.email" maxlength="20" id="email"
												placeholder="votre email, ex: mohamed@gmail.com" />
										</p>
										<p>
											<label for="email">Telephone</label>
											<s:textfield name="user.telephone" maxlength="20"
												id="telephone" placeholder="votre numéro de téléphone" />
										</p>
										<p>
											<label for="villeId">Ville</label> <select id="villeId"
												name="user.villeId" class="form-select required"><option
													value="95">Agadir</option>
												<option value="87">Aghram</option>
												<option value="6">Ain Chair</option>
												<option value="85">Akka</option>
												<option value="14">Aknoul</option>
												<option value="57">Araich</option>
												<option value="51">Arbaoua</option>
												<option value="19">Arfoud</option>
												<option value="94">Assa</option>
												<option value="54">Assila</option>
												<option value="86">Azemmour</option>
												<option value="65">Azilal</option>
												<option value="37">Azrou</option>
												<option value="5">Berkane</option>
												<option value="82">Bengrir</option>
												<option value="62">Beni Mellal</option>
												<option value="73">Benslimane</option>
												<option value="78">Berrchid</option>
												<option value="10">Bouanan</option>
												<option value="3">Bouarfa</option>
												<option value="104">Boujdour</option>
												<option value="28">Autre</option>
												<option value="18">Bourd</option>
												<option value="12">Boutajit</option>
												<option value="74">Bouzniqua</option>
												<option value="80">Casablanca</option>
												<option value="38">Chefchaoun</option>
												<option value="105">Dakhla</option>
												<option value="72">Demnat</option>
												<option value="75">El Gara</option>
												<option value="88">El Jadida</option>
												<option value="101">Essmara</option>
												<option value="93">Ezzak</option>
												<option value="32">Fès</option>
												<option value="1">Fiqiq</option>
												<option value="106">Gouira</option>
												<option value="98">Guelmima</option>
												<option value="11">Guersif</option>
												<option value="41">Hajeb</option>
												<option value="63">Heskoura</option>
												<option value="15">Husseima</option>
												<option value="35">Ifrane</option>
												<option value="33">Imouzar</option>
												<option value="4">Jerada</option>
												<option value="67">Kénitra</option>
												<option value="56">Kalaa Magouna</option>
												<option value="77">Kalaa Sraghna</option>
												<option value="50">Kasr Lekbir</option>
												<option value="59">Kesba Tadla</option>
												<option value="55">Khemissat</option>
												<option value="45">Khenifra</option>
												<option value="70">Khouribga</option>
												<option value="103">Laayoune</option>
												<option value="84">Marrakech</option>
												<option value="43">Meknès</option>
												<option value="25">Menzel Beni Yazgha</option>
												<option value="29">Midelt</option>
												<option value="16">Missour</option>
												<option value="76">Mouhammadia</option>
												<option value="58">Moulay Bouazza</option>
												<option value="36">Moulay Yaqoub</option>
												<option value="8">Nador</option>
												<option value="21">Ouad Amlil</option>
												<option value="64">Ouad Zem</option>
												<option value="71">Ouarzazat</option>
												<option value="44">Ouazzan</option>
												<option value="2">Oujda</option>
												<option value="69" selected="selected">Rabat et
													Salé</option>
												<option value="23">Rachidia</option>
												<option value="24">Rich</option>
												<option value="20">Rissani</option>
												<option value="68">Rommani</option>
												<option value="92">Safi</option>
												<option value="97">Saouira</option>
												<option value="30">Sefrou</option>
												<option value="79">Settat</option>
												<option value="99">Sidi Ifni</option>
												<option value="46">Sidi Kacem</option>
												<option value="52">Sidi Slimane</option>
												<option value="60">Sidi Yehya</option>
												<option value="53">Souk Elarbeaa</option>
												<option value="40">Tétouan</option>
												<option value="91">Tafraout</option>
												<option value="22">Tahla</option>
												<option value="81">Talouin</option>
												<option value="13">Tandit</option>
												<option value="48">Tanger</option>
												<option value="100">Tantan</option>
												<option value="26">Taounat</option>
												<option value="7">Taourirt</option>
												<option value="90">Taroudant</option>
												<option value="83">Tata</option>
												<option value="17">Taza</option>
												<option value="102">Terfaya</option>
												<option value="61">Tiffelt</option>
												<option value="34">Tinjad</option>
												<option value="47">Tizi oussli</option>
												<option value="96">Tiznit</option>
												<option value="89">Youssoufia</option>
												<option value="49">Zagoura</option>
												<option value="42">Zerhoun</option>
												<option value="27">Tissa</option></select>
										</div>
										</p>
										<p class="clearfix">
											<input type="submit" value="Créer">
										</p>
									</s:form></td>
							</tr>
						</table>
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