/**
 * 
 */
package main.java.com.lambda.with.foreach;

import java.util.Arrays;
import java.util.List;

/**
 * @author rk250449
 *
 */
public class ForEachDemo{
	

	
	public static void main(String[] args)
	{
		// user for foreach rather than normal for loop 
		List<Integer> values = Arrays.asList(11,22,33,44,55,66);
		values.forEach(i -> System.out.println(i));
		
		
	}

	
	
}
