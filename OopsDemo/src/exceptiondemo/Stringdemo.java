package exceptiondemo;

public class Stringdemo {

	public static void main(String[] args) {
		
		String s1="Hello world";
		String s2=null;
		try {
		System.out.println(s1.length());
		System.out.println(s2.length());
            }
		catch(Exception a)
		{
			throw new NullPointerException();
		//	System.out.println("Exception occured :"+a);
		}
	}

}
