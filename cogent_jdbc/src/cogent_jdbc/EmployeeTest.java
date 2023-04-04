package cogent_jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class EmployeeTest {
public static void main(String[] args) {
	//String query = "insert into employees(emp_no, emp_name, emp_salary) values(1003, 'Shiva', 3000)";
	
	String sql = "call retreive_persons";
	String connctionUrl ="jdbc:mysql://localhost:3306/cogentdb";
	
	try (
			Connection conn= DriverManager.getConnection(connctionUrl,"root","khoa88");
			//Statement stmt = conn.createStatement();
			)
			
	{
		//int rows=stmt.executeUpdate(query);
		// System.out.println("Rwows is update" +rows);
		
		/*
		 * int row =
		 * stmt.executeUpdate("delete from employees where emp_name= 'Shiva'");
		 * System.out.println("Rwows is delete" +row);
		 */
		/*ResultSet res = stmt.executeQuery("select * from employees");
		
		ResultSetMetaData rsMetaData =res.getMetaData();
		int numofColum = rsMetaData.getColumnCount();
		System.out.println("Total no of colums are "+ numofColum);
		
		for (int i=1 ; i <numofColum; i++) {
			String columName = rsMetaData.getColumnName(i);
			System.out.println("Coulum number is "+i);
			System.out.println("Coulm name is :" +columName);
			System.out.println(rsMetaData.getTableName(i));*/
		
		
		CallableStatement stmt = conn.prepareCall(sql);
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			System.out.println("ID "+rs.getInt(1));
			System.out.println("First name " + rs.getString(2));
			System.out.println("Last name " + rs.getString(3));
			}
		}
		
	
	catch (Exception e) {e.printStackTrace();}
}



}
