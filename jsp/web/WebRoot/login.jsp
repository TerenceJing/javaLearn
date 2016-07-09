<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录页面</title>
    
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
    <h1>登录</h1>
    <hr/> <br>
    <form action="doLogin.jsp" name="loginForm" method="post">
    <table width="291" height="95">
    <tr>
	    <td>用户名：</td>
	    <td><input type="text" name="usename"/></td>
    </tr>
    <tr>
	    <td>密码：</td>
	    <td><input type="password" name="password"/></td>
    </tr>
    <tr>
	    <td colspan="2"><input type="submit" value="登录" /></td>
    </tr>
    </table>
    <br>
    <a href="doLogin.jsp?username=李四">url传参</a>
    </form>
  </body>
</html>
