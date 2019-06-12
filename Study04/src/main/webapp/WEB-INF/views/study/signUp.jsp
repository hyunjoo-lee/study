<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입화면</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/resources/css/bootstrap.css">
<link rel="stylesheet" href="/resources/css/main.css">
</head>
<body>
<section id="two" class="wrapper style2">
	<div class="inner narrow">
		<header>
			<h2>회원가입</h2>
		</header>
		<form class="" method="post" action="#">
			<div class="narrow">
				<label for="name">이름</label>
				<input name="name" id="name" type="text">
			</div>
			<div class="narrow">
				<label for="grade">소속</label>
				<input name="grade" id="grade" type="text">
			</div>
			<div class="narrow">
				<label for="id">아이디</label>
				<input name="id" id="id" type="text">
			</div>
			<div class="narrow">
				<label for="pwd">비밀번호</label>
				<input name="pwd" id="pwd" type="password">
			</div>
			<ul class="actions" style="margin-top:60px">
				<li><input value="회원가입" type="submit"></li>
			</ul>
		</form>
	</div>
</section>

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