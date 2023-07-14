package com.springcores;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component
public class Demo
{
  @Value("Altaf Malik")
  private String studentName;
  
  @Value("Mumbai Sakinan")
  private String city;
  //this is your Spring Expression,Language(SEL)
  // @Value("#{temp}") yaha per ju ma @value ma ju put kiya hai wo run time per Expression solved hu jayega
  @Value("#{temp}")
  private List<String> address;
  
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public List<String> getAddress() {
	return address;
}
public void setAddress(List<String> address) {
	this.address = address;
}
@Override
public String toString() {
	return "TestStudent [studentName=" + studentName + ", city=" + city + ", address=" + address + "]";
}

}
