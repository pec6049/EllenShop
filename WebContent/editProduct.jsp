<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*"%>
<html>
<head>
<link rel="stylesheet" href="./resources/css/bootstrap.min.css" />
<title>Ellen(엘렌샵)</title>
<script type="text/javascript">
	function deleteConfirm(id) {
		if (confirm("해당 상품을 삭제합니다!!") == true)
			location.href = "./deleteProduct.jsp?id=" + id;
		else
			return;
	}
</script>
</head>
<%
	String edit = request.getParameter("edit");
%>
</head>
<body>
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<div class="text-center">
				<h1 class="display-5">상품 편집</h1>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="text-right">
			<a href="logout.jsp" class="btn btn-sm btn-outline-secondary pull-right">logout</a>
			<p>
			
		</div>
	</div>		
	<div class="container">
		<div class="row" align="center">
			<%@ include file="dbconn.jsp"%>
			<%
			
				PreparedStatement pstmt = null;
				ResultSet rs = null;
			
				String sql = "select * from product";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while (rs.next()) {
			%>
			<div class="col-md-4">
				<img src="c:/upload/<%=rs.getString("p_fileName")%>" style="width: 100%">
				<p>
				<h3><font size="3"><strong><%=rs.getString("p_name")%></strong></font></h3>
				<p><font size="2"><%=rs.getString("p_description")%></font>
				<p><font size="2"><%=rs.getString("p_UnitPrice")%>원</font>
				<p>
					<%
						if (edit.equals("update")) {
					%>
					<a href="./updateProduct.jsp?id=<%=rs.getString("p_id")%>"	class="btn-sm btn btn-outline-secondary" role="button"> 수정 &raquo;></a>
					<%
						} else if (edit.equals("delete")) {
					%>
					<a href="#" onclick="deleteConfirm('<%=rs.getString("p_id")%>')" class="btn-sm btn btn-outline-secondary" role="button">삭제 &raquo;></a>
					<%
						}
					%>				
			</div>
			<%
				}
				if (rs != null)
					rs.close();
	 			if (pstmt != null)
	 				pstmt.close();
	 			if (conn != null)
					conn.close();
	 			%>
		</div>
		<hr>
	</div>
	<div class = "text-center">	
		<jsp:include page="footer.jsp" />
	</div>	
</body>
</html>