<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dto.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録！</title>
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
<h1 align = "center">新たに登録する情報を入力してください。</h1><br>
	<form action="/kakeibo_kadai1/addresult" method="get">
		No,<input type="text" name="num"><br><br>
		項目名:<input type="text" name="name1"><br><br>
		<input type="text" name="price">円の<select name="money">
		<option value="収入">収入</option>
		<option value="支出">支出</option>
		</select>
		<br><br>
		<br><br>

		<input type="submit" value="登録！">
	</form><br>
	<a href="/kakeibo_kadai1/tops">一覧へ</a><br>
	<a href="/kakeibo_kadai1/deletes">削除へ</a>
</body>
</html>