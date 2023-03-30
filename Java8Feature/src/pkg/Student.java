package pkg;

public class Student {
int rollNo;
int className;
String name;


public Student() {
	super();
	// TODO Auto-generated constructor stub
}


public Student(int rollNo, int className, String name) {
	super();
	this.rollNo = rollNo;
	this.className = className;
	this.name = name;
}


public int getRollNo() {
	return rollNo;
}


public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}


public int getClassName() {
	return className;
}


public void setClassName(int className) {
	this.className = className;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}




}
