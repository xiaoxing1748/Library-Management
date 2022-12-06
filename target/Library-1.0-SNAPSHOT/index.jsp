<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书馆管理系统</title>
<link rel="stylesheet" type="text/css" href="./css/main.css">
<link rel="stylesheet" href="./css/table.css">
<link rel="stylesheet" href="./css/compoment.css">
</head>
<body>
	<div class="navigation">
        <div class="width">
            <div class="left" style="display: flex;line-height: 50px;">
            </div>
            <div class="right" style="display: flex;line-height: 50px;">
                <div style="margin-right: 20px;">欢迎，admin</div>
                <a href="./login.jsp">退出</a>
            </div>
        </div>
    </div>
    <div class="container">           
        <div class="mainmenu left" id="menu">
        	<div>
		        <h1 style="margin:0 auto;">轻图书馆</h1>
		        <a onclick="showbook()"><div class="button">图书搜索</div></a>
		        <a onclick="showadd()"><div class="button">添加图书</div></a>
		    </div>
        </div>
        <div class="middle">
            <div class="result">
				<div id="showbook">
					<%@ include file="show.jsp" %>
                </div>
	        <div class="add" id="showadd" style="display:none;">
				<%@ include file="add.jsp" %>
	        </div>
            </div>
        </div>         
    </div>
</body>
</html>
<script src="./js/js.js"></script>