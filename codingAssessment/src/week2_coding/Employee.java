package week2_coding;

public class Employee {

	int emmployeeNo;
	String employeeName;
	String employeeAddress;
	String employeeEmail;
	double employeeSalary;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int emmployeeNo, String employeeName, String employeeAddress, String employeeEmail,
			double employeeSalary) {
		super();
		this.emmployeeNo = emmployeeNo;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeeEmail = employeeEmail;
		this.employeeSalary = employeeSalary;
	}


	public int getEmmployeeNo() {
		return emmployeeNo;
	}


	public void setEmmployeeNo(int emmployeeNo) {
		this.emmployeeNo = emmployeeNo;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getEmployeeAddress() {
		return employeeAddress;
	}


	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}


	public String getEmployeeEmail() {
		return employeeEmail;
	}


	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}


	public double getEmployeeSalary() {
		return employeeSalary;
	}


	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}


	@Override
	public String toString() {
		return "Employee [emmployeeNo=" + emmployeeNo + ", employeeName=" + employeeName + ", employeeAddress="
				+ employeeAddress + ", employeeEmail=" + employeeEmail + ", employeeSalary=" + employeeSalary + "]";
	}
	
	
	
}
