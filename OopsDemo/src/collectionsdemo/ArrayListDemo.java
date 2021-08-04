package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		//genric Array list
		ArrayList<String> a1=new ArrayList<String>();
		
		a1.add("java");
		a1.add("perl");
		a1.add("c++");
		a1.add("#c 5.0");
		System.out.println(a1);
		
		//get element by index
		
		System.out.println("Element at Index 1 :"+a1.get(1));
		System.out.println("Does list Content Element java  :"+a1.contains("java"));
		//Add Element at specific index 
		a1.add(2,"oracle");
		System.out.println(a1);
		
		System.out.println("is arrray list empty :"+a1.isEmpty()); 
		System.out.println(" Index of perl  :"+a1.indexOf("perl"));
		System.out.println("Size of Array List :"+a1.size());
		
		Collections.sort(a1);
		System.out.println("Array list after sorting  :"+a1);
		
		ArrayList<Integer> a2=new ArrayList<Integer>();
		
		a2.add(100);
		a2.add(500);
		a2.add(75);
		a2.add(63);
		a2.add(350);
		
		System.out.println(a2);
		System.out.println("Size :"+a2.size());
		

	}

}
