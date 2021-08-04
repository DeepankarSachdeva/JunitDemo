package newfeatures;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//Usig lambda expression to Iterate using Map
public class LambdaInMap {

	public static void main(String[] args) {

		Map <String, String> books = new HashMap <> ();
        books.put("Let Us C", "Yashwant Kanetkar");
        books.put("Object Oriented Programming using Java", "Simon Kendal");
        books.put("Java: Graphical User Interfaces", "David Etheridge");
        
        //use lambda expression to traverse a Map -java8
        books.forEach((key,values) -> System.out.println("Book Name : "+key +
        		" -Author :" + values));
        for(Entry<String,String> e:books.entrySet()) //for -in loop -java5
        {
        	System.out.println(e.getKey()+" "+e.getValue());
        }
	}

}
