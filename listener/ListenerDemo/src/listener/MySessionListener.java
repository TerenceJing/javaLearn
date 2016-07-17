package listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MySessionListener implements HttpSessionListener {

	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("MySessionListener---Created");
	}
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("MySessionListener---Destroyed");
	}

}
