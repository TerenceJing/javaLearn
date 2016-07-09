<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="java.text.SimpleDateFormat"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>主页</title>
    
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
    <h1> 欢迎来到我的主页</h1>
    <hr> <br>
    <%out.println("我是脚本输出内容"); %>
    <%! //声明格式
    	String s="张三"; 		//声明变量
    	int add(int x,int y) 	//声明函数
    	{
    	  return x+y;
    	}
     %>
     <%//脚本格式
     out.println(s+"总成绩："+add(80,86));
     SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
     String s=sdf.format(new Date());
      %>
     <br>
      今天是：<%=s   //表达式格式 
              %>  
  </body>
</html>
