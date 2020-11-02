<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <!-- Bootstrap -->
    <link href="../bootstarp/css/bootstrap.min.css" rel="stylesheet">
<title>小说内容</title>
<style>
#col{background-color:#CCFFFF;}
#form-control {
	height: 100%;
}
</style>
</head>
<body id="col">
<div class="container">
	<div id="Te " class="container lead">
		<form class="form-control"
			action="<%=request.getContextPath()%>/show/showBookName"
			method="post">
			<table>
				<tr>
					<td><input name="board.boFaterId" type="text" value=<%String bookName = (String) request.getAttribute("bookName");out.print(bookName);%>   readonly="readonly"></td>
					<td><input type="submit" value="返回目录" id="Button"></td>
				</tr>
				<tr>
					<td><p>
						<%
							String bookNames = (String) request.getAttribute("bookNames");
							out.print(bookNames);
						%></p>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="../bootstarp/js/jquery-3.4.1.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="../bootstarp/js/bootstrap.min.js"></script>
</body>
</html>