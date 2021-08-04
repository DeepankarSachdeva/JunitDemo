package OopsDemo;

import java.util.Scanner;

// program to demonstrate working of constructor

class Person
{
	String name ,constituency;
	int age;
	Scanner s;
	public Person() //default Constructor
	{
		System.out.println("voter Eligibity Aap");
		age=0;
		name=" ";
		constituency="Banglor";
		s=new Scanner(System.in);

	}
	
	void print()
	{
		System.out.println("Enter Your Name");
	}
}
public class PersonTest {

	public static void main(String[] args) {
		Person objPerson1=new Person();
		Person objPerson=new Person();
		
		
		System.out.println("");

	}

}
