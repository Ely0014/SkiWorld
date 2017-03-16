package managedBeans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import skiworld.persistence.User;
import skiworld.services.IHandelUser;

@ManagedBean
@ViewScoped
public class ListUserBean {
	private User user;
	private String status;

	private List<User> users;
	@EJB
	private IHandelUser handelUser;


	@PostConstruct
	public void init() {
		user = new User();
		users = new ArrayList<>();
		users = handelUser.getUser();
		
		status= handelUser.getStatus();
		System.out.println(status);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public IHandelUser getHandelUser() {
		return handelUser;
	}

	public void setHandelUser(IHandelUser handelUser) {
		this.handelUser = handelUser;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	

}
