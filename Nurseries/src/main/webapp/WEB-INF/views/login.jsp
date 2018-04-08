<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Welcome</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/style.css" />
</head>
<body>
	<section class="login-page">
		<div class="form">
			<form method="POST" action="login" class="login-form" id="login-form">
				<input type="text" name="nurseryName" placeholder="Nursery name" required /> 
				<input type="password" name="passwd" placeholder="Password" required />
				<button type="submit" form="login-form" value="submit">login</button>
			</form>
		</div>
	</section>
</body>
</html>