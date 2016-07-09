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
    
    <title>cookieLogin</title>
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
    request.setCharacterEncoding("utf-8");
    String username="";
    String password="";
    Cookie[] cookies=request.getCookies();
    		if(cookies!=null&cookies.length>0)
    		{
    			for(Cookie c:cookies)
    			{
    				if(c.getName().equals("username"))
    				{
    					username=URLDecoder.decode(c.getValue(),"utf-8");
    				}
    				if(c.getName().equals("password"))
    				{
    					password=URLDecoder.decode(c.getValue(),"utf-8");
    				}
    			}
    		}
   %>
    <font color="#ff0000">cookie</font></h1>
   <h4>cookie登录</h4>
  
    <form action="cookieDoLogin.jsp" name="cookieLoginForm" method="post">
	    <table width="279" height="192">
		    <tr>
			    <td>用户名：</td>
			    <td><input type="text" name="username"/></td>
		    </tr>
		    <tr>
			    <td>密码：</td>
			    <td><input type="password" name="password"/></td>
		    </tr>
		    <tr>
			    <td colspan="2" align="center">
			    	<input type="checkbox" name="isUseCookie"  />
			    	 十天内免登陆
			    </td>
		    </tr>
		    <tr>
			    <td colspan="2" align="center">
			    	<input type="submit" value="登录" />
			    	&nbsp;&nbsp;&nbsp;
			    	<input type="reset" value="取消" />
			    </td>
		    </tr>
	    </table>
    <br>
    </form>
    
  </body>
</html>
