package garbageCollection;

import java.util.Scanner;

public class Emp {
int empId;
String empName;
String designation;
double basic;
double  hra;





public Emp(int empId, String empName, String designation, double basic, double price) throws LowSalException {
	if(basic <500) {throw new LowSalException("Low Sal here");}
	else {
	this.empId = empId;
	this.empName = empName;
	this.designation = designation;
	this.basic = basic;
	
	}
}

public void printDET() {
	System.out.println("Id : "+ this.empId);
	System.out.println("Name : "+ this.empName);
	System.out.println("Designation : " + this.designation);
	System.out.println("Basic : " +this.basic);
	System.out.println("HRA : "+this.hra);
}

public void calculateHRA() {
 if (designation.equalsIgnoreCase("Manager")) {hra =basic *0.1;}
 else if (designation.equalsIgnoreCase("Officer")) {hra =basic *0.12;}
 else if (designation.equalsIgnoreCase("Clerk")) {hra =basic *0.05;}
 else hra=0.0;
 
}

public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.err.println("Enter emp");
	int id = sc.nextInt();
	String name = sc.next();
	String des = sc.next();
	double ba = sc.nextDouble();
	double pr = sc.nextDouble();

	
	try {
		Emp e = new Emp(id,name,des,ba,pr);
		e.calculateHRA();
		e.printDET();

	} catch (LowSalException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}	
	
	
}
}
