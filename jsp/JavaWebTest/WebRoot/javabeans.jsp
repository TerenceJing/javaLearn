<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ page import="com.po.Users"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>javabeans</title>
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
    
  <%
    Users user=new Users();
    user.setName("Terence Jing");
    user.setPwd("123456789");
   %>
    <font color="#ff0000">javabeans</font></h1>
     
     <h3>使用普通方式创建javabeans</h3>
     用户名：<%=user.getName() %><br>
     密码：<%=user.getPwd() %><br>
     类型：<%=user.getClass() %>
     <hr/>
    
    <h3>使用useBean创建javabeans</h3>
    <jsp:useBean id="myUser" class="com.po.Users" scope="page"/>
     用户名：<%=myUser.getName() %><br>
     密码：<%=myUser.getPwd() %><br>
     <hr/>
  
   <h3>使用setProperty给Javabeans属性赋值</h3>
   <h4>登录</h4>
    <form action="doLogin.jsp?user=zhagnsan" name="loginForm" method="post">
	    <table width="291" height="95">
		    <tr>
			    <td>用户名：</td>
			    <td><input type="text" name="name"/></td>
		    </tr>
		    <tr>
			    <td>密码：</td>
			    <td><input type="password" name="pwd"/></td>
		    </tr>
		    <tr>
			    <td colspan="2"><input type="submit" value="登录" /></td>
		    </tr>
	    </table>
    <br>
    </form>
  </body>
</html>
