/**
 * LESSON 14 - METHODS (Functions)
 * methods are functions belonging to class, until now we have been using static void methods. we will go a bit deeper here.
 * 
 * 
 * LESSON 15 - \tOverloaded METHODS
 * These are basically methods that share the same name but different params(i.e. data types or number of params);
 * this is because the JRE looks out for methods having unique signatures.
 * 		Think of method signature, as how JRE knows which method to execute. NB: when we call a function, we use the 
 * 			method name and pass args. Its the function name and args/params.
 * method name + params = method signatures;
 */
package myFirstJavaProgram;

public class Methods {

	public static void basics() {
		// TODO Auto-generated method stub
		sayHello();
		sayHelloTo("Jerry Akamnko");
		introduceYourself("timini", 82);
		int sumVal = sum(18, 92);
//		System.out.println("sumVal ---> " + sum(38, 98 ) + "\n");
		System.out.println("sumVal ---> " + sumVal);

	}
	
	private static void sayHello() {
		/**
		 * static because we are going to invoke this from the main method, 
		 * which in itself is static and can only interact with static methods and properties.
		 * 
		 * void because, we are not returning any value for later use upon calling our method.
		 */
		
		System.out.println("Hello World...");
	}
	
	private static void sayHelloTo(String name) {
		/**
		 * name - this is called a parameter, think of it as a variable that will store some value 
		 * passed to the function during function call.
		 */
		System.out.println("Hello "+ name);
	}
	
	private static void introduceYourself(String name, int age) {
		/**
		 * multiple params, we can pass as many params to our methods as possible. All that is required is 
		 * we pass the same number of corresponding (values/args) upon function call.
		 */
		System.out.println("Hello! I am " + name + " and I am " + age + "years old...");
	}
	
	private static int sum(int a, int b) {
		/**
		 * return statements are required for functions that send a value back, whenever they are called. 
		 * For us to use return keyword, we have to alter the data type on our function from void to whatever 
		 * type for the value to be returned. In our case we are returning a number, hence static int
		 */
		int ans = a + b;
//		return (a+b);
		return ans;
	}

	public static void methodOverloading() {
		System.out.println("\t\t ==> " + add(8, 9 ) + "\n");
		System.out.println("\t\t ==> " + add(-5, 8, 9 ) + "\n");
		System.out.println("\t\t ==> " + add20(-5, 8, 9 ) + "\n");
		
		System.out.println("\t\t ==> " + add(8.08, 9.3082 ) + "\n");
		System.out.println("\t\t ==> " + add(-5.23, 8.03, 9.43 ) + "\n");
		System.out.println("\t\t ==> " + add20(1.5, 3.88, 7.12 ) + "\n");

	}
	
	private static int add(int first, int last) {
		System.out.println("\tOverloaded method #1 - int add(int, int)");
		return first + last;
	}
	
	private static int add(int first, int next , int last) {
		System.out.println("\tOverloaded method #2 - int add(int, int, int)");
		return first + next + last;
	}
	
	private static int add20(int first, int next , int last) {
		System.out.println("\tOverloaded method #3 - int add20(int, int, int)");
		return 20 + first + next + last;
	}
	
	//Repeat the above \tOverloaded methods but with different data types for their params
	//Now, while we may have changed the return type of our fxn to double, it doesn't contribute to our  method signature
	private static double add(double first, double last) {
		System.out.println("\tOverloaded method #1 - double  add(double , double )");
		return first + last;
	}
	
	private static double  add(double  first, double  next , double  last) {
		System.out.println("\tOverloaded method #2 - double  add(double , double , double )");
		return first + next + last;
	}
	
	private static double  add20(double  first, double  next , double  last) {
		System.out.println("\tOverloaded method #3 - double  add20(double , double , double )");
		return 20 + first + next + last;
	}
}
