package OopsDemo3;


class Count {
	static int cnt;
	int a;
	
	Count()
	{
	cnt+=1;
	a=100;
	}
	static void display()
	{
		System.out.println("No of Object created :"+ cnt);
	}
  void print()
	{
		System.out.println("Instance method");
	}
}
public class Staticdemo {
	public static void main(String[] args) {
		
		Count c1=new Count();
		Count c2=new Count();
		Count c3=new Count();
		
		c1.print();
		c2.print();
		c3.print();
		
		Count.display();
	}

}
