<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.java.servlet.BookFind,com.java.library.*,java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BookList</title>
</head>
<body>
	<% List<Book> BookList = (List)request.getAttribute("BookList");
		if(BookList==null){
			return;}else{
			%>
	<table border="1" id="table_customers">
		<tr>
			<th>图书编号</th>
			<th>图书标题</th>
			<th>图书介绍</th>
			<th>操作</th>
			<th>操作</th>
		</tr>
		<%
			for(Book temp:BookList){
				%>
				<tr  class="table_tabbar">
					<td><%=temp.getBookId() %></td>
					<td><%=temp.getBookTitle() %></td>
					<td><%=temp.getBookInfo() %></td>
					<td><a href="./update.jsp?BookId=<%=temp.getBookId() %>&BookTitle=<%=temp.getBookTitle() %>&BookInfo=<%=temp.getBookInfo() %>">修改</td>
					<td><a href="./delete.jsp?BookId=<%=temp.getBookId() %>&BookTitle=<%=temp.getBookTitle() %>&BookInfo=<%=temp.getBookInfo() %>">删除</td>
				</tr>
					<%
			}
		}
	%>		
	</table>
</body>
</html>
<script src="./js/js.js"></script>