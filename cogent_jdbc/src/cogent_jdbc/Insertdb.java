package cogent_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insertdb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String connctionUrl ="jdbc:mysql://localhost:3306/cogentdb";
		String sql = "insert into dept (emp_no,emp_name,emp_salary,emp_dep) values (101,'khoa',1000,10)";
		
		try (
				Connection conn= DriverManager.getConnection(connctionUrl,"root","khoa88");
				//Statement stmt = conn.createStatement();
				)
		{
			PreparedStatement st = conn.prepareStatement(sql);
			int row = st.executeUpdate();
			if (row >0) {System.out.println("Insert");}
		}
		catch (Exception e) {e.printStackTrace();}
	}

}
