/**
 * 
 */
package main.java.com.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rk
 *
 */


public class ProductDetails {
	
	private Long productId;
	private String productName;
	private String productDescription;
	private  Double productPrice;
	private  Integer productQuantity;
	
	
	public ProductDetails(Long productId, String productName, String productDescription, Double productPrice,
			Integer productQuantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}


	public Long getProductId() {
		return productId;
	}


	public void setProductId(Long productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductDescription() {
		return productDescription;
	}


	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}


	public Double getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}


	public Integer getProductQuantity() {
		return productQuantity;
	}


	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}


	@Override
	public String toString() {
		return "ProductDetails [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", productPrice=" + productPrice + ", productQuantity=" + productQuantity + "]";
	}
	
	
	public static List<ProductDetails> getProductDetailList() {
		List<ProductDetails> productList = new ArrayList<>();
		productList.add(new ProductDetails(23421l, "Samsung LED TV",  "Smart TV wit roku", 250.00, 23));
		productList.add(new ProductDetails(23421l, "Apple Watch",  "with integrate with gmail, facebook", 600.00, 55));
		productList.add(new ProductDetails(23421l, "Dell Charger",  "with 3 year warranty", 30.00, 44));
		productList.add(new ProductDetails(23421l, "LED Bulb",  "10 watt with 1 year warranty", 20.00, 15));
		return productList;
	}
	
	
}
