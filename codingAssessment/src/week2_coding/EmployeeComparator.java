package week2_coding;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	
		public int compare(Employee e1, Employee e2) {
			String name1 = e1.getEmployeeName();
			String name2 = e2.getEmployeeName();
			return name1.compareTo(name2);
	}

}
