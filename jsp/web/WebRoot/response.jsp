<%@ page language="java" import="java.util.*,java.io.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>响应</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  Hello:
  <%
	 //response.sendRedirect("login.jsp");
	  //response.setCharacterEncoding("text/html;charset=utf-8");//设置响应的MIME类型
	  out.println("<h1>response内置对象</h1>");
	  out.println("<hr> <br>");
	  out.flush();
	  PrintWriter outer=response.getWriter();//获得输出流对象
	  outer.println("HELLO,我是response对象生成的输出流对象outer");
	  
   %>
    <br>
  </body>
</html>
