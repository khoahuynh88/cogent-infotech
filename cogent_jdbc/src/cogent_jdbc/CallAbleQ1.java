package cogent_jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.*;
public class CallAbleQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String sql = "call proc_empname(?)";
		String connctionUrl ="jdbc:mysql://localhost:3306/cogentdb";
		
		try (
				Connection conn= DriverManager.getConnection(connctionUrl,"root","khoa88");
				//Statement stmt = conn.createStatement();
				)
		{
		CallableStatement stmt = conn.prepareCall(sql);
		System.out.println("Enter emp nubmer");
		int no=sc.nextInt();
			stmt.setInt(1,no);
				ResultSet rs = stmt.executeQuery();
				
				while (rs.next()) {
					//System.out.println("ID "+rs.getInt(1));
					System.out.println("First name " + rs.getString(1));
					//System.out.println("Last name " + rs.getString(3));
					}
				}
				
			
			catch (Exception e) {e.printStackTrace();}
		



		
	}

}
