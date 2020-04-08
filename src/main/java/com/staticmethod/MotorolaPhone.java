/**
 * 
 */
package main.java.com.staticmethod;

/**
 * @author rk
 *
 */
public interface MotorolaPhone {
	
	void calling();
	
	static void message() {
		System.out.println(" Static Messaging from Motorola phone");
	}

}
