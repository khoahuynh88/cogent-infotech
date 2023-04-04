package cogent_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateSalary {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	String connctionUrl ="jdbc:mysql://localhost:3306/cogentdb";
	String sql = "update dept set emp_salary=5000 where emp_no=?";
	
	try (
			Connection conn= DriverManager.getConnection(connctionUrl,"root","khoa88");
			//Statement stmt = conn.createStatement();
			)
	{
		PreparedStatement st = conn.prepareStatement(sql);
		System.out.println("Enter employee number");
		int empNo=(sc.nextInt());
		st.setInt(1, empNo);
		
		int row = st.executeUpdate();
		if (row >0) {System.out.println("Update");}
	}
	catch (Exception e) {e.printStackTrace();}
}
}
