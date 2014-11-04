<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
  <head>
    <title>fail</title>
  </head>

  <body>
       登陆失败
       
       <%	HttpSession s = request.getSession(); 
					
	%>		
		<s:label><%= s.getAttribute("err") %></s:label>
  </body>
</html>