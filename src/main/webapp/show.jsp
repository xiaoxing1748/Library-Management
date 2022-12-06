<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.java.servlet.BookFind" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示</title>
</head>
<body>
	<h1>查询信息</h1>
	<form action="./BookFind" method="post" name="booklist">
	<div>
		需要查询的书本标题：<input name="book_title" placeholder="空白则为查询所有图书"  style="padding-top: 5px;display:inline-block" class="input_text"  >
	<input type="submit" value="提交" class="button_little" >
	</div>
	</form>
	<div style="margin:0 auto">
		<%@ include file="list.jsp" %>
	</div>
</body>
</html>
<script src="./js/js.js"></script>