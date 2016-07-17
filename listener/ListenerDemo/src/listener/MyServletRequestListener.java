package listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyServletRequestListener implements ServletRequestListener {

	public void requestInitialized(ServletRequestEvent servletRequestEvent) {
		String name=servletRequestEvent.getServletContext().getInitParameter("name");
		System.out.println("MyServletRequestListener---Created\nname="+name);

	}
	public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
		System.out.println("MyServletRequestListener---Destroyed");
	}



}
