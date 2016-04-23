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
					<th>ACTION</th>
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
						<td><a id="cm" href=# data-pk="${item.id_unite}"
							url="./UniteManip">${item.CM_unite}</a></td>
						<td><a id="td" href=# data-pk="${item.id_unite}"
							url="./UniteManip">${item.TD_unite}</a></td>
						<td><a id="tp" href=# data-pk="${item.id_unite}"
							url="./UniteManip">${item.TP_unite}</a></td>
						<td><a id="ects" href=# data-pk="${item.id_unite}"
							url="./UniteManip">${item.ECTS_unite}</a></td>
						<td unitetotal="${item.id_unite}">${item.total_unite}</td>
						<td  align="center"><a href="#" class="action addunite"><span
								class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span></a>
								
							&nbsp;<a class="action deleteunite" href="#" data-pk="${item.id_unite}"><span class="glyphicon glyphicon-remove"
								aria-hidden="true"></span></a></td>
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
							<td matieretotal="${mat.id_matiere}">${mat.total_matiere}</td>
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
</body>
</html>