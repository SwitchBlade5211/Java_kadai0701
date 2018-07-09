<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>It Takes Everything！</title>
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
	<h1 align = "center">検索したい項目番号を入力してください。</h1><br>
	<form action="/kakeibo_kadai1/results" method="get">
		No,<input type="text" name="key"><br><br>
		<input type="submit" value="検索！！">
	</form>
	<br>
	<a href="/kakeibo_kadai1/adds">追加へ</a><br>
	<a href="/kakeibo_kadai1/deletes">削除へ</a>
</body>
</html>