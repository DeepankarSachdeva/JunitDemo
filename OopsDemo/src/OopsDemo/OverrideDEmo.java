package OopsDemo;


class Bank
{
	int getRateofIntrest()
	{
		return 0;
	}
	void display()
	{
		System.out.println("Welcom To Our Bank");
	}
}

class SBI extends Bank
{

	int getRateofIntrest()
	{
		return 5;
	}
}

class ICICI extends Bank
{

	int getRateofIntrest()        //Method overridin in Child Class
	{
		return 7;
	}
}

class Axis extends Bank
{

	int getRateofIntrest()
	{
		return 6;
	}
}

public class OverrideDEmo {

	public static void main(String[] args) {
		
		SBI b1=new SBI();
		ICICI b2=new ICICI();
		Axis b3=new Axis();
		b1.display();
		System.out.println("The Rate of Intrest of SBI  :"+b1.getRateofIntrest());
		b2.display();
		System.out.println("The Rate of Intrest of ICICI :"+b2.getRateofIntrest());
		b3.display();
		System.out.println("The Rate of Intrest of Axis  :"+b3.getRateofIntrest());
		
	}

}
