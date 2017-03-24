package bean;

public class Techtitans {
	
	private String email;
	private String firstname;
	private String lastname;
	private String qualifications;
	private String technology;
	private String contact_number;
	private String profile;
	private String gender;
	public Techtitans() {
		super();
	}
	public Techtitans(String email, String firstname, String lastname,
			String qualifications, String technology, String contact_number,
			String profile, String gender) {
		super();
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.qualifications = qualifications;
		this.technology = technology;
		this.contact_number = contact_number;
		this.profile = profile;
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getQualifications() {
		return qualifications;
	}
	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getContact_number() {
		return contact_number;
	}
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}