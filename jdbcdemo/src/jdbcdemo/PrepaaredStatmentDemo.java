package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class PrepaaredStatmentDemo {

	public static void main(String[] args) {
		
		
		Connection con=null;
		PreparedStatement pstmt;
		ResultSet rs;
        Scanner scan;
		
try {//LOAD&Regester the Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","5123");
			//creat aprepard statment object
			pstmt= con.prepareStatement("Select customerNumber,customerName,city,country from customers"
					+ " where country=?");
         scan=new Scanner(System.in);
         System.out.println("Enter country name of the Customers to be displayed");
         String country=scan.next();
         
         //assign a value to input parameter of ps
         pstmt.setString(1, country);
         
         rs=pstmt.executeQuery();
         while(rs.next())
         {
        	 System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
         }
         
         System.out.println("***************************************************");
        
         scan=new Scanner(System.in);
         System.out.println("Enter country name of the Customers to be displayed");
         String country1=scan.next();
         
         //assign a value to input parameter of ps
         pstmt.setString(1, country1);
         // reusing
         rs=pstmt.executeQuery();
         while(rs.next())
         {
        	 System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
         }
         
         con.close();
	    }

		catch(Exception ex)
		{
			System.out.println(ex);
		}
   }
}
