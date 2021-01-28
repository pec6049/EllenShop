<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="dto.Product" %>
<%@ page import="dao.ProductRepository" %>
<%@ page errorPage="exceptionNoProductId.jsp" %>
<html>
<head>
<link rel = "stylesheet" href="./resources/css/bootstrap.min.css" />
<title>상품 상세 정보</title>
<script type="text/javascript">
	function addToCart() {
		if (confirm("상품을 장바구니에 추가하시겠습니까?")) {
			document.addForm.submit();
		} else {
			document.addForm.reset();
		}
	}
</script>
</head>
<body>
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<div class="text-center">
				<h1 class="display-5">상품 정보</h1>
			</div>
		</div>	
	</div>
	<%
		String id = request.getParameter("id");
		ProductRepository dao = ProductRepository.getInstance();
		Product product = dao.getProductById(id);
	%>
	<div class="container">
		<div class="row">
			<div class="col-md-5">
				<img src="./resources/images/<%=product.getFilename()%>" style="width: 100%">
			</div>
			<div class ="col-md-6">
				<p><font size="4"><b><%=product.getPname()%></b></font>
				<p><font size="2"><%=product.getDescription()%></font>
				<p><b>상품 코드 : </b><span class="badge badge-info"><%=product.getProductId()%></span>
				<p><b>제조사</b> : <%=product.getManufacturer()%>
				<p><b>분류</b> : <%=product.getCategory()%>
				<p><b>재고 수</b> : <%=product.getUnitsInStock()%>
				<p><%=product.getUnitPrice()%>원
				<p><form name="addForm" action="./addCart.jsp?id=<%=product.getProductId()%>" method="post">
						<a href="#" class="btn-sm btn btn-outline-info" onclick="addToCart()">상품 주문 &raquo;</a>
						<a href="./products.jsp" class="btn-sm btn btn-secondary">상품 목록 &raquo;</a>
				</form> 
			</div>
		</div>
		<hr>
	</div>
	<div class = "text-center">	
		<jsp:include page="footer.jsp" />
	</div>	
</body>
</html>