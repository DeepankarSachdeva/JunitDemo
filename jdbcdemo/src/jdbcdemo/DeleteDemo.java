package jdbcdemo;

import java.sql.Connection;
import java.sql.Statement;

public class DeleteDemo {

	public static void main(String[] args) {
		Connection con;
        Statement stmt;
        int cnt=0;
        try {
        	con=ConnectionUtil.createConnection();
        	String sql="DELETE from candidates where rtrim(last_name)"
        			+"LIKE \'k%g\';";
        	
        	String sql1="DELETE from candidates where id=101;";
        		
        	stmt=con.createStatement();
        	cnt=stmt.executeUpdate(sql1);
        	if(cnt > 0)
        	{
        		System.out.println(cnt+" Record Deleted");
        	}
        	else
        	{
        		System.out.println("record Not Found");
        	}
        	con.close();
        }
        catch (Exception e)
        {
        	e.printStackTrace();
        }
		

	}

}
