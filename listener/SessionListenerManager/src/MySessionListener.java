import java.util.ArrayList;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import entity.User;

import util.SessionUtil;


public class MySessionListener implements HttpSessionListener {

	private int userNumber=0;
	
	public void sessionCreated(HttpSessionEvent arg0) {
		userNumber++;
		arg0.getSession().getServletContext().setAttribute("userNumber", userNumber);

	}

	public void sessionDestroyed(HttpSessionEvent arg0) {
		userNumber--;
		arg0.getSession().getServletContext().setAttribute("userNumber", userNumber);
		ArrayList<User> userList=(ArrayList<User>) arg0.getSession().getServletContext().getAttribute("userList");
		if(SessionUtil.getUserBySessionId(userList, arg0.getSession().getId())!=null)
		{
			userList.remove(SessionUtil.getUserBySessionId(userList, arg0.getSession().getId()));
		}
	}

}
