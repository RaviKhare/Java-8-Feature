/**
 * 
 */
package main.java.com.defaultmethod;

/**
 * @author rk250449
 *
 */
public interface MotorolaPhone {
	
	void calling();
	
	default void message() {
		System.out.println(" Messaging from Motorola phone");
	}

}	
