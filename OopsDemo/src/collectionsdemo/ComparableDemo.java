package collectionsdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> a1=new ArrayList<Student>();
		Student s1=new Student(101,"mike", 19);
		Student s2=new Student(102,"mike", 15);
		Student s3=new Student(103,"mike", 13);
		Student s4=new Student(104,"mike", 10);
		Student s5=new Student(105,"mike", 17);
		
		a1.add(s2);a1.add(s3);a1.add(s1);a1.add(s5);a1.add(s4);
		
	Collections.sort(a1); //invoke Compare to() method of student class
		
		System.out.println("******Student Sorted List Based on Age****");
		for(Student s:a1)
		{
			System.out.println(s.rollNo+" "+s.name+" "+s.age);
		}

	}

}
