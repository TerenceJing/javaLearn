<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
  <form action="check.jsp">
  <table>
		<tr>
			<th>输入验证码：</th>
			<th align="left" > <input name="checkCode" Id="checkCode" type="text" /></th>
		</tr>
		<tr>
			<th> </th>
			<th><img  src="randomcode.jpg">看不清，重换一张 </th>
		</tr>
		<tr>
		    <th> </th>
			<th align="left"> 
			<input type="submit" value="确定"/>&nbsp;&nbsp;&nbsp;
			<input type="reset" value="重置"/>
			</th>
		</tr>
      </table>
     </form>
  </body>
</html>
