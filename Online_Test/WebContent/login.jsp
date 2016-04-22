<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
		<h1>登陆页面</h1>
		<hr>
		<form action="login" method="post">
			准考证号/教师号：<input type="text" name="name"><br>
			学生姓名/密码：<input type="password" name="password"><br>
			<input type="submit" value="学生登陆">
			<input type="submit" value="教师登陆"> 
		</form>
	
</center>
</body>
</html>