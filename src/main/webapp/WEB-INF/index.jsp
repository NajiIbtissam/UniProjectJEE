<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Toutes les matières</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.superhero.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/style.css">
<link
	href="${pageContext.request.contextPath}/bootstrap3-editable/css/bootstrap-editable.css"
	rel="stylesheet">


</head>
<body>
	<c:if test="${!empty sessionScope.username}">

		<div class="navbar navbar-default navbar-static-top">
			<div class="container">
				<div class="navbar-header">
					<a href="../" class="navbar-brand">Formation</a>
					<button class="navbar-toggle" type="button" data-toggle="collapse"
						data-target="#navbar-main">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
				</div>
				<ul class="nav navbar-nav navbar-right">
					<!-- 				<li> -->
					<!-- 					<p class="navbar-btn"> -->
					<%-- 							<a href="#">Hello ${sessionScope.username}</a> --%>
					<!-- 					</p> -->
					<!-- 				</li> -->
					<li><a href="#">Hello ${sessionScope.username}</a></li>
					<li><a href="#" id="logout">Disconnect</a></li>
					<li><a href="#" class="action" data-toggle="modal"
						data-target="#modaladdunite">Ajouter Unité</a></li>

				</ul>

			</div>
		</div>


		<!-- Ajout Unité modal -->
		<div class="modal fade" id="modaladdunite" tabindex="-1" role="dialog"
			aria-labelledby="mySmallModalLabel">


			<div class="modal-dialog modal-lg">
				<form id="addUnite" action="UniteManip" method="post">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
							<h4 class="modal-title" id="myModalLabel">Ajout Unité</h4>
						</div>

						<div class="modal-body">

							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<input id="nom" name="nom" type="text" placeholder="Nom"
											class="form-control input-md">
									</div>
									<div class="form-group">
										<input id="cm" name="cm" type="text" placeholder="CM"
											class="form-control input-md">
									</div>

									<div class="form-group">
										<input id="td" name="td" type="text" placeholder="TD"
											class="form-control input-md">
									</div>

									<div class="form-group">
										<input id="tp" name="tp" type="text" placeholder="TP"
											class="form-control input-md">
									</div>

									<div class="form-group">
										<input id="ects" name="ects" type="text" placeholder="ECTS"
											class="form-control input-md">
									</div>

									<div class="form-group">
										<input id="action" name="action" type="hidden" value="create"
											class="form-control input-md">
									</div>
								</div>
							</div>

						</div>

						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Close</button>
							<button type="submit" class="btn btn-primary">Save</button>


						</div>
					</div>
				</form>

			</div>

		</div>

		<!-- End Ajout Unité modal -->

		<!-- Small login modal -->
		<div class="modal fade bs-example-modal-sm" tabindex="-1"
			role="dialog" aria-labelledby="mySmallModalLabel">


			<div class="modal-dialog modal-sm">
				<form id="log" action="LoginAdmin" method="post">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
							<h4 class="modal-title" id="myModalLabel">Login</h4>
						</div>

						<div class="modal-body">

							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<input name="username" type="text" class="form-control"
											id="name" placeholder="Name">
									</div>
									<div class="form-group">
										<input name="password" type="password" class="form-control"
											id="pwd" placeholder="Password">
									</div>
								</div>
							</div>

						</div>

						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Close</button>
							<button type="submit" class="btn btn-primary">Save
								changes</button>


						</div>
					</div>
				</form>

			</div>

		</div>

		<!-- 		End Small login modal -->

		<!-- 				Ajout Matière modal -->
		<div class="modal fade" id="modaladdmatiere" tabindex="-1"
			role="dialog" aria-labelledby="mySmallModalLabel">


			<div class="modal-dialog modal-lg">
				<form id="addMatiere" action="MatiereManip" method="post">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
							<h4 class="modal-title" id="myModalLabel">Ajout Matière</h4>
						</div>

						<div class="modal-body">

							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<input id="nom" name="nom" type="text" placeholder="Nom"
											class="form-control input-md">
									</div>
									<div class="form-group">
										<input id="cm" name="cm" type="text" placeholder="CM"
											class="form-control input-md">
									</div>

									<div class="form-group">
										<input id="td" name="td" type="text" placeholder="TD"
											class="form-control input-md">
									</div>

									<div class="form-group">
										<input id="tp" name="tp" type="text" placeholder="TP"
											class="form-control input-md">
									</div>

									<div class="form-group">
										<input id="ects" name="ects" type="text" placeholder="ECTS"
											class="form-control input-md">
									</div>

									<div class="form-group">
										<input id="action" name="action" type="hidden" value="create"
											class="form-control input-md">
									</div>
									<div class="form-group">
										<input id="hiddenid" name="id" type="hidden"
											class="form-control input-md">
									</div>

								</div>
							</div>

						</div>

						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Close</button>
							<button type="submit" class="btn btn-primary">Save</button>


						</div>
					</div>
				</form>

			</div>

		</div>

		<!-- End Ajout Matière modal -->



		<div class="container">

			<table class="table table-hover table-bordered table-responsive"
				border="3px;">
				<thead>
					<tr>
						<th>NOM</th>
						<th>CM</th>
						<th>TD</th>
						<th>TP</th>
						<th>ECTS</th>
						<th>TOTAL</th>
						<th>ACTION</th>
					</tr>
				</thead>


				<c:forEach var="item" items="${formation.unites}">
					<tbody class="unite">
						<tr>
							<td><a id="nom" href="#" data-pk="${item.id}"
								url="./UniteManip">${item.nom}</a> <c:if
									test="${not empty item.listMatieres}">
									<a class="unitelink" data-pk="${item.id}" href="#"
										url="./UniteManip"><span
										class="glyphicon glyphicon-menu-down" aria-hidden="true"></span>
									</a>
								</c:if></td>
							<td><a id="cm" href=# data-pk="${item.id}"
								url="./UniteManip">${item.cm}</a></td>
							<td><a id="td" href=# data-pk="${item.id}"
								url="./UniteManip">${item.td}</a></td>
							<td><a id="tp" href=# data-pk="${item.id}"
								url="./UniteManip">${item.tp}</a></td>
							<td><a id="ects" href=# data-pk="${item.id}"
								url="./UniteManip">${item.ects}</a></td>
							<td unitetotal="${item.id}">${item.total}</td>


							<td><a class="action addmatierelink" href="#"
								data-toggle="modal" data-target="#modaladdmatiere"
								data-pk="${item.id}"><span
									class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span></a>

								&nbsp;<a class="action deleteunite" href="#"
								data-pk="${item.id}"><span
									class="glyphicon glyphicon-remove" aria-hidden="true"></span></a></td>
						</tr>
					</tbody>
					<tbody id="${item.id}" class="mat-hidden matieres">
						<c:forEach var="mat" items="${item.listMatieres}">
							<tr class="mat">
								<td>-<a id="nom" href=# data-pk="${mat.id}">${mat.nom}</a></td>
								<td><a id="cm" href=# data-pk="${mat.id}">${mat.cm}</a></td>
								<td><a id="td" href=# data-pk="${mat.id}">${mat.td}</a></td>
								<td><a id="tp" href=# data-pk="${mat.id}">${mat.tp}</a></td>
								<td><a id="ects" href=# data-pk="${mat.id}">${mat.ects}</a></td>
								<td matieretotal="${mat.id}">${mat.total}</td>
								<td class="action deletematiere" href="#" data-pk="${mat.id}"><span
									class="glyphicon glyphicon-remove" aria-hidden="true"></span></td>
							</tr>

						</c:forEach>
						<div class="modal fade" tabindex="-1" role="dialog">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal"
											aria-label="Close">
											<span aria-hidden="true">&times;</span>
										</button>
										<h4 class="modal-title">Modal title</h4>
									</div>
									<div class="modal-body">
										<p>One fine body&hellip;</p>
									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-default"
											data-dismiss="modal">Close</button>
										<button type="button" class="btn btn-primary">Save
											changes</button>
									</div>
								</div>
								<!-- /.modal-content -->
							</div>
							<!-- /.modal-dialog -->
						</div>
						<!-- /.modal -->

					</tbody>
				</c:forEach>

			</table>
		</div>
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/js/jquery-1.12.3.min.js"></script>
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/js/script.js"></script>
		<script
			src="${pageContext.request.contextPath}/bootstrap3-editable/js/bootstrap-editable.js"></script>
		<script src="${pageContext.request.contextPath}/js/bootbox.min.js"></script>

		<%-- 	<jsp:forward page="/KillSession"/>  --%>

	</c:if>




	<c:if test="${empty sessionScope.username}">


		<div class="navbar navbar-default navbar-static-top">
			<div class="container">
				<div class="navbar-header">
					<a href="../" class="navbar-brand">Formation</a>
					<button class="navbar-toggle" type="button" data-toggle="collapse"
						data-target="#navbar-main">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
				</div>
				<ul class="nav navbar-nav navbar-right">
					<li>
						<p class="navbar-btn">
							<a href="#" class="btn btn-primary" data-toggle="modal"
								data-target=".bs-example-modal-sm">Login as Admin</a>
						</p>
					</li>
				</ul>
			</div>
		</div>
		<!-- Small login modal -->
		<div class="modal fade bs-example-modal-sm" tabindex="-1"
			role="dialog" aria-labelledby="mySmallModalLabel">


			<div class="modal-dialog modal-sm">
				<form id="log" action="LoginAdmin" method="post">

					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
							<h4 class="modal-title" id="myModalLabel">Modal title</h4>
						</div>

						<div class="modal-body">

							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<input name="username" type="text" class="form-control"
											id="name" placeholder="Name">
									</div>
									<div class="form-group">
										<input name="password" type="password" class="form-control"
											id="pwd" placeholder="Password">
									</div>
								</div>
							</div>

						</div>

						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Close</button>
							<button id="adminlogin" type="submit" class="btn btn-primary">Login
								!</button>


						</div>
					</div>
				</form>

			</div>

		</div>

		<!-- End Small login modal -->

		<div class="container">

			<table class="table table-hover table-bordered table-responsive"
				border="3px;">
				<thead>
					<tr>
						<th>NOM</th>
						<th>CM</th>
						<th>TD</th>
						<th>TP</th>
						<th>ECTS</th>
						<th>TOTAL</th>
					</tr>
				</thead>


				<c:forEach var="item" items="${formation.unites}">
					<tbody>
						<tr>
							<td><a>${item.nom}</a> <c:if
									test="${not empty item.listMatieres}">
									<a class="unitelink" data-pk="${item.id}" href="#"><span
										class="glyphicon glyphicon-menu-down" aria-hidden="true"></span>
									</a>
								</c:if></td>
							<td>${item.cm}</td>
							<td>${item.td}</td>
							<td>${item.tp}</td>
							<td>${item.ects}</td>
							<td unitetotal="${item.id}">${item.total}</td>

						</tr>
					</tbody>
					<tbody id="${item.id}" class="mat-hidden">
						<c:forEach var="mat" items="${item.listMatieres}">
							<tr>
								<td>-${mat.nom}</td>
								<td>${mat.cm}</td>
								<td>${mat.td}</td>
								<td>${mat.tp}</td>
								<td>${mat.ects}</td>
								<td matieretotal="${mat.id}">${mat.total}</td>
							</tr>

						</c:forEach>


					</tbody>
				</c:forEach>

			</table>
		</div>
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/js/jquery-1.12.3.min.js"></script>
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/bootstrap3-editable/js/bootstrap-editable.min.js"></script>
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/js/script.js"></script>

		<script src="${pageContext.request.contextPath}/js/bootbox.min.js"></script>

	</c:if>
</body>
</html>