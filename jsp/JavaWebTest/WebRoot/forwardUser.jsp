<%@ page language="java" import="java.util.*,java.net.*" contentType="text/html; charset=utf-8"%>
<%@ page import="com.po.Users"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>forwardUser</title>
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

     <br/>
     <%
     request.setCharacterEncoding("utf-8");
        String username="";
        String password="";
        String email="";
        if(request.getParameter("username")!=null)
        {
        	username=request.getParameter("username");
        }
        if(request.getParameter("password")!=null)
        {
        	password=request.getParameter("password");
        }
         if(request.getParameter("email")!=null)
        {
        	email=request.getParameter("email");
        }
        
      %>
     用户名:<%=username %> <br>
    密码：<%=password %><br>
   电邮：<%=email %>
  </body>
</html>
