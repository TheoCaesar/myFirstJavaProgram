/**
 * LESSON 9 - ARRAYS (COLLECTION)
 * Arrays in Java are handled a bit differently from the norm; for instance, 
 * 1a) the type has us place the square brackets between the data type and  the array name. e.g. String []names;
 * 1b) the other half of initialization involves pseudo-instantiation: preceding our data type with the new keyword, int []ages = new int[3];
 * 2) its elements when using literals are placed in curly brackets e.g. names = {"Thomas", "Henry", "Jerry"}, 
 * 
 */

package myFirstJavaProgram;



public class Arrays {

	public static void literals() {
		//a bit unconventional to what we are used to
		String[] cars = {"Patrol 2016", "Camaro", "Land Cruiser"};
		
//		cars[4] = "murano"; //index out of bounds exception (low key error);
		
		for (int i = 0; i < cars.length; i++)
			System.out.printf("Car #%d ==> %s \n", i + 1, cars[i]);
		
	}
	
	public static void init() {
		int[] marks = new int[3]; //an array of 3 string type names 
		marks[0] = 80;
		marks[1] = 21;
		marks[2] = 35;
		
		for (int i = 0; i < marks.length; i++)
			System.out.printf("Mark #%d ==> %s \n", i + 1, marks[i]);
		
		System.out.println("\nMarks => " + marks);
	}
	
	public static void twoDimArrayLiteral() {
		String[][] cars = {
				{"F-150", "Mustang", "Raptor"}, //index 0: [0][0], [0][1], [0][2]
				{"Hilux", "Sequoia", "Tundra"}, //index 1: [1][0], [1][1], [1][2]
				{"Accord", "Civic", "CR-V"}     //index 2: [2][0], [2][1], [2][2]
		};
		System.out.println("before: cars[2][0] ==> " + cars[2][0]);

		//access & modify nested array element 
		cars[2][0] = "Pilot"; //replace "Accord" with "Pilot"
		
		System.out.println("after: cars[2][0] ==> " + cars[2][0]);

		System.out.println("Cars ==> " + cars + "\n");
		
		for(int i =0; i < cars.length; i++) {
			for (int j =0 ; j < cars[i].length; j++)
				System.out.println(cars[i][j] + ", ");
			System.out.println();
		}
	}
	
	static void twoDimArrayInit() {
		String [][] cars = new String[3][5];
		
		cars[0][0] = "Focus";
		cars[0][1] = "Raptor";
		cars[0][2] = "Transittot";
		cars[0][3] = "Escape";
		cars[0][4] = "Explorer";
		cars[1][0] = "Highlander";
		cars[1][1] = "Yaris";
		cars[1][2] = "Tacoma";
		cars[1][3] = "Fortuner";
		cars[1][4] = "Rav-4";
		cars[2][0] = "Almera";
		cars[2][1] = "Altima";
		cars[2][2] = "Sentra";
		cars[2][3] = "Juke";
		cars[2][4] = "Murano";
		
		for(int i =0; i < cars.length; i++) {
			for (int j =0 ; j < cars[i].length; j++)
				System.out.println(cars[i][j] + ", ");
			System.out.println();
		}
	}
}
		