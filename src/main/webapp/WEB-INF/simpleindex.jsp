<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Toutes les matières</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.flatly.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/style.css">
<link
	href="${pageContext.request.contextPath}/bootstrap3-editable/css/bootstrap-editable.css"
	rel="stylesheet">


</head>
<body>
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
						<a href="#" class="btn btn-success" data-toggle="modal"
							data-target=".bs-example-modal-sm">admin</a>
					</p>
				</li>
			</ul>
		</div>
	</div>
	<!-- Small login modal -->
	<div class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog"
		aria-labelledby="mySmallModalLabel">


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
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						<button type="submit" class="btn btn-primary">Save
							changes</button>


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


			<c:forEach var="item" items="${list}">
				<tbody class="unite">
					<tr>
						<td><a id="nom" href="#" data-pk="${item.id_unite}"
							url="./UniteManip">${item.nom_unite}</a> <c:if
								test="${not empty item.listMatieres}">
								<a class="unitelink" data-pk="${item.id_unite}" href="#"
									url="./UniteManip"><span
									class="glyphicon glyphicon-menu-down" aria-hidden="true"></span>
								</a>
							</c:if></td>
						<td>${item.CM_unite}</td>
						<td>${item.TD_unite}</td>
						<td>${item.TP_unite}</td>
						<td>${item.ECTS_unite}</td>
						<td unitetotal="${item.id_unite}">${item.total_unite}</td>
	
					</tr>
				</tbody>
				<tbody id="${item.id_unite}" class="mat-hidden matieres">
					<c:forEach var="mat" items="${item.listMatieres}">
						<tr class="mat">
							<td>-${mat.nom_matiere}</td>
							<td>${mat.CM_matiere}</td>
							<td>${mat.TD_matiere}</td>
							<td>${mat.TP_matiere}</td>
							<td>${mat.ECTS_matiere}</td>
							<td matieretotal="${mat.id_matiere}">${mat.total_matiere}</td>
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
		src="${pageContext.request.contextPath}/js/script.js"></script>

	<script src="${pageContext.request.contextPath}/js/bootbox.min.js"></script>
</body>
</html>