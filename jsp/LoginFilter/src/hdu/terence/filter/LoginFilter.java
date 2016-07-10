package hdu.terence.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter {

	private FilterConfig config;
	
	public void destroy() {

	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		
		HttpSession session = request.getSession();
		
		String noLoginPaths = config.getInitParameter("noLoginPaths");
		String charset = config.getInitParameter("charset");
		
		if(charset==null) //配置文件里面如果没有指定编码方式
		{
			charset = "UTF-8";
		}
		request.setCharacterEncoding(charset);
		//request.setCharacterEncoding("UTF-8");
		if(noLoginPaths!=null)
		{
			String[] strArray = noLoginPaths.split(";");
			for (int i = 0; i < strArray.length; i++) 
			{
				if(strArray[i]==null || "".equals(strArray[i]))
					continue;
				if(request.getRequestURI().indexOf(strArray[i])!=-1 )
				{
					arg2.doFilter(arg0, arg1);
					return;
				}
			}
			
		}
		if(session.getAttribute("username")!=null){
			arg2.doFilter(arg0, arg1);
		}else{
			response.sendRedirect("index.jsp");
		}
		
	}

	public void init(FilterConfig arg0) throws ServletException {
		config = arg0;
	}

}
