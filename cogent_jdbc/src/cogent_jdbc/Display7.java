package cogent_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Display7 {

	
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String sql = "select emp_name, emp_role from dept";
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
					System.out.println("Name " + res.getString("emp_name"));
					System.out.println("Role" + res.getString("emp_role"));
					//System.out.println("Deparment " + res.getInt("emp_dep"));
				}
			}
			catch (Exception e) {e.printStackTrace();}
		}
		
	

}
