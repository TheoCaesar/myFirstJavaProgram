/**
 * Lesson 17 - Constants
 * Constants are a means by which we declare the contents of a variable to be immutable. To declare a constant
 * we precede the variable type with the keyword "final";
 * 
 * by convention, constants are declared with the variable names in UPPERCASE
 */
package myFirstJavaProgram;

public class Constants {

	public static void basic() {
		// TODO Auto-generated method stub
		final double PI = 3.14159;
		
		//attempted reassignment 
//		PI = 4.2; //should return a compile time error 

		System.out.println("PI -> " +  PI);
	}

}
