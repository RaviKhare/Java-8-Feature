/**
 * 
 */
package main.java.com.staticmethod;

/**
 * @author rk250449
 *
 */
public interface MotorolaPhone {
	
	void calling();
	
	static void message() {
		System.out.println(" Static Messaging from Motorola phone");
	}

}
