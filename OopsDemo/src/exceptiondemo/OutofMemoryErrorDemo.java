package exceptiondemo;

import java.io.IOException;

public class OutofMemoryErrorDemo {
	public void creatArray(int size)
	{
		try
		{
			Integer[] a=new Integer [size];
		}
		catch(OutOfMemoryError e)
{ /* System.err is a PrintStream. System.err works like 
System.outexcept it is normally only used to output error texts.
 Some programs (like Eclipse) will show the output to System.err 
 in red text, to make it more obvious that it is error text.*/
			System.err.println("Array size too Large"+e);
			System.err.println("Max JVM Memory"+Runtime.getRuntime().maxMemory());
			System.out.println("Java Version"+Runtime.version());
			
		}
	}

	public static void main(String[] args)  {
	OutofMemoryErrorDemo d1=new OutofMemoryErrorDemo();
	d1.creatArray(1000*1000*1000);
	//open notpad
	try {
		Runtime.getRuntime().exec("notepad");
	}catch(IOException e) {
		e.printStackTrace();
	}
	

	}

}
