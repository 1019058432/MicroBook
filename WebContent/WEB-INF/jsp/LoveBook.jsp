<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>万书阁</title>
<style>
body {
	background-color: #505050;
}

#Ur {
	width: 400px;
	height: 200px;
	border: double;
	position: absolute;
	left: 35%;
	top: 35%;
	background-color: #FFFFFF;
}

#BH {
	font-family: Microsoft Yahei;
	position: relative;
	left: 30px;
}

.SearchURL {
	position: relative;
	left: 60px;
	top: 25px;
}

#Button {
	width: 80px;
	color: #FFFFFF;
	background-color: #222222;
}

#CSet {
	opacity: 1;
}
</style>
</head>
<body>
	<div id="Ur">
		<h1 id="BH">URLBOOKRESOURSE</h1>
		<form action="<%=request.getContextPath()%>/links/link" method="post"
			class="SearchURL">
			<table>
				<tr>
					<td>URL</td>
					<td><input type="text" name="Links" id="CSet"></td>
					<td><input type="submit" value="搜索" id="Button"></td>
				</tr>
			</table>
		</form>
	</div>
	<div>
		<form action="<%=request.getContextPath()%>/show/showBooks" method="post">
		<input type="submit" value="去书库" id="Button">
		</form>
	</div>
</body>
</html>