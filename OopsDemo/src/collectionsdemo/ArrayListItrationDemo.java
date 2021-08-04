package collectionsdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListItrationDemo {

	public static void main(String[] args) {
		
		ArrayList<String> name=new ArrayList<String>();
		name.add("James ");
		name.add(" Micheal");
		name.add("Andy ");
		name.add("Jim ");
		name.add("Robert");
		
		System.out.println(name);
		
		// Iterator interface for traversing
		Iterator<String> itr= name.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(name.get(1));
		
		name.add(3,"Deepankar"); // adding element in specified index
		name.remove(0);  //delete first element
		name.set(1, "java"); // replace existing element
		System.out.println("**Display Collection using For Each loop***");
		
		for(String i:name)
		{
			System.out.println(i);
		}

		ArrayList<Double> marks=new ArrayList<Double>();
		marks.add(999.45);
		marks.add(500.545 );
		marks.add(548.54);
		marks.add( 587.25);
		marks.add( 45.21);
		marks.add( 450.45);
		System.out.println();
		
		for(Double i:marks)
		{
			System.out.println(i);
		}

		
	}

}
