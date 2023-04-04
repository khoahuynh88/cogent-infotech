package cogent_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Deletedb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String connctionUrl ="jdbc:mysql://localhost:3306/cogentdb";
		
		try (
				Connection conn= DriverManager.getConnection(connctionUrl,"root","khoa88");
				Statement stmt = conn.createStatement();
				)
		{
			int row = stmt.executeUpdate("delete from dept where emp_name= 'khoa'");
					  System.out.println("Rwows is delete" +row);
		}
		catch (Exception e) {e.printStackTrace();}
	}
	

}
