<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
	<head>
		<title>로그인화면</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="/resources/css/bootstrap.css">
		<link rel="stylesheet" href="/resources/css/main.css">
	</head>
	
	<body>

<!-- Two -->
	<section id="two" class="wrapper style2 special">
		<div class="inner narrow">
			<header>
				<h2>로그인 화면</h2>
			</header>
			<form method="post" action="/itx/loginCheck.do">
				<input value="${msg}">
				<div>
					<label for="id">아이디</label>
					<input name="id" id="id" type="text">
				</div>
				
				<div>
					<label for="password">비밀번호</label>
					<input name="password" id="password" type="password">
				</div>
				<div class="inner" style="padding-top:30px;">
				<ul class="actions">
					<li><input value="로그인" type="submit"></li>
					<li><input value="앞으로가기" type="button" onclick="location.href='/itx'"></li>
				</ul>
				</div>
				<div class="login_check">
					<span class="login_check_box">
						<input type="checkbox" id="login_chk" name="nvlong" class="" value="off">
						<label for="login_chk" id="label_login_chk" class="sp">로그인 상태 유지</label>
					</span>
				</div>
				<div class="copyright" style="padding-top:30px;">
					<ul style="list-style:none">
						<li><a href="/itx/signUp.do">회원가입</a></li>
						<li><a href="/itx/findInfo.do">아이디/비번 찾기</a></li>
					</ul>
				</div>
			</form>
		</div>
	</section>

		

<!-- Footer -->
	<footer id="footer">
		<div class="copyright">
			<a href="http://templated.co/">TEMPLATED</a>.
		</div>
	</footer>

<!-- Scripts -->
	<script src="/resources/js/jquery.min.js"></script>
	<script src="/resources/js/skel.min.js"></script>
	<script src="/resources/js/util.js"></script>
	<script src="/resources/js/main.js"></script>
	<script src="/resources/js/ie/respond.min.js"></script>
	
	<script type="text/javascript">
	
	

	
	
	
	</script>
</body>

</html>