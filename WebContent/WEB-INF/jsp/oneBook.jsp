<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%String bookName =(String)request.getAttribute("bookName");
  out.print(bookName);
%>
  <h1>oneBook</h1>
  <form action="<%=request.getContextPath() %>/book/handerBookInfo" method="post">
     <table>
       <tr>
          <td>id</td>
          <td><input type="text" name="bookId"></td>
       </tr>
       
         <tr>
          <td>书名</td>
          <td><input type="text" name="name"></td>
       </tr>
       
         <tr>
          <td>数量</td>
          <td><input type="text" name="number"></td>
       </tr>
         <tr>
          <td>
              <input type="submit" value="提交">
          </td>
       </tr>
     </table>
  
  
  </form>
</body>
</html>