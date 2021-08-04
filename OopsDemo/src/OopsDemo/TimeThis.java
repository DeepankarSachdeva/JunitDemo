package OopsDemo;

public class TimeThis {

	public static void main(String[] args) {
//		 t2=new Time(10,30,30);
//			t1.add(t2);
//			
//			
//			System.out.println("The Addition of 2 time no is");
//			t1.display();
		
		Time t1=new Time(6, 25, 30);
		Time t2=new Time(6, 40, 50);
		t1.add(t2);
		t1.display();
	
		
	}

}
