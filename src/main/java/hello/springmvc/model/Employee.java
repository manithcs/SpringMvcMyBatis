package hello.springmvc.model;

public class Employee {
	
private int id;
private String fullname;
private String email;
private String gender;
private String hobbie;
private String country;
private String address;
public int getId() {
	return id;
}
public void setId(int id) {
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
public String gethobbie() {
	return hobbie;
}
public void sethobbie(String hobbie) {
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
	return "Employeee [id=" + id + ", fullname=" + fullname + ", email=" + email + ", gender=" + gender + ", hobbie="
			+ hobbie + ", country=" + country + ", address=" + address + "]";
}



}
