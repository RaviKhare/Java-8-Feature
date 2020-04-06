/**
 * 
 */
package main.java.com.defaultmethod;

/**
 * @author rk250449
 *
 */
public interface SamsungPhone {
	
	void calling();
	
	default void message() {
		System.out.println(" Messaging from Samsung phone");
	}


}
