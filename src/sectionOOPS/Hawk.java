/**
 * LESSON 15	: Interfaces
 * these are templates that can be applied to classes just as inheritance works. However, 
 * Interfaces have one advantage, it allows us to use multiple interfaces on a class.
 * while inheritance/abstract classes allows us assign default values to props
 * 
 * NB: Interfaces in don't directly support instance props because their purpose is to define contracts for 
 * behavior (methods) & not state (variables)
 */
package sectionOOPS;

import myFirstJavaProgram.Predator;

public class Hawk implements Predator{
	String breed;
	
	public Hawk (String breed){
		this.breed = breed;
	}
	
	public void attack() {
		System.out.println("\tTarget acquired...Going in for the kill!");
	}
	
	public void kill() {
		System.out.println("\tConfirmed Kill...Target Eliminated!");
	}
}
