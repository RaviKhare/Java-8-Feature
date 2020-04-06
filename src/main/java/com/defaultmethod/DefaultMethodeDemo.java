/**
 * 
 */
package main.java.com.defaultmethod;

/**
 * @author rk250449
 *
 */
public class DefaultMethodeDemo implements MotorolaPhone{

	
	public static void main(String[] args) {
		
		MotorolaPhone moto = new DefaultMethodeDemo();
		moto.calling();
		moto.message();
	}

	@Override
	public void calling() {
		System.out.println(" Calling from Motorola phone");
		
	}

}
