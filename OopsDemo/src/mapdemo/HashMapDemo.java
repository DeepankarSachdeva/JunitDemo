package mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
	HashMap<Integer, String>hmap =new HashMap<Integer, String>();
		
		hmap.put(12, "Ravi");
		hmap.put(2, "Rahul");
		hmap.put(7, "Singh");
		hmap.put(49, "Annie");
		hmap.put(3, "Amit");
		
		
		//Display content using Iterator
		Set s=hmap.entrySet(); // return values from hmap
		Set s1=hmap.keySet();
		System.out.println(s);

		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
		    Map.Entry mentry=(Map.Entry) itr.next();
		    System.out.println(mentry.getKey()+"-->"+mentry.getValue());
		}

		System.out.println("*******************Key set**********");
		Iterator itr1=s1.iterator();
		while(itr1.hasNext())
		{
		    Integer key=(Integer) itr1.next();
		    String value=hmap.get(key);
		    System.out.println(key+"---->"+value);
	}
  }
}
