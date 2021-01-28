<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*"%>
<html>
<head>
<link rel="stylesheet" href="./resources/css/bootstrap.min.css" />
<title>Ellen(엘렌샵)</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<div class="text-center">
				<h1 class="display-5">Top</h1>
			</div>
		</div>
	</div>
	<%@ include file = "category.jsp" %>
	<div class="container">
		<div class="row" align="center">
		<%@ include file="dbconn.jsp"%>
			<%
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				String sql = "select * from top";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while (rs.next()) {
			%>
			<div class="col-md-4">
				<img src="./resources/images/<%=rs.getString("t_fileName")%>" style="width: 100%">
				<P>
				<h3><font size="3"><strong><%=rs.getString("t_name")%></strong></font></h3>
				<p><font size="2"><%=rs.getString("t_description")%></font>
				<p><font size="2"><%=rs.getString("t_UnitPrice")%>원</font>
				<p>
					<a href="./product.jsp?id=<%=rs.getString("t_id")%>"
						class="btn-sm btn btn-secondary" role="button">상세정보&raquo;></a>
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