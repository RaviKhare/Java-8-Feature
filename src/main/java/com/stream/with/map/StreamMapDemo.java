/**
 * 
 */
package main.java.com.stream.with.map;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

import main.java.com.model.ProductDetails;

/**
 * @author rk
 *
 */
public class StreamMapDemo  {

	   

	public static void main(String[] args) throws IOException {
			
		
	    System.out.println("\n 1-  Stream with map()  - ");	
	    
		Stream<String> stringStream = Files.lines(Paths.get("C:\\GIT\\Java_8_Features\\src\\main\\resources\\playerlist.txt"));
		stringStream
		.map(e -> e.split("\\s+"))
		.map(Arrays::stream)
		.distinct()
		.forEach(System.out::println);
		
		stringStream.close();
		
		System.out.println("\n 2-  Stream with flatmap() - ");	
		
		Stream<String> stringNewStream = Files.lines(Paths.get("C:\\GIT\\Java_8_Features\\src\\main\\resources\\playerlist.txt"));
		stringNewStream
			.map(e -> e.split("\\s+"))
			.flatMap(Arrays::stream)
			.distinct()
			.forEach(System.out::println);
		
			stringNewStream.close();
		
			
		System.out.println("\n 3-  Stream with map(), filter  & reduce   - ");	
	    
		Integer sum1 = ProductDetails.getProductDetailList().stream()
				.filter(product -> {
					return product.getProductPrice() < 50.00 ;
				})
				.map(ProductDetails::getProductQuantity)
				.reduce(0, (a, b) -> {
					return a+b;
				});
	}


}
