package hdu.terence;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	
	public LoginServlet() {
		super();
	}
	public void destroy() {
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=gbk");
		String verifyCode=(String) request.getSession().getAttribute("verifyCode");
		String checkCode=request.getParameter("checkCode");
		verifyCode=verifyCode.toUpperCase();
		checkCode=checkCode.toUpperCase();
		
		PrintWriter out=response.getWriter();
		if(checkCode.equals(verifyCode))
		{
			out.println("niece!验证码输入正确！");
		}
		else
		{
			out.println("你似不似撒？验证码都能输入错误！！！！！！");
		}
		out.flush();
		out.close();
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
	public void init() throws ServletException {
		
	}

}
