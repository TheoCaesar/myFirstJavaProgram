/**
 * OOPS Lesson 12 - Encapsulation
 * 
 * This is a security measure that allows us hide the internal workings of a class from outright access and manipulation.
 * it involves using the private access modifier to keep properties hidden/private, making them accessible only via getters & setters.
 * 
 * getters and setters are regular functions with the public access modifier, with getters returning our private property and setters 
 * taking an argument, the value of which is assigned to our private property.
 */

/**
 * OOPS Lesson 13 - Copy Constructors
 * 
 * Now, whenever we create objects they are stored somewhere in memory, and logging that to console, we dont access the object but its address.
 * Attempting to reassign that object to a new object, ends up reassingning the address of the original to the copy. so attempting to alter 
 * one object ends up altering both objects.
 * 
 * To solve this problem, we have two solutions - a copy method, that takes an object of the same class as an argument or a copy constructor.
 * A copy constructor is basically a constructor that takes an object argument of the same class.
 * 
 */

package myFirstJavaProgram;

public class Phone {
	private String brand;
	private String model;
	private double cost;
	  
	public Phone(String brand, String model, double price) {
//		this.brand = brand;
//		this.model = model;
//		this.cost = price;
		
		//having incorporated setters, we could also use them in our constructor
		setBrand(brand);
		setModel(model);
		setPrice(price);
	}
	
	//copy constructor
	public Phone(Phone obj) {
		setBrand(obj.brand);
		setModel(obj.model);
		setPrice(obj.cost);
		
//		or 
		copy(obj);
	}
	
	public void copy(Phone obj) {
		setBrand(obj.brand);
		setModel(obj.model);
		setPrice(obj.cost);
		//or
//		this.brand = obj.brand;
//		this.model = obj.model;
//		this.cost = obj.cost;

	}
	
	//getters - unlike js, where we have a get keyword - java uses regular method (with return type of prop) with the public access modifier
	public String getBrand() {
		return this.brand;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public double getPrice() {
		return this.cost;
	}
	
	
	//setters- unlike js, where we have a set keyword - java uses regular void method with the public access modifier and an argument
	public void setBrand(String brand) {
		this.brand =  brand;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setPrice(double price) {
		this.cost = price;
	}
}
