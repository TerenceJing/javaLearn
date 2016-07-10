package hdu.terence.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

	public LoginServlet() {
		super();
	}
	public void destroy() {
		super.destroy(); 
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException 
	{
		//修改当前doPost()
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		System.out.println(username + " "+password);
		if("admin".equals(username)&&"admin".equals(password))
		{
			//检验通过
			HttpSession session=request.getSession();
			session.setAttribute("username",username);
			response.sendRedirect(request.getContextPath()+"/success.jsp");
		}
		else
		{
			//检验失效
			response.sendRedirect(request.getContextPath()+"/fail.jsp");
		}

   }
	public void init() throws ServletException {
		
	}

}
