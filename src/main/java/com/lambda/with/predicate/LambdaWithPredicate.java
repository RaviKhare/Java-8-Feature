/**
 * 
 */
package main.java.com.lambda.with.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author rk250449
 *
 */
public class LambdaWithPredicate {
	

	
	public static void main(String[] args)
	{
		Consumer<Integer> consumer = t -> System.out.println(t);
		consumer.accept(11);		
		
		Predicate<Integer> p = t -> t % 2 == 0;
		System.out.println(p.test(3));
		
		List<Integer> list = Arrays.asList(1,2,4,6,8,3,5,7);
		list.stream().filter(p).forEach(t -> System.out.println(t));
		
		
		
	    Supplier<String> supplier =	() -> "Hello good night" ;
	    System.out.println(supplier.get());
	    
	    Supplier<Integer> supplier1 =	() -> 0 ;
	    System.out.println(list.stream().findFirst().orElseGet(supplier1));
		
		System.out.println(list.stream().findAny());
		
	    
	}
	
}
