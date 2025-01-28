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
 * 
 * this child class is going to extend our person class.
 */
package sectionOOPS;

public class Hero extends Person {
	//inherits name & age property
	public String superPower;
	
	public Hero(String name, int age, String superPower){
		//this.name = name; //while this works, its advisable to defer to parent - DRY
		//this.age = age; //while this works, its advisable to defer to parent - DRY
		
		super(name, age); 	//defer above tasks to previous constructor.
		this.superPower = superPower;
	}
	
	
	public String toString() {
		return super.toString() + "Super Power: " + this.superPower + "\n";
	}
}
