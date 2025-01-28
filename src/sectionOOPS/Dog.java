/**
 * OOPS Lesson 8 - Inheritance
 * DRY - Don't Repeat Yourself, is a principle in programming, best implemented by Inheritance. 
 * we aim to use code written in one class(super/parent class) via another (child/sub class).
 *
 * OOPS LESSON 9 - METHOD OVERRIDING
 * we have seen inheritance allow us to apply the DRY principle. Another feature from inheritance is method overriding.
 * this principle builds on top of the inheritance functionality allowing us to tailor the inherited methods to suit the sub class.
 */
package sectionOOPS;

public class Dog extends Pets{
	@Override //this annotation/decorator is not required but then considered best practice
	public void makeSound() {
		System.out.println("The dog barks: 'woof woof, woof woof woof'"); 
	}
}
