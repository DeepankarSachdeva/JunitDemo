package OopsDemo;

public class OverloadDemo {

	public static void main(String[] args) {
		
		//invoke add() using overload method
		
		Addition a1 =new Addition();
		a1.add();
		a1.add(20, 30);
		a1.add(34.75f, 542.87f);
		a1.add(300,500, 100);
		a1.add("Hello", "World");
	
		
	}
}
