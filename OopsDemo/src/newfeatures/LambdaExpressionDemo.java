package newfeatures;
@FunctionalInterface
interface MyFunctionalInterface
{
	public String sayHllo();
}

interface MyFunctionalInterface1
{
	public int incrementbyFive(int a);
}
interface StringConcat
{
	public String sconcat(String a,String b);
}
public class LambdaExpressionDemo {

	public static void main(String[] args) {
		
		//Lambda expression with no Parameter
		MyFunctionalInterface msg=()-> { return "Hello from Lamda expression";};
		System.out.println(msg.sayHllo());
		
		//Lambda expression with single Parameter
		MyFunctionalInterface1 f=(num) -> num+5;
		System.out.println(f.incrementbyFive(20));
		
		//Lambda expression with Multiple Arguments
		StringConcat s=(str1,str2) -> str1+str2;
		System.out.println("String Concat Using Lambda Expression");
		System.out.println(s.sconcat("Hello", "Java"));

		
	}

}
