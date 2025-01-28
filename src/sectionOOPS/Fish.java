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
import myFirstJavaProgram.Prey;

public class Fish implements Prey, Predator{	//multiple inheritance of interface
		String breed;
		public Fish (String breed){
			this.breed = breed;
			System.out.println("Fish breed (" + this.breed + ") created");
		}
		//prey methods
		public void detectPredator() {
			System.out.println("\tCode Red!!!...predator detected.");
		}
		
		public void flee() {
			System.out.println("\tAll systems Swim...Swim Swim Swim!!!");
			
		}
		
		public void hide() {
			System.out.println("\tDive into the deep...live to fight another day!");
		}
		
		//predator methods
		public void attack() {
			System.out.println("\tTarget acquired...Swimming in for the kill!");
		}
		
		public void kill() {
			System.out.println("\tConfirmed Kill...Target Eliminated!");
		}
}
