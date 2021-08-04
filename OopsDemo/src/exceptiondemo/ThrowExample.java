package exceptiondemo;

public class ThrowExample {

	public static void checkEligibility(int age,int weight) 
	
	{
		if(age < 12 && weight < 40)
		{
			throw new ArithmeticException("Student is not eligible for registration ");
		}
		else {
			System.out.println("Student  with age :"+ age +" and "+ weight +" is eligible");
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Sports eligibility Process..");
		checkEligibility(20, 45);
		System.out.println("Thank You");
		checkEligibility(10, 39);
	
	}

}
