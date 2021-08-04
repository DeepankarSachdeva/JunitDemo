package exceptiondemo;

import java.util.Scanner;

public class DivisionDemo {

	public static void main(String[] args) {
		
		 int a, b, result;  
         Scanner input = new Scanner(System.in);
          System.out.println("Input two integers");
          a = input.nextInt();
          b = input.nextInt(); 
          try  //statments to be moniterd which may through exception
          {
        	  result=a/b;
        	  System.out.println("Result = "+result);
          }
          catch(ArithmeticException e )// Exception thrown is handlesd in catch block
          {
        	  System.out.println("Diviion by Zero Error");
        	  System.out.println("Execution Description :"+e.getMessage());
        	  System.err.println("Exception Name & description:"+ e.toString());
        	  //Details about exception Name Description ,line number of codwe which generate Exception
        	  e.printStackTrace();
          }
          finally //clean-up oprations
          {
        	  input.close();
        	  System.out.println("In Finaly Block - Program execution ended");
          }

	}

}
