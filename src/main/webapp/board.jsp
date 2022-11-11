<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mosl"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
<title>MOSL-board</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="apple-touch-icon" href="img/apple-icon.png">
<link rel="shortcut icon" type="image/x-icon" href="img/favicon.ico">

<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/templatemo.css">
<link rel="stylesheet" href="css/custom.css">

<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Roboto:wght@100;200;300;400;500;700;900&display=swap">
<link rel="stylesheet" href="css/fontawesome.min.css">
<link rel="stylesheet" href="css/board.css">
</head>
<body>
	<!-- 네비게이션바 시작 -->
	<mosl:nav />
	<!-- 네비게이션바 종료 -->

	<!-- Modal -->
	<div class="modal fade bg-white" id="templatemo_search" tabindex="-1"
		role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-lg" role="document">
			<div class="w-100 pt-1 mb-5 text-right">
				<button type="button" class="btn-close" data-bs-dismiss="modal"
					aria-label="Close"></button>
			</div>
			<form action="" method="get"
				class="modal-content modal-body border-0 p-0">
				<div class="input-group mb-2">
					<input type="text" class="form-control" id="inputModalSearch"
						name="q" placeholder="Search ...">
					<button type="submit"
						class="input-group-text bg-success text-light">
						<i class="fa fa-fw fa-search text-white"></i>
					</button>
				</div>
			</form>
		</div>
	</div>



	<!-- Start Banner Hero -->
	<div id="boardMainBox">
		<div id="boardheader">
			<table>
				<thead>
					<tr>
						<th>글 번호</th>
						<th>제목</th>
						<th>글쓴이</th>
						<th>작성 일자</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="board" items="${datas}">
						<tr>
							<td>${board.bnum}</td>
							<td>${board.btitle}</td>
							<td>${board.bwriter}</td>
							<td>${board.bdate}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	<!-- End Featured Product -->


	<!-- Start Footer -->
	<mosl:footer />
	<!-- End Footer -->

	<!-- Start Script -->
	<script src="js/jquery-1.11.0.min.js"></script>
	<script src="js/jquery-migrate-1.2.1.min.js"></script>
	<script src="js/bootstrap.bundle.min.js"></script>
	<script src="js/templatemo.js"></script>
	<script src="js/custom.js"></script>
	<!-- End Script -->
</body>

</html>