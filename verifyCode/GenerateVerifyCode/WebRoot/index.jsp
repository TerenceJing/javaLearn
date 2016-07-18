<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
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
	<script type="text/javascript">
	function reloadVerifyCode()
	  {
	 	var time =new Date().getTime();
	 	document.getElementById("imageCode")
	    document.getElementById("imageCode").src="<%=request.getContextPath()%>/servlet/ImageServlet?d="+time;
	    //加time传递参数是为了区分请求连接，重新获取验证码；
	  }
	</script>
  </head>
  <body>
  <form action="<%=request.getContextPath() %>/servlet/LoginServlet" method="get">
	    验证码：<input type="text" name="checkCode" id="checkCode">
	    <img alt="验证码" id="imageCode" src="<%=request.getContextPath() %>/servlet/ImageServlet"/>
	    <a href="javascript:reloadVerifyCode();">看不清，重新获取</a><br>
	    &nbsp;&nbsp;&nbsp;<input type="submit" name="submit" value="确定">&nbsp;
	    <input type="reset" name="submit" value="重置">
	    
    </form>
  </body>
</html>
