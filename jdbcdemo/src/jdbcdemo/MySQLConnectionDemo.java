package jdbcdemo;

import java.sql.*;
public class MySQLConnectionDemo {

	public static void main(String[] args) {
		
		Connection con=null;
		Statement stmt;
		ResultSet rs;
		
		try {//LOAD&Regester the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","5123");
			
			stmt= con.createStatement();
			
			rs=stmt.executeQuery("select * from employees");
			//Traverse Resultset
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(3)+" "
			+rs.getString(5)+" "+rs.getString("email")+" "+rs.getString(8));
				
			}
			
			
			System.out.println("Display specific record from a db");
			
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
