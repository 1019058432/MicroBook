<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page import="java.util.*"%>
<%@ page import="com.entity.Chapter"%>
<%
	List<Chapter> chapters = new ArrayList<Chapter>();
	chapters = (List<Chapter>)request.getAttribute("bookNames");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <!-- Bootstrap -->
    <link href="../bootstarp/css/bootstrap.min.css" rel="stylesheet">
<title>小说章节目录</title>
<style>
body{background-color:#CCFFFF;}
#col{background-color:#CCFFFF;
  width:100%;}
  .container{
  white-space: nowrap;
  }
  .chapter-panel{width:400px;
  white-space: nowrap;
  float:left;}
 	.over{
	background-color:pink;
}
	.out{
	:#CCFFFF;
}
.chapter-panel:hover h2, .chapter-panel:hover h3 {
	color: #ff83bc;
	text-shadow: 0 0 0.6em #ff83bc;
}
.ma{margin-left:40px;}
</style>
</head>
<body>
<div>
<form action="<%=request.getContextPath()%>/show/showBooks" method="post">
		<input type="submit" value="去书库" id="Button">
		</form>
</div>
<div id="col">
<form  action="<%=request.getContextPath() %>/show/getName" method="post">
<input name="bname" type="text" value=<%String bookName = (String) request.getAttribute("bookName");out.print(bookName);%>  readonly="readonly" >
<select class="form-control" name="board.boFaterId" >
			<c:forEach items="${bookNames}" var="bookNames" >
				<option value="${bookNames.chapter}">${bookNames.chapter} </option>
			</c:forEach>
			
</select>
<input type="submit" value="搜索" id="Button">
<div class="ma">
			
			<%for (Chapter chapter:chapters) {%>
			<div class="chapter-panel">
				<a href="<%=request.getContextPath() %>/show/showe1a/<%out.print(chapter.getChapter());%>">
					<h3><%out.print(chapter.getChapter());%></h3>
				</a>
			</div>
			<%}%>
	    </div>
</form>
</div>
<script type="text/javascript">
/* var table=document.getElementsByTagName("div")[2];
<!-- 背景色 -->
table.onmouseover=function(){
var as=document.getElementsByTagName("a");
	for (var i=0;i<as.length;i++){
			as[i].onclick=function(){
				alert(this.childNodes[1].innerHTML);/* 获取章节名 */
			}
		}
} */
</script>
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="../bootstarp/js/jquery-3.4.1.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="../bootstarp/js/bootstrap.min.js"></script>
</body>
</html>

