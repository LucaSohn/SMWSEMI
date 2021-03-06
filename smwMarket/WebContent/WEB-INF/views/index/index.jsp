<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/common.css" />
</head>
<body>
	<div class="Wrapper">
		<!-- header -->
		<header class="topWrapper">
			<div class="top">
				<!-- 로고 -->
				<h2>SMW</h2>
				<div class="topMenu">
					<!-- 상단 메뉴 -->
					<!-- 회원가입,로그인,마이페이지,고객센터(Q&A)  -->
					<ul>
						<li><a href="">회원가입</a></li>
						<li><a href="">로그인</a></li>
						<li><a href="">고객센터</a></li>
					</ul>
				</div>

				<!-- 메인 메뉴단 -->
				<nav class="mainMenu">
					<!-- 지역화폐란?,공지사항,리뷰, 중고장터, 전통시장 검색 -->
					<ul>
						<li><a href="">지역화폐란?</a></li>
						<li><a href="">공지사항</a></li>
						<li><a href="">전통시장 검색</a></li>
						<li><a href="">리뷰</a></li>
						<li><a href="">중고장터</a></li>
					</ul>
				</nav>
			</div>
		</header>

		<!-- 메인 -->
		<section class="middle">
			<!-- 게시판이 보여지는 main  -->
			<div class="board1">
				<h3>리뷰</h3>
			</div>
			<div class="board2">
				<h3>중고장터</h3>
			</div>
		</section>

		<!-- footer -->
		<footer class="bottom">
			<div class="tofooter">하단입니다.</div>
		</footer>
	</div>
</body>
</html>