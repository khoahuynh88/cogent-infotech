package jdbcNew;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Employeetest {
	public static void main(String[] args) {
		String query = "select * from employees";
		String connctionUrl ="jdbc:mysql://localhost:3306/test1";
		
		try (
				Connection conn= DriverManager.getConnection(connctionUrl,"root","khoa88");
				PreparedStatement stmt = conn.prepareStatement(query);			
				)
		{
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println("Employee ID: "+ rs.getInt("emp_no"));
				System.out.println("Employee name: "+rs.getString("emp_name"));
				System.out.println("Employee salary: "+rs.getInt("emp_salary"));
				
			}
		}
		catch (Exception e) {e.printStackTrace();}
	}
}
