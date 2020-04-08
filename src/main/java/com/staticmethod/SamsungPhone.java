/**
 * 
 */
package main.java.com.staticmethod;

/**
 * @author rk
 *
 */
public interface SamsungPhone {
	
	void calling();
	
	static void message() {
		System.out.println(" Static Messaging from Samsung phone");
	}


}
