<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-expand navbar-light background color:#ffffff">
	<div class="container">
	<div class = "navbar-brand"> </div>
		<div>
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="<c:url value="/addProduct.jsp"/>"><font size="2">상품 등록</font></a></li>
				<li class="nav-item"><a class="nav-link" href="<c:url value="/editProduct.jsp?edit=update"/>"><font size="2">상품 수정</font></a></li>
				<li class="nav-item"><a class="nav-link" href="<c:url value="/editProduct.jsp?edit=delete"/>"><font size="2">상품 삭제</font></a></li>
			</ul>
		</div>
	</div>
</nav>