/**
 * 
 */
package main.java.com.lambda.with.functionalinterface;

/**
 * @author rk
 *
 */
public class FunctionalInterfaceDemoImplementor {

	
	public static void main(String args[]) {
		
		 FunctionalIntefaceDemo functionalInterface = () -> System.out.print("Hello");
		
		 functionalInterface.show();
		
		 functionalInterface = () -> MiscellaneousClass.print();
		 functionalInterface.show();
		 
		 functionalInterface = MiscellaneousClass::print;
		 functionalInterface.show();
	}

	
}
