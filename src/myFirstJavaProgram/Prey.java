/**
 * LESSON 15	: Interfaces
 * these are templates that can be applied to classes just as inheritance works. However, 
 * Interfaces have one advantage, it allows us to use multiple interfaces on a class.
 * while inheritance/abstract classes allows us assign default values to props
 * 
 * NB: Interfaces in don't directly support instance props because their purpose is to define contracts for 
 * behavior (methods) & not state (variables)
 */
package myFirstJavaProgram;

public interface Prey {
	//can have props but not ideal for props with a changing state, props whose values can alter.
	//props, when use in interfaces must be static or final.
	public String name = "kad";  //NOT RECOMMENDED
	
	void detectPredator(); //no body
	
	void flee(); //no bodies in interfaces
		
	void hide();
	
}
