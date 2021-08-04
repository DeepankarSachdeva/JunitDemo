package newfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemo {
	
	public static void main(String[] args) {
	
		List<String> city=Arrays.asList("Delhi","Mumbai","Dhanbhad","Daman","Bangaluru");

		city.stream().sorted().forEach(System.out::println); // Sorting elements using streams
		System.out.println();
		
		// Operation by creating a stream
		city.stream().filter(s->s.startsWith("D")).map(String::toUpperCase).sorted().forEach(System.out::println);

		System.out.println();
		
		List<String> bCity=city.stream()
				.filter(s->s.startsWith("D"))
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(bCity);
		System.out.println();
		bCity.forEach(c->System.out.println(c)); // print list using lambda expression
		System.out.println();
		bCity.forEach(System.out::println);
		
		System.out.println();
		//display no. from 1 to 10
		IntStream.range(1, 10).forEach(i->System.out.println(i)); // start with 1 end with 10-1
		System.out.println();
		
		IntStream.rangeClosed(1, 10).forEach(System.out::println); // start with 1 end with 10
		
		//sum of array elements using streams
		int[] numbers={1,2,3,4,5,6,7,8,9,10};
		int sum=Arrays.stream(numbers)
				.reduce(0, (a,b)->a+b);
		System.out.println("Total no of array: "+sum);
		
		
	}
}
