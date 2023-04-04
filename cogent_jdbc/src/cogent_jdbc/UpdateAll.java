package cogent_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String connctionUrl ="jdbc:mysql://localhost:3306/cogentdb";
		String sql = "update dept set emp_salary=5000 where emp_dep=?";
		
		try (
				Connection conn= DriverManager.getConnection(connctionUrl,"root","khoa88");
				//Statement stmt = conn.createStatement();
				)
		{
			PreparedStatement st = conn.prepareStatement(sql);
			System.out.println("Enter employee department");
			int empDep=(sc.nextInt());
			st.setInt(1, empDep);
			
			int row = st.executeUpdate();
			if (row >0) {System.out.println("Update");}
		}
		catch (Exception e) {e.printStackTrace();}
	}
	

}
