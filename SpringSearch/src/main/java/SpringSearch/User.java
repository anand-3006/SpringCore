package SpringSearch;

import java.util.Date;
import java.util.List;

public class User {
private String name;
private Long id;
private Address address;
private Date DOB;
private List<String> courses;
private String gender;
private String type;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Date getDOB() {
	return DOB;
}
public void setDOB(Date dOB) {
	DOB = dOB;
}
public List<String> getCourses() {
	return courses;
}
public void setCourses(List<String> courses) {
	this.courses = courses;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "User [name=" + name + ", id=" + id + ", address=" + address + ", DOB=" + DOB + ", courses=" + courses
			+ ", gender=" + gender + ", type=" + type + "]";
}



}
