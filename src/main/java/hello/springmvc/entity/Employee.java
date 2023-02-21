package hello.springmvc.entity;

public class Employee {
	private Integer id;
	private String fullname;
	private String email;
	private String gender;
	private String hobbie;
	private String country;
	private String address;
	 
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobbie() {
		return hobbie;
	}
	public void setHobbie(String hobbie) {
		this.hobbie = hobbie;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fullname=" + fullname + ", email=" + email + ", gender=" + gender + ", hobbie="
				+ hobbie + ", country=" + country + ", address=" + address + "]";
	}
	
	

	
}
