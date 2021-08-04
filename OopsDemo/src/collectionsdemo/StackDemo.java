package collectionsdemo;

import java.util.Iterator;
import java.util.Stack;



public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> s=new Stack<String>();
		s.push("Mike");
		s.push("john");
		s.push("Andrews");
		s.push("rod");
		s.push("Marry");
		
		System.out.println("Remove Element :" +s.pop());
		
		Iterator<String> itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Element on Top :"+s.peek());
		System.out.println("Search John :"+s.search("john"));
		
		

	}

}
