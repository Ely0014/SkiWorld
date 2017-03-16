package managedBeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import skiworld.persistence.EventHolder;
import skiworld.persistence.Instructor;
import skiworld.persistence.RestaurantManager;
import skiworld.persistence.SkiMan;
import skiworld.services.IHandelUser;

@ManagedBean
@RequestScoped
public class AddUserBean {
	@EJB
	private IHandelUser handelUser;
	private String lastName;
	private String firstName;
	private String cin;
	private String phone;
	private String email;
	private String adress;
	private String passWord;
	private String login;
	private String registrationNumberEvent;
	private int experienceEvent;
	private String registrationNumber;
	private int experienceIns;
	private int experienceRes;
	private String profilePicture;
	
	public String AddSkimen(){
	SkiMan skiman = new SkiMan();
	skiman.setLastName(lastName);
	skiman.setFirstName(firstName);
	skiman.setCin(cin);
	skiman.setPhone(phone);
	skiman.setEmail(email);
	skiman.setAdress(adress);
	skiman.setPassword(passWord);
	skiman.setLogin(login);
	skiman.setRegistrationNumber(registrationNumber);
	skiman.setProfilePicture(profilePicture);
	handelUser.addSkiMan(skiman);
	return "ListUser";
	}
	
	public String AddInstructor(){
		Instructor instructor = new Instructor();
		instructor.setLastName(lastName);
		instructor.setFirstName(firstName);
		instructor.setCin(cin);
		instructor.setPhone(phone);
		instructor.setEmail(email);
		instructor.setAdress(adress);
		instructor.setPassword(passWord);
		instructor.setLogin(login);
		instructor.setRegistrationNumber(registrationNumber);
		instructor.setExperienceIns(experienceIns);
		
		handelUser.addInstructor(instructor);
		return "ListUser";
		}
	
	public String AddEventHolder(){
		EventHolder eventHolder = new EventHolder();
		eventHolder.setLastName(lastName);
		eventHolder.setFirstName(firstName);
		eventHolder.setCin(cin);
		eventHolder.setPhone(phone);
		eventHolder.setEmail(email);
		eventHolder.setAdress(adress);
		eventHolder.setPassword(passWord);
		eventHolder.setLogin(login);
		eventHolder.setRegistrationNumberEvent(registrationNumberEvent);
		eventHolder.setExperienceEvent(experienceEvent);
		handelUser.addEventHolder(eventHolder);
		return "ListUser";
		}
	
	public String AddRestaurantManager(){
		RestaurantManager restaurantManager = new RestaurantManager();
		restaurantManager.setLastName(lastName);
		restaurantManager.setFirstName(firstName);
		restaurantManager.setCin(cin);
		restaurantManager.setPhone(phone);
		restaurantManager.setEmail(email);
		restaurantManager.setAdress(adress);
		restaurantManager.setPassword(passWord);
		restaurantManager.setLogin(login);
		restaurantManager.setRegistrationNumber(registrationNumber);
		restaurantManager.setExperienceRes(experienceRes);
		handelUser.addRestaurantManager(restaurantManager);;
		return "ListUser";
		}
	
	
	public IHandelUser getHandelUser() {
		return handelUser;
	}
	public void setHandelUser(IHandelUser handelUser) {
		this.handelUser = handelUser;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}

	public String getRegistrationNumberEvent() {
		return registrationNumberEvent;
	}

	public void setRegistrationNumberEvent(String registrationNumberEvent) {
		this.registrationNumberEvent = registrationNumberEvent;
	}

	public int getExperienceEvent() {
		return experienceEvent;
	}

	public void setExperienceEvent(int experienceEvent) {
		this.experienceEvent = experienceEvent;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public int getExperienceRes() {
		return experienceRes;
	}

	public void setExperienceRes(int experienceRes) {
		this.experienceRes = experienceRes;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public int getExperienceIns() {
		return experienceIns;
	}

	public void setExperienceIns(int experienceIns) {
		this.experienceIns = experienceIns;
	}
	
	
}
