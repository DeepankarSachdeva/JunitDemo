package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollableDemo {

	public static void main(String[] args) {

		Connection con=null;
		Statement stmt;
		ResultSet rs;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","5123");
			//Creat Scrollable Resultset
			stmt= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		
			rs=stmt.executeQuery("select * from skills"); 
			while(rs.next())
            {
    System.out.println(rs.getInt(1)+"  "+rs.getString(2));
            }
			
			System.out.println("*********Display Record from Bottom to Top*********");
			rs.afterLast();  //read data from bottom to top
			while(rs.previous())
            {
    System.out.println(rs.getInt(1)+"  "+rs.getString(2));
            }
			
			System.out.println("************Display the 3rd record********");
			rs.absolute(3);
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			System.out.println("*******************************************");
			
			System.out.println("************Display the 2rd record using relative method********");
			rs.relative(2); //move curser to 2nd record using relavitive
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			System.out.println("*******************************************");
			
			System.out.println("************Display the 1rd record using relative method********");
			rs.first(); //move curser to 1st record 
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			System.out.println("*******************************************");
			
			rs.absolute(4);
			System.out.println("Current curser position :"+rs.getRow());
			rs.last();
			System.out.println("Total no.of Records :"+rs.getRow());
			con.close();
		}
		catch(Exception e){ 
            
            System.out.println(e);
            }   

  }
}
