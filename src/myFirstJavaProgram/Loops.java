/**
 * LESSON 8 - LOOPS
 * Loops - execute a particular block of code n number of times.
 * 
 * 
 * LESSON 13 - FOR EACH LOOP
 * This is deemed to be an advanced version of the for loop, providing less steps for traversing elements 
 * in an array or collection (wrappers of arrays) however it is less flexible.
 * Take note that this loop, loops through the element and not the indices like its predecessor, and this is what
 * contributes to it being less flexible.
 * 
 */
package myFirstJavaProgram;
import java.util.ArrayList;
import java.util.Scanner;

public class Loops {

	public static void whileLoop() {
		//1)first checks the condition. 
		//2)then executes block while the condition is true 
		//3) within block update flag used in conditional test
		String name = "";
		Scanner console = new Scanner(System.in);
		
		//#1 - check if name is blank
		while (name.isBlank()) { 	
			//#2 - do all this if true;
			System.out.print("Enter a username :=> ");
			
			//#3 - update flag in conditional test
			name = console.nextLine();
		}
		System.out.println("Your chosen username is " + name);
		console.close();
	}

	public static void doWhileLoop() {
		//1)first executes block of code (runs at least once, as a result, do while trumps while loops)
		//2) within block, update flag used in conditional test
		//3) then checks the condition, trigger rerun of block while the condition is true 
		String name = "";
		Scanner console = new Scanner(System.in);
		
		//#1 - do all this, and again if conditional check returns true;
		do { 	
			//#2 - check if name is blank
			System.out.print("Enter a username :=> ");
			
			//#3 - update flag in conditional test
			name = console.nextLine();
		} while (name.isBlank());
		
		console.close();
		System.out.println("Your chosen username is " + name);

	}

	public static void forLoop() {
		//used when we have an idea how many times we'll run a loop
		for (int i = 10; i  > 0; i -= 2) {
			System.out.println(i);
		}
		System.out.println("Happy New Year!!!");
	}
	
	public static void nestedLoops() {
		int rows, cols;
		String symbol = "";
		Scanner console = new Scanner(System.in);
		
		System.out.println("How many rows?");
		rows = console.nextInt();
		
		System.out.println("How many columns?");
		cols = console.nextInt();
		
		System.out.println("We will now print a" + rows + " by " + cols + "matrix?\nWhat symbol do you want as a marker?");
		symbol = console.next();
		
		System.out.println();
		
		for (int i= 0; i < rows; i++ ) {
			for (int j = 0; j < cols; j++)
				System.out.print(symbol);
			System.out.println();
		}
	}
	
	//Lesson 13 - for each loop
	static void forEachLoop() {
//		Dealing with arrays
		String []pets = {"dog", "cat", "snake", "chicken"};
		
		for (String animal : pets) { //reads "for each animal(of string type) in our pets array"
			System.out.println(animal);
		}
		
		//Dealing with collections (arrayList);
		System.out.println("\n\nfor each with collections\n");
		ArrayList<String> menuList = new ArrayList<String>();
		String []menu = {"fufu", "face-the-wall", "atseke", "jollof"};
	
		
		for (String meal : menu)
			menuList.add(meal);
		
		for (String meal : menuList) //
//			menuList.get() //remember get works with index, but for each returns elements so we had to resort to sysout
			System.out.println(meal);
		
	}

}
