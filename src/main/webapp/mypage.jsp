<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="mosl"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html lang="en">

<head>
<title>MOSL-mypage</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="apple-touch-icon" href="img/apple-icon.png">
<link rel="shortcut icon" type="image/x-icon" href="img/favicon.ico">

<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- <link rel="stylesheet" href="css/templatemo.css"> -->
<link rel="stylesheet" href="css/custom.css">

<!-- Load fonts style after rendering the layout styles -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Roboto:wght@100;200;300;400;500;700;900&display=swap">
<link rel="stylesheet" href="css/fontawesome.min.css">
<!-- 로그인 css -->
<!-- Load map styles -->
<link rel="stylesheet"
	href="https://unpkg.com/leaflet@1.7.1/dist/leaflet.css"
	integrity="sha512-xodZBNTC5n17Xt2atTPuE1HxjVMSvLVW9ocqUKLsCC5CXdbqCmblAshOMAS6/keqq/sMZMZ19scR4PsZChSR7A=="
	crossorigin="" />
<link rel="stylesheet" href="css/login.css">
<link rel="stylesheet" href="css/signup.css">
<link rel="stylesheet" href="css/mypage.css">
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

	<!-- 중간 div영역 시작 -->
	<h1 id="loginH1">
		<span>마</span>
		<span>이</span>
		<span>페</span>
		<span>이</span>
		<span>지</span>
	</h1>
	<div id="LoginMainDivBox">
		<div id="LoginBox">
			<form name="mypage" id="updateForm" action="update.do" method="post">
				<input name="mid" type="text" id="idInput" class="signupInput updateReadonly" value="${member.mid}" readonly/>
				<div id="checkID" class="checkMSG">
					<p>영문 대/소문자,숫자로 이루어진<br>최소7자리 최대15자리로 변경 가능</p>
				</div> 
				<input name="mpw" type="password" id="pwInput" class="signupInput"  value="${member.mpw}" autocomplete="off" required/>
				<div id="firstCheckPW" class="checkMSG">
					<p>비밀번호는 12자리 이상으로 변경해주세요!</p>
				</div>
				<input name="checkPW" type="password" id="checkPWInput" class="signupInput"  value="${member.mpw}" autocomplete="off" required/>
				<div id="checkPW" class="checkMSG">
					<p>일치합니다.</p>
				</div>
				<input name="mname" type="text" id="nameInput" class="signupInput"  value="${member.mname}" autocomplete="off" required/>
				<div id="checkName" class="checkMSG">
					<p>한국이름 - 2~5글자<br>영어이름 - 2~10(띄어쓰기 가능, first/last name)</p>
				</div>
				<input name="mbirth" type="text" id="birthInput" class="signupInput updateReadonly"  value="${member.mbirth}" readonly/>
				<input name="memail" type="text" id="emailInput" class="signupInput"  value="${member.memail}" required/>
				<input name="mphone" type="text" id="phoneInput" class="signupInput"  value="${member.mphone }" required/>
				<input name="madd" type="text" id="addInput" class="signupInput"  value="${member.madd }" required/>
				<label><input type="checkbox" id="signupCheckBox" value="이용약관 동의" required>변경사항 동의</label>
				<button type="submit" id="signupButton" disabled>정보변경하기</button>
			</form>
			<form name="deleteMypage" id="deleteForm" action="delete.do" method="post">
				<button type="submit" id="deleteMemberBTN">회원탈퇴</button>
			</form>
		</div>
	</div>
	<!-- 중간 div영역 종료 -->


	<!-- Start Footer -->
	<mosl:footer />
	<!-- End Footer -->

	<!-- Start Script -->	
	<script src="js/jquery-1.11.0.min.js"></script>
	<script src="js/jquery-migrate-1.2.1.min.js"></script>
	<script src="js/bootstrap.bundle.min.js"></script>
	<script src="js/templatemo.js"></script>
	<script src="js/custom.js"></script>
	<script src="js/signup.js"></script>
	<script src="js/mypage.js"></script>
	<!-- End Script -->
</body>

</html>