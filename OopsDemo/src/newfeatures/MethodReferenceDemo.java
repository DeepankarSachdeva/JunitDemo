package newfeatures;

interface hello
{
	void Welcome();
}
public class MethodReferenceDemo {
	

	public static void display()
	{
		System.out.println("Helllo From Method reference");
	}
	
	public void print()
	{
		System.out.println("Instance Method Call Using Method reference");
	}
	MethodReferenceDemo()
	{
		System.out.println("In Constructor");
	}

	public static void main(String[] args) {
		
		hello h=MethodReferenceDemo::display;  //invoke Static method 
		h.Welcome();
		MethodReferenceDemo d1=new MethodReferenceDemo();
		hello h1=d1::print; //invoke instance Method 
		h1.Welcome();
		
		hello h2=MethodReferenceDemo::new ;// Method Reference to constructor
		h2.Welcome();


		

	}

}
