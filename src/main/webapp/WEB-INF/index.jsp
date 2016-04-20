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
						<a href="#" class="btn btn-success">admin</a>
					</p>
				</li>
			</ul>
		</div>
	</div>


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
						<td><a id="nom" href="#" data-pk="${item.id_unite}">${item.nom_unite}</a>
							<a class="unitelink" data-pk="${item.id_unite}"><span
								class="glyphicon glyphicon-menu-down" aria-hidden="true"></span></a></td>
						<td><a id="cm" href=# data-pk="${item.id_unite}">${item.CM_unite}</a></td>
						<td><a id="td" href=# data-pk="${item.id_unite}">${item.TD_unite}</a></td>
						<td><a id="tp" href=# data-pk="${item.id_unite}">${item.TP_unite}</a></td>
						<td><a id="ects" href=# data-pk="${item.id_unite}">${item.ECTS_unite}</a></td>
						<td>${item.total_unite}</td>
					</tr>
				</tbody>
				<tbody id="${item.id_unite}" class="mat-hidden matieres">
					<c:forEach var="mat" items="${item.listMatieres}">
						<tr class="mat">
							<td>-<a id="nom" href=# data-pk="${mat.id_matiere}">${mat.nom_matiere}</a></td>
							<td><a id="cm" href=# data-pk="${mat.id_matiere}">${mat.CM_matiere}</a></td>
							<td><a id="td" href=# data-pk="${mat.id_matiere}">${mat.TD_matiere}</a></td>
							<td><a id="tp" href=# data-pk="${mat.id_matiere}">${mat.TP_matiere}</a></td>
							<td><a id="ects" href=# data-pk="${mat.id_matiere}">${mat.ECTS_matiere}</a></td>
							<td>${mat.total_matiere}</td>
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
	<script
		src="${pageContext.request.contextPath}/bootstrap3-editable/js/bootstrap-editable.js"></script>
</body>
</html>