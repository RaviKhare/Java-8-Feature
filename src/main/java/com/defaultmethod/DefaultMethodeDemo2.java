/**
 * 
 */
package main.java.com.defaultmethod;

/**
 * @author rk250449
 *
 */
public class DefaultMethodeDemo2 implements MotorolaPhone, SamsungPhone {

	
	public static void main(String[] args) {
		
		MotorolaPhone moto = new DefaultMethodeDemo2();
		moto.calling();
		moto.message();
	}

	@Override
	public void calling() {
		System.out.println(" Calling from Motorola phone");
		
	}

	@Override
	public void message() {
		MotorolaPhone.super.message();
		SamsungPhone.super.message();	
		System.out.println(" Messaging from DefaultInterface implementor 2");
	}

}
