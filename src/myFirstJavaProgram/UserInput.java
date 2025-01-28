/**
 * LESSON 3 - User Inputs with the Scanner class
 **/
package myFirstJavaProgram;
import java.util.Scanner;
//import javax.swing.JOptionPane;

public class UserInput {
	 public static void intro() {
		 Scanner console = new Scanner(System.in);
		 System.out.println("What is your name?");
		 String name =  console.nextLine();
		 System.out.printf("Hello %s \n\n", name); //printf, takes two args - a string with a placeholder (s-string), and corresponding value/variable.
		 
		 System.out.println("How old are you?");
		 int age = console.nextInt(); //accepts ints, else throws an exception (low key error);
		 System.out.printf("%d years of age is a significant point in your life \n\n", age);
		 
		 /**
		  * Something strange happens when we use nextInt from our scanner. notice we will click enter whenever we are done with entering inputs. If the type we want is a string, then clicking enter
		  * will do nothing but just append the new line char (/n) to our string. but if we are taking an in of say 18, clicking enter makes the scanner's input register 18\n, with the numeric section 
		  * being utilised by whatever variable stores the number (i.e. our age variable). the newLine character is still left with console.
		  * 
		  *  If we should subsequently attempt to use our scanner to read a string, once we see the previously left behind new line character, it will automatically be assigned to whatever variable is 
		  *  trying to read from our scanner. to resolve this we call a nextLine method to clear it by not passing it to the intended variable, then recall it to read and assign it to the intended variable
		  */
		 
		 console.nextLine(); //clear newline from prev nextInt() call.
		 System.out.println("What is your favourite food?");
		 String food =  console.nextLine();
		 System.out.printf("You love %s \n\n", food);
		 
		 console.close();
	 }
	 
	 /**
	  * JOptionPane - A simple GUI program (not found in our JRE library)
	  * JOptionPane is a class we can use to take user input as opposed the scanner in our terminal. 
	  * we will first need to import it from javax.swing.JOptionPane,
	  * 
	  * public static void gui(){
	  *  	String name = JOptionPane.showInputDialog("Enter your name");
	  *  	JOptionPane.showMessageDialog(null, "Hello " + name;
	  *  
	  *  	int age = Integer.parseInt(JOptionPane.showDialog("How old are you?"));
	  *  	JOptionPane.showMessageDialog("null, "You're " + age + " years old");
	  *  
	  *  	double height = Integer.parseInt(JOptionPane.showDialog("How old are you?"));
	  *  	JOptionPane.showMessageDialog("null, "You're " + height + " cms tall");
	  */
}
