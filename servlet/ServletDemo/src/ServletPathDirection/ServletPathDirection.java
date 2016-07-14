package ServletPathDirection;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletPathDirection extends HttpServlet {

	public ServletPathDirection() {
		
	}
	public void destroy() {
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//请求重定向
		//response.sendRedirect("test.jsp");
		//服务器内部跳转_----/表示项目根目录
		//request.getRequestDispatcher("test.jsp").forward(request, response);//相对路径
		request.getRequestDispatcher("../test.jsp").forward(request, response);//绝对路径
	}
	
	public void init() throws ServletException {
		System.out.println("ServletPathDirection---初始化init()");
	}

}
