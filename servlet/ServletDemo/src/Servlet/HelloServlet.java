package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override //重写父类继承过来的方法
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		System.out.println("处理Get()请求……");
		PrintWriter out=response.getWriter();
		out.println("<strong><h3>Hello Servlet---doGet()</h3></strong>");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		System.out.println("处理Post()请求……");
		PrintWriter out=response.getWriter();
		out.println("<strong><h3>Hello Servlet---doPost()</h3></strong>");
	}
}
