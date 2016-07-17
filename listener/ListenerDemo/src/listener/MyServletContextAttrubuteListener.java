package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextAttrubuteListener implements ServletContextAttributeListener {

	public void attributeAdded(ServletContextAttributeEvent scab) {
		System.out.println("MyServletContextAttrubuteListener--attributeAdded():"+scab.getName());
		
	}

	public void attributeRemoved(ServletContextAttributeEvent scab) {
		System.out.println("MyServletContextAttrubuteListener--attributeRemoved():"+scab.getName());
		
	}

	public void attributeReplaced(ServletContextAttributeEvent scab) {
		System.out.println("MyServletContextAttrubuteListener--attributeReplaced():"+scab.getName());
	}

}
