<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录</title>
    
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
    登录成功！ <br>
    <jsp:useBean id="myUsers" class="com.po.Users" scope="page"/>
    <h3>setProperty动作元素</h3>
  
  <%-- 
    <!-- 根据表单自动匹配所有属性 -->
    <jsp:setProperty property="*" name="myUsers"/>
    用户名：<%=myUsers.getName() %><br>
    密码：<%=myUsers.getPwd() %><hr>
    --%>
    
    <!-- 根据表单匹配部分属性 -->
    <jsp:setProperty property="name" name="myUsers"/>
    用户名：<%=myUsers.getName() %><br>
    密码：<%=myUsers.getPwd() %><hr>
    <!-- 跟表单无关 ，通过手工赋值给属性-->
    <jsp:setProperty  name="myUsers" property="name" value="Terence"/>
    <jsp:setProperty  name="myUsers" property="pwd" value="888888"/>
    用户名：<%=myUsers.getName() %><br>
    密码：<%=myUsers.getPwd() %><hr>
    <!-- 使用getProperty方式来获取用户名和密码 -->
    用户名：<jsp:getProperty name="myUsers" property="name"/><br>
    密码：<jsp:getProperty name="myUsers" property="pwd"/><hr>
     
     <!-- 跟表单无关 ，通过URL参数赋值给属性-->
    <jsp:setProperty  name="myUsers" property="name" param="user"/>
    <jsp:setProperty  name="myUsers" property="pwd" value="999999"/>
         用户名：<%=myUsers.getName() %><br>
          密码：<%=myUsers.getPwd() %><hr>
    
  </body>
</html>
