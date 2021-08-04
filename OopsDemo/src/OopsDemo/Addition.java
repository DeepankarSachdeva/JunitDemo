package OopsDemo;

public class Addition {
	
	void add()
	{
		System.out.println("Method OverLoading Done");
	}
	void add(int a,int b)
	{
		System.out.println("The Addition of 2 no.  :"+(a+b));
	}
	void add(float a,float b)
	{
		System.out.println("The Addition of 2 float no  :"+(a+b));
	}
	void add(int a,int b,int c)
	{
		System.out.println("The Addition of 3 no.  :"+(a+b+c));
	}
	void add(String s1, String s2)
	{
		System.out.println("The Addition of 2 String.  :"+(s1+s2));
	}
}
