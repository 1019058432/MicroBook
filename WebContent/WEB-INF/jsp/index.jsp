<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<style>
body{
	background-color:#505050;
}
.Loginform{
	width:400px;
	height:200px;
	border:double;
 	position:absolute;
 	left:35%;
 	top:25%;
 	background-color:#89D5FF;
}
#lform{
position:relative;
left:30px;
top:25px;

}
</style>
</head>
<body>
<div class="Loginform">

<form action="<%=request.getContextPath() %>/user/checkLogin" method="post" id="lform"  >
 名字：<input type="text" name="name"><br><br>
        密码：<input type="text" name="password"><br><br>
        <button type="submit">登录</button>
</form>
</div>
</body>
</html>