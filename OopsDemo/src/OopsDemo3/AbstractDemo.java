package OopsDemo3;

public class AbstractDemo {

	public static void main(String[] args) {
		Trainee t1=new Marks("john","New York",1001,50);  //Upcasting
		
		
		t1.show();   //Abstract class Method
		double marks=t1.calculateMarks();  //invoke Sub Class Method
		System.out.println(t1+" "+marks);
		
	}

}
