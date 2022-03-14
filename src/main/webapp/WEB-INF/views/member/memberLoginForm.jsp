<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}
</style>
<!-- Custom styles for this template -->
<link href="resources/css/signin.css" rel="stylesheet">
<!-- Bootstrap core CSS -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="text-center">

	<main class="form-signin">
		<form id="frm" action="memberLogin.do" method="post">
			<img class="mb-4" src="resources/img/login-logo.svg" alt=""
				width="72" height="57">
			<h1 class="h3 mb-3 fw-normal">Please sign in</h1>

			<div class="form-floating">
				<input type="text" class="form-control" id="id" name="id"
					placeholder="ID..."> <label for="floatingInput">Id</label>
			</div>
			<div class="form-floating">
				<input type="password" class="form-control" id="password" name="password"
					placeholder="Password"> <label for="floatingPassword">Password</label>
			</div>

			<div class="checkbox mb-3">
				<label> <input type="checkbox" value="remember-me">
					Remember me
				</label>
			</div>
			<button class="w-100 btn btn-lg btn-primary" type="submit">Sign
				in</button>
			<p class="mt-5 mb-3 text-muted">&copy; 2017–2021</p>
		</form>
	</main>



</body>

</html>