/**
 * OOPS Lesson 10 - Abstract
 * 
 * The abstract keyword isecurity measuretoensure that parent classes are not instantiated. While we may inherit 
 * from a parent class, there is no safeguard from instantiating teh parent, and the abstract keyword fulfills this.
 * 
 * Once an abstract class is created we are allowed the chance to create abstract methods, in addition to regular methods
 * abstract methods are methods without a body, thereby deferring their implementation to subclass (method overriding).
 */
package sectionOOPS;

public abstract class Device{
	public String type;
	public int batchNumber;
	
	void sayHello() {
		System.out.println("hello...");
	}
	
	abstract void boot();

	abstract void shutDown();
	
	public abstract String toString();
}
