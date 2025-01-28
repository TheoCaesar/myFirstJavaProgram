/**
 * LESSON 4 - EXPRESSIONS
 * Expressions are lines of code that resolve to a single value. Usually made up of operands and operators.
 * A number of expressions, combined together yield statements.
 * expressions = operands & operators
 * operands = values, variables, numbers & quantity
 * operators = +, -, /, *, %, >, <, <=, etc.
 * 
 * LESSON 5 - MATH CLASS 
 * the java library gives us a number of predefined methods via Math class for performing standard math operations
 * 
 * LESSON 6 - RANDOM CLASS
 * this object allows us to create 'pseudo-random' numbers, with their range dependent on the data types we will be storing our values in.
 */
package myFirstJavaProgram;
import java.util.Random;
import java.util.Scanner;


public class Expressions {

	public static void intro() {
		int friends = 20;
		System.out.printf("Add 1 to friends(20) => %d\n", friends + 1);
		System.out.printf("Subtract 8 from friends(20) => %d\n", friends - 8);
		System.out.printf("Divide friends(20) by 3 => %d \\\\NB: 6.666 or 6; notice the truncation???\n", friends / 3);
		System.out.printf("Find remainder  friends(20) divided by 3 => %d\n", friends %3);
		System.out.printf("Are friends(20) > 100=> %b\n", friends > 100);
	}
	
	public static void shorthand() {
		int friends = 5;
		System.out.println("friends++ => " + friends++);
		System.out.println("friends-- => " + friends--);
		System.out.println("(trunc) freinds /= 3 ==> " + (friends/=3));
		System.out.println("(typecasted) (double)friends/=5 ==> " + ((double)(friends/=3)));
		System.out.println("(typecasted) (int)(friends += 5)*=12 ==> " + ((int)((friends += 5)*12)));
		System.out.println("(typecasted) (double)friends%=5 ==> " + ((double)(friends%=3)));
		//Typecasting - when we divide an integer variable, JRE automatically truncates the decimal portion

	}
	

	public static void mathClass() {
		double x = 3.12;
		double y  = -8;
		
		System.out.println("Math.abs(y) ==> " + Math.abs(y));
		System.out.println("Math.sin(y) ==> " + Math.sin(y));
		System.out.println("Math.sqrt(x) ==> " + Math.sqrt(x));
		System.out.println("Math.round(x) ==> " + Math.round(x));
		System.out.println("Math.ceil(x) ==> " + Math.ceil(x));
		System.out.println("Math.floor(x) ==> " + Math.floor(x));
		
		System.out.println("\nLet's try find the hypoteneuse of a right angled triangle\n");
		double opp, adj, hyp;
		
		Scanner console = new Scanner(System.in);
		System.out.println("What value do we assign to the opposite side?");
		opp = console.nextDouble();
		

		System.out.println("What value do we assign to the adjacent side?");
		adj = console.nextDouble();
		
		console.close(); 
		
		hyp = Math.sqrt(Math.pow(adj, 2) + Math.pow(opp, 2));
		
		System.out.printf("Hypoteneuese => %2f", hyp); //NB:%2f is placeholder for double -- crosscheck
	}
	
	public static void randomClass() {
		Random randomObj = new Random();
		
		int valInt = randomObj.nextInt();
		float valFloat = randomObj.nextFloat();
		double valDouble = randomObj.nextDouble();
		long valLong = randomObj.nextLong();
		boolean valBool = randomObj.nextBoolean();
		
		System.out.println("random boolean  -> " + valBool);
		System.out.println("random int -> " + valInt);
		System.out.println("random float -> " + valFloat);
		System.out.println("random double  -> " + valDouble);
		System.out.println("random long  -> " + valLong);
		
		//random numbers with ranges
		System.out.println("\nRandom values wtihin ranges\n");
		/**
		 * To generate random value within a range, we need to pass it an additional argument, i.e. the max, and it will generate
		 * a value from 0 to that argument-1. think of it as it returning a zero based index as opposed to counting numbers.
		 * so randomObj.nextInt(3) -> could result in [0, 1, 2];
		 */
		valInt = randomObj.nextInt(3);
		valFloat = randomObj.nextFloat(3);
		valDouble = randomObj.nextDouble(3);
		valLong = randomObj.nextLong(3);
		valBool = randomObj.nextBoolean();
		
		System.out.println("nextInt(3) -> random int below 3 -> " + valInt);
		System.out.println("nextFloat(3) -> random float below 3 -> " + valFloat);
		System.out.println("nextDouble(3) -> random double below 3 -> " + valDouble);
		System.out.println("nextLong(3) -> random long below 3 -> " + valLong);
		
	}
}
