package cogent_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Display10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql = "select * from dept where emp_role='Analyst'";
		String connctionUrl ="jdbc:mysql://localhost:3306/cogentdb";
	
		try (
				Connection conn= DriverManager.getConnection(connctionUrl,"root","khoa88");
				//Statement stmt = conn.createStatement();
				)
		{
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet res = st.executeQuery();
			
			while(res.next()) {
				System.out.println("");
				System.out.println("Emp id: " +res.getInt("emp_no"));
				System.out.println("Name " + res.getString("emp_name"));
				System.out.println("Salary " + res.getInt("emp_salary"));
				System.out.println("Deparment " + res.getInt("emp_dep"));
			}
		}
		catch (Exception e) {e.printStackTrace();}
	}
	
}
