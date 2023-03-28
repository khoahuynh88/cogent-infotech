package serialization;

import java.io.Serializable;

public class User implements Serializable {
 int age;
 int rollNum;
 String name;
 String address;
 

 
public User() {
	super();
	// TODO Auto-generated constructor stub
}



public User(int age, int rollNum, String name, String address) {
	super();
	this.age = age;
	this.rollNum = rollNum;
	this.name = name;
	this.address = address;
}



public int getAge() {
	return age;
}



public void setAge(int age) {
	this.age = age;
}



public int getRollNum() {
	return rollNum;
}



public void setRollNum(int rollNum) {
	this.rollNum = rollNum;
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
 
 
 
}
