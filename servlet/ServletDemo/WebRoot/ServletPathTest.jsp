<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();//项目的根目录
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Home</title>
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
    <h1>Servlet路径跳转</h1>
    <hr>
    <!--使用相对路径 -->
    <a href="/servlet/ServletPathDirection">相对路径访问Servlet</a><br/>
     <!--使用绝对路径 -->
    <a href="<%=path %>/servlet/ServletPathDirection">绝对路径访问Servlet</a>
    <!-- path是：String path = request.getContextPath();//项目的根目录 -->
   <!-- 表单中action的URL写法与上述完全相同 -->
  </body>
</html>
