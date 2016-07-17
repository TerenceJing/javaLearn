<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

request.setAttribute("requestName","requestName---Terence");
request.getSession().setAttribute("sessionName","sessionName---Terence");
request.getSession().getServletContext().setAttribute("contextName","contextName---Terence");

%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>index</title>
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
    This is a first page. <br>
    <button onclick="location.href='<%=request.getContextPath()%>/init.jsp';">Init</button>
    <br>
    <button onclick="location.href='<%=request.getContextPath() %>/destroy.jsp';">Destroy</button>
  </body>
</html>
