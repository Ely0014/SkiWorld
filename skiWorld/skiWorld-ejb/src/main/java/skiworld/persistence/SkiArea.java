package skiworld.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class SkiArea implements Serializable{
	private int idArea;
	private String name;
	private boolean isAvailable;
	private int spectatorNumber;
	private String address;
	private String image;
	private SkiAreaType skiAreaType;
	private List<SkiAreaReservation> skiAreaReservation ;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getIdArea() {
		return idArea;
	}

	public void setIdArea(int idArea) {
		this.idArea = idArea;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public int getSpectatorNumber() {
		return spectatorNumber;
	}

	public void setSpectatorNumber(int spectatorNumber) {
		this.spectatorNumber = spectatorNumber;
	}

	
@OneToMany(mappedBy="skiArea")
	public List<SkiAreaReservation> getSkiAreaReservation() {
		return skiAreaReservation;
	}

	public void setSkiAreaReservation(List<SkiAreaReservation> skiAreaReservation) {
		this.skiAreaReservation = skiAreaReservation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@ManyToOne
	public SkiAreaType getSkiAreaType() {
		return skiAreaType;
	}

	public void setSkiAreaType(SkiAreaType skiAreaType) {
		this.skiAreaType = skiAreaType;
	}



	
	

}
