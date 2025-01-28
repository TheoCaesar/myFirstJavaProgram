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

import myFirstJavaProgram.Prey;

public class Rabbit implements Prey{
	public void detectPredator() {
		System.out.println("Code Red!!!...predator detected.");
	}
	
	public void flee() {
		System.out.println("All systems go...Go Go Go!!!");
		
	}
	
	public void hide() {
		System.out.println("Dig in deep...live to fight another day!");
	}
}
