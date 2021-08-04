package newfeatures;

import java.time.LocalDate;

interface MyInterface
{
	public void square( int a);
	//Default Method
	default void display(String a)
	{
		System.out.println("Hello "+ a);
	}
	//Static Method
	static void printDate()
	{
		System.out.println("Todays Date: "+ LocalDate.now());
	}
}
public class DefaultMethodDemo implements MyInterface
{ 
	@Override
	public void square(int a) {
		System.out.println("The square of Number is: "+(a*a));
		
	}
	public static void main(String[] args) {
		
		DefaultMethodDemo d1=new DefaultMethodDemo();
		d1.square(5);
		//call Default Method in interface
		d1.display("Default Method");
		//call static Method in interface
		MyInterface.printDate();
	}
}
