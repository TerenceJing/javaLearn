package listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MySessionAttributeListener implements HttpSessionAttributeListener{

	public void attributeAdded(HttpSessionBindingEvent se) {
		System.out.println("MySessionAttributeListener--attributeAdded():"+se.getName());
		
	}

	public void attributeRemoved(HttpSessionBindingEvent se) {
		System.out.println("MySessionAttributeListener--attributeRemoved():"+se.getName());
		
	}

	public void attributeReplaced(HttpSessionBindingEvent se) {
		System.out.println("MySessionAttributeListener--attributeReplaced():"+se.getName());
		
	}

	

}
