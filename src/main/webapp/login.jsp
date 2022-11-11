<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="mosl"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html lang="en">

<head>
<title>MOSL-board</title>
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
		<span>로</span>
		<span>그</span>
		<span>인</span>
	</h1>
	<div id="LoginMainDivBox">
		<div id="LoginBox">
			<form name="login" id="loginForm" action="login.do" method="post">
				<input name="mid" type="text" id="idInput" placeholder="아이디"	autocomplete="off"  required/>
				<div id="missID">
					<p>아이디는 12자리 이하 입력해주세요!</p>
				</div> 
				<!--<div id="blankID">
					<p>아이디를 입력해주세요.</p>
				</div> -->
				<input name="mpw" type="password" id="pwInput" placeholder="비밀번호" autocomplete="off" required/>
				<div id="missPW">
					<p>비밀번호는 12자리 이상 입력해주세요!</p>
				</div>
				<!-- <div id="blankPW">
					<p>비밀번호를 입력해주세요.</p>
				</div> -->
				<div>
					<button type="submit" id="loginBTN" disabled>로그인</button>
				</div>
			</form>
				<h2 class="loginLine">
				<span><a id="findUserInfo" href="findInfo.do">아이디/비밀번호 찾기</a></span>
				</h2>
			<hr id="loginHR">
			<h2 class="loginLine">
				<span>간편 로그인하기</span>
			</h2>
			<ul id="otherLogin">
				<li id="kakaoLogin" />
				<li id="naverLogin" />
			</ul>
				<form action="kakaoLogin.do" method="post" id="kakaoLoginForm">
					<input type="hidden" name="kakaoUserName" value="" id="kakaoUserName">
					<input type="hidden" name="loginType" value="" id="loginType">
				</form>
				<form action="naverLogin.do" method="post" id="naverLoginForm">
					<input type="hidden" name="naverUserName" value="" id="naverUserName">
					<input type="hidden" name="loginType" value="" id="loginType">
				</form>
				<hr id="loginHR">
				<div id="findUser">
				</div>
				<h2 class="loginLine">
					<span>아직 회원이 아니신가요?</span>	
				</h2>
				<div id="signupBOX" >
					<a id="signupBTN" href="signup.do">
					<span>회원가입</span>					
					</a>
				</div>
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
	<script src="js/login.js"></script>
	<!-- End Script -->
</body>

</html>