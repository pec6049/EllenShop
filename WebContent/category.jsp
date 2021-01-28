<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-expand navbar-light background color:#ffffff">
	<div class="container">
		
		<div>
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href="<c:url value="/products.jsp"/>">All</a></li>
				<li class="nav-item"><a class="nav-link" href="<c:url value="/outer.jsp"/>">Outer</a></li>
				<li class="nav-item"><a class="nav-link" href="<c:url value="/top.jsp"/>">Top</a></li>
				<li class="nav-item"><a class="nav-link" href="<c:url value="/pants.jsp"/>">Pants</a></li>
				<li class="nav-item"><a class="nav-link" href="<c:url value="/dress.jsp"/>">Dress</a></li>
			</ul>
		</div>
	</div>
</nav>