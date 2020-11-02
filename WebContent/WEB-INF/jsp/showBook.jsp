<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page import="java.util.*"%>
<%@ page import="com.entity.BookNames"%>
<%
	List<BookNames> chapters = new ArrayList<BookNames>();
	chapters = (List<BookNames>)request.getAttribute("bookNames");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>全部小说</title>
<style>
#col{background-color:#CCFFFF;
  width:100%;}
  body{background-color:#CCFFFF;}
</style>
</head>
<body>
<div>
<form action="<%=request.getContextPath()%>/links/chek" method="post">
		<input type="submit" value="去存书" id="Button">
		</form>
</div>
<div id="col">
<form  action="<%=request.getContextPath() %>/show/showBookName" method="post">
<select class="form-control" name="board.boFaterId" >
			<c:forEach items="${bookNames}" var="bookNames" >
				<option value="${bookNames.bookname}">${bookNames.bookname} </option>
			</c:forEach>
			
</select>
<input type="submit" value="搜索" id="Button">
</form>
</div>
<div class="ma">
		<form>	
			<%for (BookNames chapter:chapters) {%>
			<div class="chapter-panel">
				<a href="<%=request.getContextPath() %>/show/getName/<%out.print(chapter.getBookname());%>">
					<h3><%out.print(chapter.getBookname());%></h3>
				</a>
			</div>
			<%}%>
			</form>
</div>



</body>
</html>
