package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class FirstListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent servletContextEvent) {
		String initParam=servletContextEvent.getServletContext().getInitParameter("initParam");
		System.out.println("FirstListener---contextInitialized\n"+"initParam:"+initParam);
		
	}
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		System.out.println("FirstListener---contextDestroyed");
	}

}
