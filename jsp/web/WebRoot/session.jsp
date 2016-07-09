<%@ page language="java" import="java.util.*,java.text.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>session</title>
    
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
  <h1>session内置对象</h1>
    <hr>
    
    <%
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH：mm:ss");
    Date d=new Date(session.getCreationTime()); 
    session.setAttribute("username","Terence Jing");
    session.setAttribute("age","24");
    session.setAttribute("gender","male");
    session.setMaxInactiveInterval(10); //设置当前会话生命周期
    %>
    session创建时间：    <%=sdf.format(d) %><br>
    session创建ID：<%=session.getId() %><br>
    session中用户名属性：<%=session.getAttribute("username") %><br>
    <hr>
    
    <a href="session2.jsp">-->session2.jsp</a>
  </body>
</html>
