<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
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
    First Servlet Demo! <br>
    <a href="servlet/MEServlet">Get请求Servlet</a>
    <br/>
    <br/>
    
     <h4 align="center">登录</h4>
    <hr/> <br>
    <form action="servlet/MEServlet" name="loginForm" method="post">
    <table width="263" height="95" align="center">
    <tr>
	    <td>用户名：</td>
	    <td><input type="text" name="usename"/></td>
    </tr>
    <tr>
	    <td>密码：</td>
	    <td><input type="password" name="password"/></td>
    </tr>
    <tr>
	    <td colspan="2" align="center"><input type="submit" value="登录" />&nbsp;&nbsp;
	     <input type="reset" value="取消" /> </td>
    </tr>
    </table>
    <br>
    </form>
  </body>
</html>
