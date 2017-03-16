package managedBeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import skiworld.persistence.Admin;
import skiworld.persistence.EventHolder;
import skiworld.persistence.Instructor;
import skiworld.persistence.SkiMan;
import skiworld.persistence.User;
import skiworld.services.IManageUsers;

@ManagedBean
@RequestScoped
public class AuthenticationBean {
	private String login;
	private String password;
	private String status;
	@EJB
	private IManageUsers imaManageUsers;

	public String login() {
		User user = imaManageUsers.authetifier(login, password);
		if (user!=null){
			if (user instanceof Admin){ return "AddUser";}
			else if (user instanceof SkiMan) {status="SkiMan";
			System.out.println(status);
			return "welcomeSkiMan";}
			else if (user instanceof Instructor){ status="Instructor";
			System.out.println(status);
			return "welcomeInstructor";}
			else if (user instanceof EventHolder){ status="EventHolder";
			System.out.println(status);
			return "welcomeEventHolder";}
			return "welcome";
		}
		return "login";
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public IManageUsers getImaManageUsers() {
		return imaManageUsers;
	}

	public void setImaManageUsers(IManageUsers imaManageUsers) {
		this.imaManageUsers = imaManageUsers;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
