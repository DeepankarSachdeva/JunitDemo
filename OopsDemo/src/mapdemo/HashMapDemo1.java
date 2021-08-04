package mapdemo;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> languages = new HashMap<>();
	    languages.put(1, "Java");
	    languages.put(2, "Python");
	    languages.put(3, "JavaScript");
	    
	    System.out.println("HashMap: " + languages);
	    
	 // get() method to get value
	    String value = languages.get(1);
	    System.out.println("Value at index 1: " + value);
	    System.out.println("Value at index 3: " + languages.get(3));
	    
	    //Return Set of keys
	    System.out.println("Keys :"+languages.keySet());
	    
	    //Return set of Values
	    System.out.println("Values: "+languages.values());
	    
	    //return both set of key values pair
	    System.out.println("key-value Mapping: "+languages.entrySet());
	    
	    //replace
	    languages.replace(2, "c++");
	    
	    //itrate through keyset
	    System.out.println("keys: ");
	    for(Integer k:languages.keySet())
	    {
	    	System.out.println(k+"--->"+languages.get(k));
	    	
	    	// itrate through key-value pair--entryset()
	    	System.out.println("Entries :");
	    	for(Entry<Integer, String> entry:languages.entrySet())
	    	{
	    		System.out.println(entry);
	    	}
	    }

	}

}
