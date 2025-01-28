/**
 * LESSON 7 - IF STATEMENTS
 * if statements are a way to branch our code into executing a particular block when a condition is met, 
 * should the condition fail the entire statement tied to that condition is discarded.
 * 
 * NB: THE ORDER IN WHICH OUR CONDITIONS ARE ARRANGED IS IMPORTANT BECAUSE, THE MOMENT SAY THE 2ND CONDITION IS MET, 
 * ALL SUBSEQUENT CONDITIONS WITHIN THAT CHAIN, ARE IGNORED
 * 
 * LESSON 8 - SWITCH STATEMENTS
 * Unlike if else statements, switches can are suitable for handle numerous execution paths. It leverages the break keyword,
 * without which the block which satisfies the condition and all other subsequent blocks will run.
 * there is also a default keyword that is like the else keyword, running only when all conditions have failed to be met.
 * 
 * 
 * LESSON 9 - CONDITIONAL OPERATORS
 * these are operators that allow us pair our conditions, and return a single value or tweak a condition (not operator)
 * Logical AND = && --> returns true if both conditions are true
 * Logical OR == || --> returns true if at least one of the conditions are true
 * Logical NOT == ! --> returns an opposite of the condition
 */

package myFirstJavaProgram;

import java.util.Random;
import java.util.Scanner;

public class Conditionals {
	public static void ifStatement() {
		Random randomObj = new Random();
		int randomAge = (randomObj.nextInt(100)) + 1; //random num from 0 - 99, plus 1, to eliminate odds of age 0.
		
		if (randomAge < 18) //{
			System.out.println(randomAge + " years old!!! \nYou're legally not an adult");
		else if (randomAge== 18) //EQUALITY OPERATOR
			System.out.println(randomAge + " years old!!! \nYou're FINALLY legal");
		else if (randomAge < 60)
			System.out.println(randomAge + " years old?!! \nYou've been an adult for over " +  (randomAge - 18) + " years now");
		else 
			System.out.println(randomAge + " years old?!! \nHappy retirement !!!");
		//}
	}
	
	public static void ifStatementError() { //distorted arrangement of conditions
		int randomAge = 7;
		if (randomAge < 60)
			System.out.println(randomAge + " years old?!! \nYou've been an adult for over " +  (randomAge - 18) + " years now");
		else if (randomAge < 18) //{
			System.out.println(randomAge + " years old!!! \nYou're legally not an adult");
		else  
			System.out.println(randomAge + " years old?!! \nHappy retirement !!!");
		//}
	}
	
	public static void switchStatement() {
		Scanner console = new Scanner(System.in);
		System.out.println("What day were you born?");
		String today = console.nextLine();
		console.close();
		
		switch(today) {
			case "Sunday": 
				System.out.println("Kwesi for males & Akosua for females born today"); 
				break;
			case "Monday": 
				System.out.println("Kojo for males & Adwoa for females born today"); 
				break;
			case "Tuesday": 
				System.out.println("Kwabena for males & Abena for females born today"); 
				break;
			case "Wednesday": 
				System.out.println("Kweku for males & Ekua for females born today"); 
				break;
			case "Thursday": 
				System.out.println("Yaw for males & Yaa for females born today"); 
				break;
			case "Friday": 
				System.out.println("Kofi for males & Afia for females born today"); 
				break;
			case "Saturday": 
				System.out.println("Kwame for males & Ama for females born today"); 
				break;
			default:
				System.out.println(today + " is not really a day");
		}
	}

	public static void logicalAnd() {
		Random randomOBJ = new Random();
		double temparature = randomOBJ.nextDouble(40);
		
		System.out.println("The temparature for today is " + temparature);
		
		if (temparature < 20) 
			System.out.println("It must be freezing outside");
		else if (temparature >= 20 && temparature <= 30) 
			System.out.println("It is certainly warm outside");
		else //(temparature > 30) 
			System.out.println("It is so much hot outside");
			
	}
	
	public static void logicalOr() {
		Scanner console = new Scanner(System.in);
		
		System.out.println("This is a game, Just press the key 'A' to win.");
		String key = console.next();
		
		if (key.equals("a") || key.equals("A"))
			System.out.println("Congrats on your win");
		else System.out.println("Sorry you lost");

	}
	
	public static void logicalNot() {
		Scanner console = new Scanner(System.in);
		
		System.out.println("This is a game, Just press the key 'A' to win.");
		String key = console.next();
		
		if (!(key.equals("a") || key.equals("A")))
			System.out.println("Sorry you lost");
		else System.out.println("Congrats on your win");
	}
	

}
