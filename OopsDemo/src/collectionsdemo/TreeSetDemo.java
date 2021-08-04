package collectionsdemo;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		// Creating a TreeSet
        TreeSet<String> fruits = new TreeSet<>();

        // Adding new elements to a TreeSet
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");

        System.out.println("Fruits Set : " + fruits);

        // Duplicate elements are ignored
        fruits.add("Apple");
        System.out.println("After adding duplicate element \"Apple\" : " + fruits);

        // This will be allowed because it's in lowercase.
        fruits.add("banana");
        fruits.add("jackfruit");
        System.out.println("After adding \"banana\" : " + fruits);
        
        // TreeSet of Integer Type
        TreeSet<Integer> tset2 = new TreeSet<Integer>();


        // Adding elements to TreeSet<Integer>
        tset2.add(88);
        tset2.add(7);
        tset2.add(101);
        tset2.add(0);
        tset2.add(3);
        tset2.add(222);
        tset2.add(22);
        System.out.println(tset2); 
        
     //   Treeset with custom comparator
        TreeSet<Integer> tset3 = new TreeSet<Integer>(Comparator.reverseOrder());
        
        tset3.add(88);
        tset3.add(7);
        tset3.add(101);
        tset3.add(0);
        tset3.add(3);
        tset3.add(222);
        tset3.add(22);

        System.out.println("Tree Set in recerse order"+tset3); 
	}

}
