package listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyServletRequestAttributeListener implements ServletRequestAttributeListener{


	public void attributeAdded(ServletRequestAttributeEvent srae) {
		System.out.println("MyServletRequestAttributeListener--attributeAdded():"+srae.getName());
		
	}

	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		System.out.println("MyServletRequestAttributeListener--attributeRemoved():"+srae.getName());
		
	}

	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		System.out.println("MyServletRequestAttributeListener--attributeReplaced():"+srae.getName());
		
	}

}
