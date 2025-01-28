/**
 * LESSON 18 - OBJECTS
 * To create objects, we got to create a class with props and methods. We
 * will subsequently instantiate the class in our main method, and this 
 * instance is going to have access to all our predefined methods and props
 */
package sectionOOPS;


public class Car {
	/**
	 * we have our public access modifier on props and methods cos thats the only 
	 * way our main method can access the props and methods.
	 * 
	 * We currently have static values set to our props, so all objects created of this class
	 * will have the same props - which is not practical nor realistic.
	 * 
	 * We should be able to create a variety of cars. we will do this with constructors. 
	 */
	
	//declare props/attrs of our car
	public String make = "Chevrolet"; 
	public String model = "Corvette";
	public String color = "red";
	public int year = 2015;
	public double sellingPrice = 85000.50;
	
	public Car(){};
	
	public Car(String make, String model, String color, int yr){
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = yr;
	}
	
	public Car(String make, String model, String color, int yr, double sp){
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = yr;
		this.sellingPrice = sp;
	}
	
	//define methods for our car
	public void drive() {
		System.out.println("Shift gears and Step on accelerator;");
	}
	
	public void park() {
		System.out.println("Step on the breaks to halt..");
	}
	
}
