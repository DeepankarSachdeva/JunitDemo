package OopsDemo3;

class Test{
	int a; //Default Variable
	private int b;// private variable
	protected int c;// accessed in sub class
     public int d;
	// constructor using Fields 
	
	public Test(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		d=500;
	}
// method
	public void didplay()
	{
		System.out.println("Private Variable :"+b);
	}
	
	}

class Test2 extends Test 
{
  
	
	public Test2(int a,int b,int c) {
		super(a , b, c);
	}
	 public void display()
	 {
		 System.out.println("Protected Variable :"+c);
	 }
}
public class AccessSpecifierDemo {

	public static void main(String[] args) {
		
		Test t1=new Test(100,200,300);
		t1.didplay();
		// t1.b=50;  Compiler error Cant Access the Variable outSide the class
		System.out.println("Default Variable :"+t1.a);

	}

}
