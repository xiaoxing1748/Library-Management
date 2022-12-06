<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.java.servlet.*,com.java.library.*,java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>修改图书信息</title>
</head>
<body>
<h1>修改图书信息</h1>
<form action="./BookUpdate" method="post">
    图书编号： <input name="book_id" value="${param.BookId}">
    <input type="hidden" name="temp_id" value="${param.BookId}">
    <br>
    图书标题： <input name="book_title" value="${param.BookTitle}">
    <br>
    图书介绍： <input name="book_info" value="${param.BookInfo}">
    <br>
    <input type="submit" value="提交" onclick="location.reload()"><input type="reset" value="重置">
</form>
</body>
</html>