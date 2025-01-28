/**
 * OOPS Lesson  10 - Super Keyword
 * 
 * Super Keyword, this is used in reference to the parent class of an object, just as "this" points to the current instance
 * of a class created.
 * we can use the super keyword, to invoke the constructor of our parent class, or trigger a method belonging to our parent.
 * 
 * to illustrate, we have two classes: Person(parent) and Hero(sub), upon instantiation of a hero class, we will use the super
 * keyword to trigger the constructor of the Person class, and then run a method belonging to the parent as well, we will mix this 
 * last bit with a touch of method overriding, from our previous lesson.
 */

package sectionOOPS;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {	//have a string method to be triggered (+ overriden) in child class
		return "Name: " + this.name + "\n" +  
			   "Age: " + this.age + "\n";
	}

}
