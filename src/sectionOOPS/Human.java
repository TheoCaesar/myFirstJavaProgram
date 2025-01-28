/**
 * OOPS LESSON 2 - Constructors
 * You must have notice that whenever we instantiate a class, we do so as though we were invoking a method.
 * this can be attributed to the execution of a special method invoked whenever a class is instantiated.
 * This is known as the Constructor class.
 * 
 *  The constructor is often used to create unique instances of classes by giving it parameters, through 
 *  which we assign values to the properties of our objects. This will mean that, upon instantiation, 
 *  the operator is expected to match the method signature of our constructor by passing it the required 
 *  number of args and their matching data types.
 *  
 *   
 *   Take Notes - this keyword
 *   allows us make reference to the properties of an object or class for assignment or use in methods. 
 */
package sectionOOPS;

public class Human {
	//declare props(attrs) of the human obj
	public String name;
	public char gender;
	public double  weight;

	//define constructor for our human class, taking values for the creation of unique human instances
	//also set it to public to accomodate instantiation in main method outside this package
	public Human(String name, double weight, char gender) {
		/*
		 * //in assigning our args to our props, we need to make java aware which is which 
		 * whenever the prop and the param bear the same name. That is why we tie the property
		 * with the "this" keyword.
		 * 
		 * an alternative will be to have the params or props have diff names all together.
		 * 
		 * should you have the same names and not bring the this keyword, name = name will be 
		 * deemed as though you're reassinging the param a new value stored in that same param.
		 */
		this.name  = name; 
		this.gender = gender;
		this.weight = weight;
	}
	
	public void eat() {
		System.out.println(this.name + " is eating...");
	}
	
	public void drink() {
		System.out.println(this.name + " is drinking...");
	}
}
