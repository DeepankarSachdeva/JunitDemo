package collectionsdemo;

import java.util.HashSet;
import java.util.Set;

//hash set method user define
public class HashSetDemoUserDefined {

	public static void main(String[] args) {
		
		Set<Customer> customers = new HashSet<Customer>();
		
		customers.add(new Customer(101,"arun","Bengaluru"));
		customers.add(new Customer(102,"Mike","Newyork"));
		customers.add(new Customer(103,"John","sydney"));
		customers.add(new Customer(104,"Hari","Delhi"));
		customers.add(new Customer(105,"Navi","Mumbai"));
		
		//addd duplicate customer
		
		/*
        HashSet will use the `equals()` & `hashCode()` implementations 
        of the Customer class to check for duplicates and ignore them
      */

		customers.add(new Customer(103,"John","sydney"));
		for(Customer i:customers)
		{
			System.out.println(i.getId()+" "+i.getName()+" "+i.getCity());
		}
		
	}

}
