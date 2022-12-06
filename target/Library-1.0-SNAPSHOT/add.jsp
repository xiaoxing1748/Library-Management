<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.java.servlet.BookAdd,com.java.library.Book" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="./css/main.css">
    <link rel="stylesheet" type="text/css" href="./css/login.css">
<title>图书馆信息管理系统</title>
</head>
<body>
	<div class="table_add" style="border: 1px solid #98bf21;
    border-radius: 10px;background-color: rgba(249, 252, 243, 0.884);width:300px">
	<form action="./BookAdd" method="post">
	<table class="table_add">
	</table>
	<tr><h1 class="top">新增图书</h1></tr>
	<tr>
		<td>
			<div>图书编号：</div><input type="text" name="book_id">
		</td>
	</tr>
	<tr>
		<td>
			<div>图书标题：</div><input type="text" name="book_title">
		</td>
	</tr>
	<tr>
		<td>
			<div>图书介绍：</div><input type="text" name="book_info">
		</td>
	</tr>
	<br>	
	<div  class="bottom">
		<input type="submit" value="提交" onclick="location.reload()" class="button_mini" ><input type="reset" value="重置" class="button_mini" >
	</div>
	</form>
	</div>
</body>
</html>