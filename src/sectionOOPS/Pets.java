/**
 * OOPS Lesson 8 - Inheritance
 * DRY - Don't Repeat Yourself, is a principle in programming, best implemented by Inheritance. 
 * we aim to use code written in one class(super/parent class) via another (child/sub class).
 */
package sectionOOPS;

public class Pets {
	public String type;
	public String habitat;
	
	Pets(){
		System.out.println("Yaaay!!! We just got a new pet.");
	}
	
	public void makeSound() {
		System.out.println("all animals make noise");
	}
	
	public void reproduce() {
		System.out.println("making babies...");
	}
}
