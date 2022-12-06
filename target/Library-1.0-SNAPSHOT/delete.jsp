<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.java.servlet.BookDelete,com.java.library.*,java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改图书信息</title>
</head>
<body>
<h1>确认删除图书记录？</h1>
	<form action="./BookDelete" method="post">
	<input name="temp_id" value="${param.BookId}" type="hidden">
	图书编号： <input name="book_id" value="${param.BookId}" disabled="true">
	<br>
	图书标题： <input name="book_title" value="${param.BookTitle}" disabled="true">
	<br>
	图书介绍： <input name="book_info" value="${param.BookInfo}" disabled="true">
	<br>	
	<input type="submit" value="确认删除" onclick="location.reload()">
	</form>
</body>
</html>