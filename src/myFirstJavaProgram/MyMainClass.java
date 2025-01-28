/**
 * PrInt v PrintLn
 * Escape characters = '\t, \", \\, \n' etc. Anything preceded by a backslash is indication to the compiler to do something 
 **/
package myFirstJavaProgram; //from our java project creation, we actually created a package

import java.util.Scanner;

import sectionOOPS.Airplane;
import sectionOOPS.Bus;
import sectionOOPS.Car;
import sectionOOPS.DiceRoller;
import sectionOOPS.Dog;
import sectionOOPS.Fish;
import sectionOOPS.Human;
import sectionOOPS.Monitor;
import sectionOOPS.Rabbit;
import sectionOOPS.Ship;
import sectionOOPS.Computer;
import sectionOOPS.Device;
import sectionOOPS.Garage;
import sectionOOPS.Hawk;
import sectionOOPS.Hero;
import sectionOOPS.Snake;
import sectionOOPS.Vehicles;
public class MyMainClass { //entry point to our entire program, cos it contains the method psv main()

	public static void main(String[] args) { //first method sought after by JRE when run, its absence denotes an error
		// TODO Auto-generated method stub
		//intro();
//		Variables.basics();
//		Variables.datatypes();
//		Variables.swap2Variables();
		
//		UserInput.intro();
		
//		Expressions.intro();
//		Expressions.shorthand();
//		Expressions.mathClass();
//		Expressions.randomClass();
		
//		Conditionals.ifStatement();
//		Conditionals.ifStatementError(); //Disorderly arrangement for conditions
//		Conditionals.switchStatement();
//		Conditionals.logicalAnd();
//		Conditionals.logicalOr();
//		Conditionals.logicalNot();
		
//		Loops.whileLoop();
//		Loops.doWhileLoop();
//		Loops.forLoop();
//		Loops.nestedLoops();
		
//		Arrays.literals();
//		Arrays.init();
//		Arrays.twoDimArrayLiteral();
//		Arrays.twoDimArrayInit();
		
//		StringUtil.intro();
//		Wrapper.intro();
//		Wrapper.arrayList();
//		Wrapper.twoDimArrayList();
		
//		Loops.forEachLoop(); 
		
		
//		Methods.basics(); //Lesson 14 
//		Methods.methodOverloading(); 	//Lesson 15
		
		
		//Lesson 16
//		Printf.basics();
//		Printf.width(); 
//		Printf.precision();
//		Printf.flags();
		
		//Lesson 17
//		Constants.basic();

//====================================================================================
//====================================================================================		
//====================================================================================
//====================================================================================	

		
/** 
 * * OOPS - we created a new package, within which we will
 * keep all our OOPS files, but as we already know, there can 
 * only be one  main method, so we gonna keep instantiations here. 
 */
		/*
			Car abelsCar = new Car();
			 System.out.println("Car color is " + abelsCar.color);
			 System.out.println("Car model is " + abelsCar.model);
			 abelsCar.drive();
		
			 System.out.println();
			 
			 //2nd instance of class Car
			 Car cainsCar = new Car();
			 cainsCar.color = "blue";
			 cainsCar.model = "CAmaro";
			 cainsCar.sellingPrice = 250000;
		
			 System.out.println("Car color is " + cainsCar.color);
			 System.out.println("Car model is " + cainsCar.model);
			 cainsCar.drive();
		 */
		 
		//====================================================================================
		//====================================================================================		
		//====================================================================================
		//====================================================================================	

	 
		//OOPS Lesson 2 - Constructors - 
		/*
		 * Human son = new Human("terry", 18.5, 'M'); Human babyGirl = new
		 * Human("jennifer", 12.8, 'F');
		 * 
		 * son.eat(); babyGirl.drink();
		 */
		
		//OOPS Lesson 3 - local v global variables
		/*DiceRoller ludo = new DiceRoller();
		//ludo.rollDice(); - //toggle global section to try
		*/
		
		//OOPS Lesson 4 - Overloaded Constructors
		/*Computer laptop = new Computer();
		Computer chromeBook = new Computer("laptop");
		Computer thinkstation = new Computer("8GB DDR4", "1TB SDD");
		Computer server = new Computer("Server", "128GB DDR4", "4TB SDD");
		Computer thinkpad = new Computer("Laptop", "Windows", "128GB DDR4", "4TB SDD");
		Computer macBook = new Computer("Laptop", "Macintosh", "32GB", "1TB SSD", 16.0);
		*/
		
		//====================================================================================
		//====================================================================================		
		//====================================================================================
		//====================================================================================	
		
		//OOPS Lesson 5 - toString()
		/*
		 * Computer macBook = new Computer("Laptop", "Macintosh", "32GB", "1TB SSD",
		 * 16.0); System.out.println("macBook ==> " + macBook);
		 * System.out.println("macBook.toString() ==> " + macBook.toString());
		 * 
		 * System.out.println(); Staff intern = new Staff("angelina benson", 22,
		 * "finance", "intern"); System.out.println("intern ==> " + intern); //implicit
		 * toString() call via sysout System.out.println("intern.toString() ==> " +
		 * intern.toString()); //explicit toString();
		 * 
		 * System.out.println(); Staff director = new Staff("benedict hutchison", 22,
		 * "finance", "director", 35000.00); System.out.println("director ==> " +
		 * director); //implicit toString() call via sysout
		 * System.out.println("director.toString() ==> " + director.toString());//explicit toString();
		 * //		macBook.toString(); will only work when wrapped in a sysout 
		 * 
		 */	
		 
		//====================================================================================
		//====================================================================================		
		//====================================================================================
		//====================================================================================			
		
		//OOPS Lesson 6 - An Array of Objects
		/*
		 * Staff intern = new Staff("angelina benson", 22, "IT", "intern"); Staff
		 * trainee = new Staff("ahmed abubakar", 24, "IT", "junior developer"); Staff
		 * backend = new Staff("Timothy Burges", 32, "IT", "senior developer"); Staff
		 * devops = new Staff("Bellatrix Ferguson", 29, "IT", "DevOps Engineer");
		 * 
		 * Staff[] ITteam = {intern, trainee, backend, devops}; //array literal option
		 * 
		 * for (Staff employee : ITteam) System.out.println(employee);
		 * 
		 * Staff[] OpsTeam = new Staff[4]; //array instantiation Staff internHR = new
		 * Staff("fred robinson", 22, "HR", "intern"); Staff traineeHR = new
		 * Staff("philip McCarthy", 24, "HR", "support staff"); Staff lineManager = new
		 * Staff("Henry Delap", 32, "HR", "HR Manager"); Staff Director = new
		 * Staff("Liam Cook", 29, "HR", "HR Director");
		 * 
		 * 
		 * OpsTeam[0] = internHR; OpsTeam[1] = traineeHR; OpsTeam[2] = lineManager;
		 * OpsTeam[3] = Director;
		 * 
		 * for (Staff opsEmployee : OpsTeam) System.out.println(opsEmployee);
		 */
		 
		//====================================================================================
		//====================================================================================		
		//====================================================================================
		//====================================================================================	

		//OOPS - Lesson 7 - Object arguments to methods
		/*
		 * Garage rawlingsPark = new Garage();
		 * 
		 * Car benz = new Car("Mercedes Benz", "S-Class", "blue", 2018); Car audi = new
		 * Car("Audi", "Q", "black", 2022); Car corrolla = new Car("Toyota", "corolla",
		 * "wine", 2018); Car focus = new Car("Ford", "Focus", "grey", 2022); Car rogue
		 * = new Car("Nissan", "Rogue", "white", 2014);
		 * 
		 * rawlingsPark.park(benz); rawlingsPark.park(audi);
		 * rawlingsPark.park(corrolla); rawlingsPark.park(focus); rawling
		 *sPark.park(rogue);
		 */
		
		//====================================================================================
		//====================================================================================		
		//====================================================================================
		//====================================================================================	

		//OOPS - Lesson 8 & 9- Inheritance &  Method Overriding
		/*
		 * //Inheritance Dog bruno = new Dog(); bruno.type = "support animal";
		 * bruno.habitat = "kennel";
		 * 
		 * bruno.reproduce(); System.out.println();
		 * 
		 * Snake kai = new Snake(); kai.type = "regular pet"; kai.habitat = "glass box";
		 * 
		 * kai.makeSound(); System.out.println();
		 * 
		 * //Method Overriding bruno.makeSound();
		 */
		
		//====================================================================================
		//====================================================================================		
		//====================================================================================
		//====================================================================================	

		//OOPS - Lesson 9 - Super keyword
		
		/*Hero flash = new Hero("flash", 23, "⚡⚡⚡ Speed ⚡⚡⚡");
		Hero batman = new Hero("Batman", 43, "💲💲💲 Rich 💲💲💲");
		
		System.out.println(flash.toString());
		*/

		//====================================================================================
		//====================================================================================		
		//====================================================================================
		//====================================================================================	

		//OOPS - Lesson 10 - Abstract Keyword

//		Device healthScanner = new Device(); //cannot instantiate type Device - cos its abstract
		/*
		 * Monitor p27 = new Monitor(); p27.brand = "Dell"; p27.screenType = "IPS";
		 * p27.screenSize = 27.00;
		 * 
		 * p27.boot(); p27.shutDown();
		 */
		
		//OOPS - LESSON 11 - ACCESS MODIFIERS
		//CHECK CODES WITHIN PACKAGES: accessModifiers1 & accessModifiers2;
		

		//====================================================================================
		//====================================================================================		
		//====================================================================================
		//====================================================================================	

		
		//OOPS - LESSON 12 - ENCAPSULATION
		/*Phone zfold = new Phone("Samsung", "Galaxy Fold", 18000.00);
//		zfold.brand = "Apple";	//access & update a private prop - error
		zfold.setBrand("Apple"); //access & update a private prop with setters
		zfold.setModel("15 Pro Max");
		zfold.setPrice(20000.00);
		
		System.out.println("zfold: " + zfold.getBrand());
		System.out.println("zfold: " + zfold.getModel());
		System.out.println("zfold: " + zfold.getPrice());
		*/
		
		//====================================================================================
		//====================================================================================		
		//====================================================================================
		//====================================================================================	

		
		//OOPS - LESSON 13 - Copying Objects & Copy Constructor
//		Phone s24 = new Phone("Samsung", "Galaxy S24+", 24000.00);
//		Phone iPhone15 = new Phone("Apple", "iPhone 15 Pro Max", 21000.00);
//		
//		System.out.println(s24);		//should print the address of the object being stored
//		System.out.println(iPhone15);	//should print the address of the object being stored
//		System.out.println();
//		System.out.println(s24.getBrand());
//		System.out.println(s24.getModel());
//		System.out.println(s24.getPrice());
//		System.out.println();
//		System.out.println(iPhone15.getBrand());
//		System.out.println(iPhone15.getModel());
//		System.out.println(iPhone15.getPrice());
//		System.out.println();

		//====================================================================================
		//====================================================================================		
		//====================================================================================
		//====================================================================================
		
		//OOPS - LESSON 14 - Copy Constructor

		/*
		Phone s24 = new Phone("Samsung", "Galaxy S24+", 24000.00);
		Phone iPhone15 = new Phone("Apple", "iPhone 15 Pro Max", 21000.00);
		
		//copy problem
//		s24 = iPhone15; //assigns iphon15's address to s24;
//		s24.setBrand("Huawei");	//this and subsequent lines end up altering iphone as well
//		s24.setModel("Honor");
//		s24.setPrice(9000.00);
		
//		copy solution #1 - copy Constructor
		Phone s24Plus = new Phone(s24); //copy constructor - new object;
//		s24 = new Phone(iPhone15);	//copy constructor - existing object;
		s24.copy(s24Plus); 		//copy method
		
		System.out.println(s24Plus);		//should print the address of the object being stored
		System.out.println(s24);		//should print the address of the object being stored
		System.out.println(iPhone15);	//should print the address of the object being stored
		System.out.println();
		System.out.println(s24Plus.getBrand());
		System.out.println(s24Plus.getModel());
		System.out.println(s24Plus.getPrice());
		System.out.println();
		System.out.println(s24.getBrand());
		System.out.println(s24.getModel());
		System.out.println(s24.getPrice());
		System.out.println();
		System.out.println(iPhone15.getBrand());
		System.out.println(iPhone15.getModel());
		System.out.println(iPhone15.getPrice());
		System.out.println();
		*/
		
		//====================================================================================
		//====================================================================================		
		//====================================================================================
		//====================================================================================	

		//OOOPS - LESSON 15	: Interfaces
			/**
			 * these are templates that can be applied to classes just as inheritance works. However, 
			 * Interfaces have one advantage, it allows us to use multiple interfaces on a class.
			 * while inheritance/abstract classes allows us assign default values to props
			 */
		
		/**
			Rabbit chinchilla = new Rabbit("chinchilla");
			chinchilla.detectPredator();
			chinchilla.flee();
			chinchilla.hide();
			
			System.out.println();
			
			Hawk cooper = new Hawk("Cooper");
			cooper.attack();
			cooper.kill();			
//			cooper.flee(); //error - can't access method form other interfaces not implemented
			
			System.out.println();

			//predatory fishes
			Fish shark = new Fish("Shark");
			shark.attack();
			shark.kill();
			
			System.out.println();

			//prey-ed fishes
			Fish sardines = new Fish("Sardine");
			sardines.detectPredator();
			sardines.flee();
			sardines.hide();
			
//			NB: Be sure to add @Override annotation on all the methods being implemented from interface
		**/

		//====================================================================================
		//====================================================================================		
		//====================================================================================
		//====================================================================================	

		//OOOPS LESSON - 16 : PolyMorphism
		/**
		 * Poly = "many" & morph == "forms". PolyMorphism is implemented in two forms - method
		 * overloading (constructor overloading & copy constructors) and method overriding
		 * (inheritance & interfaces).
		 * 
		 * We've seen bits of polymorphism already, but this section is going to be limited to 
		 * (non abstract) classes as parents, just to illustrate a practical aspects of storing 
		 * objects in arrays.
		 * 
		 * Parent Class = Vehicle, subclasses => [Bus, Ship, Airplane]
		 * 
		 * in line 4--, we are able to create an array of the parent class, and pass it objects created from teh child
		 * classes. 
		 * on the next line, an alternative is to create an array from the inbuilt Object class, which is the parent of 
		 * all objects we create. doing so works for just the array but traversal requires typecasting to access object
		 * specific methods and properties.
		 */
		/* 
		Bus yuton = new Bus();
		Ship titanic = new Ship();
		Airplane boeing = new Airplane();
		
		//create an array of differenct objects 
		Vehicles [] vehicles = { yuton, titanic, boeing};
		Object [] transporters = {new Vehicles(), yuton, titanic, boeing};
		
		for (Vehicles vehicle : vehicles) {
			vehicle.go();
		}
		
		System.out.println();
		
		for (Object instance : transporters) {
				((Vehicles) instance).go();			
		}
		*/
		
		//====================================================================================
		//====================================================================================		
		//====================================================================================

		//OOOPS LESSON - 17 : Dynamic (Runtime) Polymorphism 
		/**
		 * Creating you program to accommodate the type of object during runtime (after compilation)
		 *  we will stick to our vehicle classes created above.
		 */
		
		Scanner console = new Scanner(System.in);
		Vehicles transporter;	//declare object variable (prop)
		
		System.out.println("Which mode of transport please\nPress 1 for Airplane, 2 for Ships or 3 for Bus");
		int userInput = console.nextInt();
		
		switch(userInput) {
			case 1: 
				transporter = new Airplane();			
				transporter.go();
				break;
			case 2:
				transporter = new Ship();
				transporter.go();
				break;
			case 3: 
				transporter = new Bus();
				transporter.go();
				break;
			default:
				System.out.println("Sorry, " + userInput + " is not a valid choice ");				
		}
		
		console.close();
		System.out.println("PROGRAM TERMINATED...");


		//====================================================================================
		//====================================================================================		
		//====================================================================================	

		//OOOPS LESSON - 	 : 


	}
	
	
	
	
 	public static void intro() { //first method sought after by JRE when run, its absence denotes an error
		//LESSON 1
		// TODO Auto-generated method stub
		System.out.print("Hello World...");
		System.out.print("we love pizza");
		
		//last print, is appended to next print - solution: println
		System.out.println ("||--> ");		//spaces in between  method chaining don't really change much
		System.out.   println("Hello World");
		
		// comments on escape characters - 
		System.out.println("\tHello there");	//tab
		System.out.println("\nMoving to a newline...\n"); //newline character
		System.out.println("and he said to them: \"Stop it immediately!\" "); //nested quotes
		System.out.println("\\backslash\\");
		System.out.println(); //eclipse shortcut - 'sysout' + cntrl + space   || intelliJ shortcut - 'sout' + tab;		
	}
	
} 
