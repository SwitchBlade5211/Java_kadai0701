<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dto.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>削除完了！</title>
<style>

body{font-size:18px;
background-image: url(file:///C:/Program%20Files/pleiades/workspace/kakeibo_kadai1/src/Photo/TigersBack2.jpg);
background-attachment : fixed;
background-repeat:repeat;}


form{color:#ffffff;
font-size:18px;}
a{color:#ffffff;
font-size:18px;}
p{color:#ffffff;
font-size:16px;}
h2{color:#ffffff;
font-size:18px;}
h1{color:#ffffff;
font-size:32px;}
</style>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");

	Employee delete = (Employee)request.getAttribute("employee");
%>

	<h2>削除完了！</h2><br><br>


	<a href="/kakeibo_kadai1/tops">一覧へ</a><br>
	<a href="/kakeibo_kadai1/adds">追加へ</a><br>
	<a href="/kakeibo_kadai1/deletes">削除へ</a>


</body>
</html>