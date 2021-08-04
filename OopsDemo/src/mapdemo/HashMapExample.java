package mapdemo;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<String, Double> hm=new HashMap<String, Double>();
		hm.put("John",5000.50);
		hm.put("Jim",4200.22 );
		hm.put("Daisy",6700.50);
		hm.put("Jack",140.21);
		hm.put("Mike",10000.90);
		
		 //itrate through keyset
	    System.out.println("Display Customers& their balance : ");
	    for(String k:hm.keySet())
	    {
	    	System.out.println(k+"--->"+hm.get(k));

	}
	    //deposit 1000 to jim's Account - Update values
	    double bal=hm.get("Jim");
	    hm.put("jim",bal+1000);
	    System.out.println("jim new Balance is :"+hm.get("jim"));
	    
	    hm.putIfAbsent("Deepankar", 500.00);
	    System.out.println(hm);
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter Customer Name for his Balance :");
	    String name=s.next();
	    System.out.println("The Balance of "+name+"is: "+hm.get(name));

 }
}
