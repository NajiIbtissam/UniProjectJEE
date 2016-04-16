<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Toutes les matières</title>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<table class="table table-hover">
			<thead>
				<tr>
					<th>ID</th>
					<th>NOM</th>
					<th>CM</th>
					<th>TD</th>
					<th>TP</th>
					<th>ECTS</th>
					<th>TOTAL</th>
					<th>UNITE ENSEIGNEMENT</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach var="item" items="${list}">
					<tr>
						<td>${item.id_matiere}<br /></td>
						<td>${item.nom_matiere}<br /></td>
						<td>${item.CM_matiere}<br /></td>
						<td>${item.TD_matiere}<br /></td>
						<td>${item.TP_matiere}<br /></td>
						<td>${item.ECTS_matiere}<br /></td>
						<td>${item.total_matiere}<br /></td>
						<td>${item.uniteEn.nom_unite}<br /></td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>
</body>
</html>