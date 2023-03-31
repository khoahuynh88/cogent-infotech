package week2_coding;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class EmployeeDAOImpl implements EmployeeDAO {

	Scanner sc = new Scanner(System.in);

	@Override
	public void createEmployee(List<Employee> list, Employee emp) {
		// TODO Auto-generated method stub
		
			list.add(emp);
			
	}

	@Override
	public void updateEmployee(List<Employee> list, int id) {
		// TODO Auto-generated method stub
		if (list.isEmpty()) {
			System.out.println("There is Employee");
		}
		boolean found = false;
		Iterator<Employee> itr = list.iterator();
		while (itr.hasNext()) {
			Employee b = (Employee) itr.next();
			if (b.getEmmployeeNo() == id) {
				found = true;
				System.out.println("Enter new name: ");
				b.setEmployeeName(sc.next());
				System.out.println("Enter new address : ");
				b.setEmployeeAddress(sc.next());
				System.out.println("Enter new email: ");
				b.setEmployeeEmail(sc.next());
				System.out.println("Enter new salary: ");
				b.setEmployeeSalary(sc.nextDouble());
			}
		}
		if (!found)
			System.out.println("Can not find employee");
		
	}

	@Override
	public void deleteEmployee(List<Employee> list, int id) {
		// TODO Auto-generated method stub
		if (list.isEmpty()) {
			System.out.println("There employee to delete");
		}
		
		Employee b= null;
		for (Employee emp : list) {
			if (emp.getEmmployeeNo()== id) {b=emp;}
		}
		if (b == null) {System.out.println("Invalid");}
		else {list.remove(b);
		System.out.println("Remove employee");}
	}

	@Override
	public void searchEmployee(List<Employee> list, int id) {
		// TODO Auto-generated method stub
		boolean found = false;
		Iterator<Employee> itr = list.iterator();
		while (itr.hasNext()) {
			Employee b = (Employee) itr.next();
			if (b.getEmmployeeNo() == id) {
				found = true;
				System.out.println("Employee detail " );
				System.out.println("Employee Name: " + b.getEmployeeName());
				System.out.println("Employee address: " + b.getEmployeeAddress());
				System.out.println("Employee email: " + b.getEmployeeEmail());
				System.out.println("Employee Salary: $" + b.getEmployeeSalary());
			}
		}
		if (!found)
			System.out.println("Employee not found");
	}

	@Override
	public void readAll(List<Employee> list) {
		// TODO Auto-generated method stub
		if (list.isEmpty()) {
			System.out.println("There is no book");
		}
		for (Employee book : list) {
			System.out.println(book.toString());
		}
	}

	@Override
	public void sortEmployee(List<Employee> list) {
		// TODO Auto-generated method stub
		list.sort(new EmployeeComparator());
		System.out.println("Successful sort by name");
	}

	



}
