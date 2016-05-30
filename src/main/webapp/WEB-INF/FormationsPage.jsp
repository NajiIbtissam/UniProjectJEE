<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formations</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.superhero.min.css">
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
						<a href="#" class="btn btn-primary" data-toggle="modal"
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


	<div class="container formations" style="margin-top: 8%;">
		<div class="row">
			<c:forEach var="formation" items="${formations}">
				<c:if test="${fn:containsIgnoreCase(formation.nom, 'Licence')}">
					<div class="col-md-4">
						<a
							href="${pageContext.request.contextPath}/DisplayUnites?id=${formation.id}"
							class="btn btn-success">${formation.nom}</a>
					</div>
				</c:if>
			</c:forEach>
		</div>
		<div class="row" style="margin-top: 10%;">

			<div class="col-md-2 "></div>
			<c:forEach var="formation" items="${formations}">
				<c:if test="${fn:containsIgnoreCase(formation.nom, 'Master')}">
					<div class="col-md-4">
						<a
							href="${pageContext.request.contextPath}/DisplayUnites?id=${formation.id}"
							class="btn btn-default">${formation.nom}</a>
					</div>
				</c:if>
			</c:forEach>
			<div class="col-md-2 "></div>
		</div>






	</div>


</body>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.12.3.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/script.js"></script>

<script src="${pageContext.request.contextPath}/js/bootbox.min.js"></script>

</html>