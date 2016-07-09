<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>First web page</title>
	
  </head>
  
  <body> 
  <table width="738" height="110">
   <tr>
    <td>
     <div>
		  <font color="#ff0000"><strong>欢迎来到我的主页</strong><strong> </strong></font>
		    <hr>          
		    This is my JSP page. 
		</div>
    </td>
    
    <td>
        <div>
		  <font color="#ff0000"><strong>欢迎来到我的主页 </strong></font>
		    <hr>          
		    This is my JSP page. 
		</div>
    </td>
   </tr>
  </table>
 
          
  </body>
</html>
