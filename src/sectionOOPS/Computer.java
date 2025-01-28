/**
 * OOPS Lesson 4 - Constructor Overloading.
 * Method overloading, of which constructor is a method, has to do with multiple methods(constructors) within our class
 * all bearing the same name but different methods. As a result upon instantiation of a class, JRE checks the method 
 * signature (method name + params(type and total count)), to determine which of the methods(constructors) to choose from
 * 
 */
package sectionOOPS;

public class Computer {
	String type = "Desktop";
	String  OS = "Windows";
	String ram = "4GB DDR3";
	String rom = "1TB HDD";
	double screenSize = 15.6;
	
	public Computer(){
		System.out.printf("Standard Issue %s for your work!\n", this.type);
	}
	
	public Computer(String type){
		this.type = type;
		System.out.printf("Standard Issue %s for your work!\n", this.type);
	}
	
	public Computer(String ram, String rom){
		this.ram = ram;
		this.rom = rom;
		System.out.printf("%s with %s and %s for your work!\n", this.type, this.ram, this.rom);

	}
	
	public Computer(String type, String ram, String rom){
		this.type = type;
		this.ram = ram;
		this.rom = rom;
		System.out.printf("%s with %s and %s for your work!\n", this.type, this.ram, this.rom);

	}
	
	public Computer(String type, String os, String ram, String rom){
		this.type = type;
		this.OS = os;
		this.ram = ram;
		this.rom = rom;
		System.out.printf("%s %s with %s and %s for your work!\n",this.OS, this.type, this.ram, this.rom);

	}
	
	public Computer(String type, String os, String ram, String rom, double screenSize){
		this.type = type;
		this.OS = os;
		this.ram = ram;
		this.rom = rom;
		this.screenSize = screenSize;
		System.out.printf("%s %s with %s and %s with a %.1f for your work!\n",this.OS, this.type, this.ram, this.rom, this.screenSize);
	}
}
