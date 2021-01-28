<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<link rel = "stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>Ellen(엘렌샵)</title>
</head>
<body>
	<%@ include file = "menu.jsp" %>
	<%@ include file = "category.jsp" %>
	<div class = "jumbotron" style="background-color: #ffffff">
		<div class = "container">
			<div class = "text-center">
				<h1 class = "display-5">
					<img src="./resources/images/main.jpg" style="width: 100%">
				</h1>
			</div>
		</div>
	</div>
	<%@ include file = "admin.jsp"%>
	<hr>
	<div class = "text-center">
		<%@ include file = "footer.jsp" %>
	</div>
</body>
</html>