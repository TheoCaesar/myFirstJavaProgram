/**
 * LESSON 2
 * Variables - allows for the storing and access/retrieval of data, variables in Java are assigned blocks of memory based on their data types
 * 				________________________________________________________________
 * 				Data Type	|| 		Size		|| 		Value					|
 *				------------++------------------++------------------------------+
 * 				boolean		|| 		1 bit 		||		true/false				|
 * 				byte		|| 		1 byte 		||		-128 to 127				|
 * 				short		|| 		2 bytes		||		-32,768 to -32,767		|
 * 				int			|| 		4 bytes		||		-2 to 2 billion			|
 * 				long		|| 		8 bytes		||		-9 to 9 quintillion 	|  e.g. 999,999,999,999,999,999L
 * 				float		|| 		4 bytes 	||		up to 8 decimal places	|  e.g. 0.1234567f //need to append f to value when data type is set to float
 * 				double		|| 		8 bytes 	||		up to 18 decimal places	|  e.g. 0.123456789012345
 * 				char		|| 		2 bytes		||		one char/ASCII value	|
 * 				String		|| 		varies 		||		1+ characters			|
 *				------------++------------------++------------------------------+
 *
 *		NB: All but string (which is reference) data types are primitive
 **/
package myFirstJavaProgram;

public class Variables {
	public static void basics() {
		int a; //variable declaration
		a = 22; //variable assignment
		
		int x = 25; // initialization = declaration + assignment
		System.out.println("a -> " + a);
		System.out.println("x -> " + x);
	}
	
	public static void datatypes() {
		//set variable to the max of their types, going beyond will result in an out of range error
		boolean isMale = true; //1bit
		byte val = 127; //accepting values between -128 and 128 (8 bits)
		short thous = 32767;
//		int debt = 10000000000; //returns an error - out of range, 
		int debt = 1999999999; //accepting values between;
		long BOGdebt = 999999999999999999L + 1L;
		float decimalF = 9.9999999f;
		double decimalD = 9.999999999999999999;
		char letterA = 97; //ascii code 97 should return A
		String name = "Thomas Nyann";

		System.out.println("isMale -> " + isMale);
		System.out.println("max val + 1 ==> " + (val += 1)); //loops back to the min val
		System.out.println("max thous + 1 ==> " + (thous += 1));
		System.out.println("max debt + 1 ==> " + (debt += 1));
		System.out.println("max BOGdebt + 1 ==> " + (BOGdebt += 1));
		System.out.println("max decimalF + 1 ==> " + (decimalF += 1));
		System.out.println("max decimalD + 1 ==> " + (decimalD += 1));
		System.out.println("max letterA + 1 ==> " + (letterA += 1));
		System.out.println("name + \" mills\"==> " + (name += " mills"));
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	public static void swap2Variables() {
		int x = 20, y = 88;
		System.out.println("Before Swap:\n\tx = " + x + " y = " + y);
		int temp = x;
		x = y;
		y = temp;
		System.out.println("After Swap:\n\tx = " + x + " y = " + y);
	}
}
