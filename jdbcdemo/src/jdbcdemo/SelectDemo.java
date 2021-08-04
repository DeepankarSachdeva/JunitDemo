package jdbcdemo;

//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.sql.*;
//import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SelectDemo {

	public static void main(String[] args) {

		Connection con=null;
		Statement stmt;
		ResultSet rs;
		
		try {//LOAD&Regester the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","5123");
			
			stmt= con.createStatement();
        
        rs=stmt.executeQuery("Select first_name,last_name,email from candidates");
        
        while(rs.next())
        {
        	System.out.println(rs.getString(1)+"\t"+rs.getString("last_name")+"\t"+
        rs.getString("email"));
        }
        con.close();
	}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
