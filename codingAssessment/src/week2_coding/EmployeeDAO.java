package week2_coding;


import java.util.List;



public interface EmployeeDAO  {
	public void createEmployee(List <Employee> list, Employee emp);
	public void updateEmployee(List <Employee> list,int id);
	public void deleteEmployee(List <Employee> list,int id);
	public void searchEmployee(List <Employee> list,int id);
	public void readAll (List <Employee> list);
	public void sortEmployee(List <Employee> list);
	//int compare(Employee o1, Employee o2);
}
