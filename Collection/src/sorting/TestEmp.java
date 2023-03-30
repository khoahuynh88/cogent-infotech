package sorting;

import java.util.Set;
import java.util.TreeSet;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> set = new TreeSet<>(new EmployeeNameCompartor());
		
		set.add(new Employee(100, "Obama"));
		set.add(new Employee(400, "Tom"));
		set.add(new Employee(300, "Rambo"));
		set.add(new Employee(200, "Khoa"));
		
		
		for (Employee employee : set) {
			System.out.println(employee.id+" "+ employee.name);
		}
	
		System.out.println("\n");
		Set<Employee> set1 = new TreeSet<>();
		set1.add(new Employee(100, "Obama"));
		set1.add(new Employee(400, "Tom"));
		set1.add(new Employee(300, "Rambo"));
		set1.add(new Employee(200, "Khoa"));
		
		for (Employee employee : set1) {
			System.out.println(employee.id+" "+ employee.name);
		}
	}

}
