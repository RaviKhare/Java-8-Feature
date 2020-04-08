/**
 * 
 */
package main.java.com.defaultmethod;

/**
 * @author rk
 *
 */
public class DefaultMethodeDemo4 extends Pager implements SamsungPhone {

	
	
	public static void main(String[] args) {
	  Pager p = new DefaultMethodeDemo4();
	  p.message();
	}

	@Override
	public void calling() {
	}
	
	@Override
	public void message() {
		System.out.println(" Messaging from DefaultInterface implementor 4");
	}

}
