/**
 * 
 */
package main.java.com.staticmethod;

/**
 * @author rk
 *
 */
public class StaticMethodDemo extends Pager implements MotorolaPhone, SamsungPhone{

	
	public static void main(String[] args) {
		
		SamsungPhone moto = new StaticMethodDemo();
		moto.calling();
		message();
		
	}

	
	@Override
	public void calling() {
		System.out.println(" StaticMethodDemo Calling from implementor class"); 
	}
	
}
