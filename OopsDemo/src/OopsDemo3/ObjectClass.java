package OopsDemo3;

public class ObjectClass {

	public static void main(String[] args) {
		ObjectClass oc =new ObjectClass();
		System.out.println(oc.hashCode());
		System.out.println(oc.toString());
		System.out.println(oc.getClass());
		
		ObjectClass oc1 =new ObjectClass();
		System.out.println(oc1.hashCode());
		System.out.println(oc1.toString());
		System.out.println(oc1.getClass());
		
		ObjectClass oc2 = oc;
		System.out.println(oc.equals(oc2));
		Student s1=new Student(101,"raj");
		Student s2=new Student(101,"raj");
		s1=s2;
		System.out.println(s1.getClass());
		System.out.println(s1.equals(s2));

		String s="java";
		String v="java";
		String k=new String("java");
		System.out.println(s.equals(v));
		System.out.println(s.equals(k));
		System.out.println(s==v);
		System.out.println(s==k);



		
	}

}
