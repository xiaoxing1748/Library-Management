<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.java.servlet.Login,com.java.library.Book" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="./css/main.css">
    <link rel="stylesheet" type="text/css" href="./css/login.css">
<title>图书馆信息管理系统</title>
</head>
<body>
	<div class="container">
        <div class="box">
            <div class="top">
                <div class="title">
                    登录
                </div>
            </div>
            <div class="middle">
                <form action="./Login" class="account_and_password" method="POST">
                    <div>
                        <label for="user_account">账号</label>
                        <input type="text" name="user_account" placeholder="12345678" value="12345678">
                    </div>
                    <p></p>
                    <div>
                        <label for="user_password">密码</label>
                        <input type="password" name="user_password" placeholder="12345678" value="12345678">
                    </div>
                    <div>
                        <button class="button" style="vertical-align:middle"><span>登录</span></button>   
                    </div>
                </form>
            </div>
            <div class="bottom">
                <div class="bottom_text">
                    <a href="./compoment/logout.php">登出当前账号</nuxt-link>
                </div>
            </div>
        </div>
    </div>
</body>
</html>