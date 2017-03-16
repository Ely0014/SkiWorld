package skiworld.persistence;

import javax.persistence.Entity;

@Entity
public class Instructor extends User{
	 private String registrationNumber;
	private int experienceIns;
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public int getExperienceIns() {
		return experienceIns;
	}
	public void setExperienceIns(int experienceIns) {
		this.experienceIns = experienceIns;
	}
	
}
