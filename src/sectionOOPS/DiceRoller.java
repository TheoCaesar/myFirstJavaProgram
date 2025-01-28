/**
 * OOPS lesson 3
 * local v global variable
 * local variables are declared within a method and their accessibility is therefore limited to the method.
 * global variables are declaed outside our methods (as properties of our class) making it accessible everywhere
 */
package sectionOOPS;
import java.util.Random;

public class DiceRoller {
	public DiceRoller() {
		Random randomObj = new Random();	//local variable
		int diceNumb = 0;					//local variable
		
		rollDice(randomObj, diceNumb);		//pass local variables to make their values accessible within diff function scope
	}
		
	public void rollDice(Random rand, int num) {
		num = rand.nextInt(6) + 1;
		System.out.println("you rolled " + num);
	}
}

//global variables illustration
//public class DiceRoller {
//	Random randomObj; 		//global variable
//	int diceNumb = 0;		//global variable
//	
//	public DiceRoller() {
//		randomObj = new Random();			//local variable
//	}
//		
//	public void rollDice() {
//		diceNumb = randomObj.nextInt(6) + 1;
//		System.out.println("you rolled " + diceNumb);
//	}
//}