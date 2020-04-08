/**
 * 
 */
package main.java.com.defaultmethod;

/**
 * @author rk
 *
 */
public interface MotorolaPhone {
	
	void calling();
	
	default void message() {
		System.out.println(" Messaging from Motorola phone");
	}

}	
