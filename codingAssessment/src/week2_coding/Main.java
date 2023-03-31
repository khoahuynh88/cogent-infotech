package week2_coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in); 
		List <Employee> list= new ArrayList<>();
		
		EmployeeDAOImpl dao= new EmployeeDAOImpl();
				  
				  int choice=0;
				  
				  do{ System.out.println("************Menu***************");
				  System.out.println("1-> Create employee"); 
				  System.out.println("2-> Update employee");
				  System.out.println("3-> Delete employee"); 
				  System.out.println("4-> Read all");
				  System.out.println("5-> Search employee");
				  System.out.println("6-> Sort employee");
				  System.out.println("7-> Exit");
				  System.out.println("Please enter your choice"); choice =sc.nextInt();
				  switch(choice){ case 1:
				  System.out.println("How many employee you want to add"); 
				  int count =  sc.nextInt(); 
				  
				  for(int i=0; i<count;i++){
					  Employee emp = new Employee();
					  System.out.println("Enter employee id:");
						emp.setEmmployeeNo(sc.nextInt());
						System.out.println("Enter employee name: ");
						emp.setEmployeeName(sc.next());
						System.out.println("Enter employee address : ");
						emp.setEmployeeAddress(sc.next());
						System.out.println("Enter employee email: ");
						emp.setEmployeeEmail(sc.next());
						System.out.println("Enter employee salary: ");
						emp.setEmployeeSalary(sc.nextDouble());
						
				  dao.createEmployee(list, emp); } 
				  break;
				  
				  case 2:
					  System.out.println("Enter the employeeNo you want to update");
						int id =sc.nextInt();
						dao.updateEmployee(list, id);
						break;
					case 3:
						System.out.println("Enter the product id you want to delete");
						int did =sc.nextInt();
						dao.deleteEmployee(list, did);
						break;
					case 4:
						
						dao.readAll(list);
						break;
					case 5:
						System.out.println("Enter the product id you want to search");
						int sid = sc.nextInt();
						dao.searchEmployee(list, sid);
						break;
					case 6:
						dao.sortEmployee(list);
						break;
					case 7:
						System.exit(0);
				}
					
				}
				while (choice!=7);
	}

}
