package cogent_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Display6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql = "select emp_name ,max(emp_salary) from dept where emp_dep=30 group by emp_name";
		String connctionUrl ="jdbc:mysql://localhost:3306/cogentdb";
	
		try (
				Connection conn= DriverManager.getConnection(connctionUrl,"root","khoa88");
				//Statement stmt = conn.createStatement();
				)
		{
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet res = st.executeQuery();
			
			while(res.next()) {
			//System.out.println("Emp id: " +res.getInt("emp_no"));
			System.out.println("Name " + res.getString(1));
			System.out.println("Salary " + res.getInt(2));
			//System.out.println("Deparment " + res.getInt("emp_dep"));
			}
		}
		catch (Exception e) {e.printStackTrace();}
	}
	

}
