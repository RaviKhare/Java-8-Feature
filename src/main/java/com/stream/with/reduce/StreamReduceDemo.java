/**
 * 
 */
package main.java.com.stream.with.reduce;

import java.io.IOException;
import java.util.OptionalDouble;

import main.java.com.model.ProductDetails;

/**
 * @author rk250449
 *
 */
public class StreamReduceDemo  {

	   

	public static void main(String[] args) throws IOException {
			
		
	    System.out.println("\n 1-  Stream with map() , reduce  - ");	
	     
		OptionalDouble sum =  ProductDetails.getProductDetailList().stream()
				.mapToDouble(ProductDetails::getProductQuantity)
				.reduce((a, b) -> {
					return a+b;
				});
		
		   
		System.out.println("\n 2-  Stream with map(),  reduce with variation   - ");	
	    
		Integer sum1 = (int) ProductDetails.getProductDetailList().stream()
				.mapToDouble(ProductDetails::getProductQuantity)
				.reduce(10, (a, b) -> {
					return a+b;
				});
		
	}

}
