/**
 * LESSON 11 - WRAPPER CLASS
 * These are Java's way of using primitive data types as reference data types. 
 * As reference data types, we are able to leverage useful methods for a variety of tasks, 
 * including dealing with arrays (ArrayList)
 * 
 * //primitive 		//wrapper
 * +++++++++++++++++++++++++++
 * //boolean		Boolean
 * //char			Character
 * //int			Integer
 * //double			Double
 * //array			ArrayList
 * 
 * autoboxing = the automatic conversion that Java does for primitive types to reference;
 * unboxing = the reversal of autoboxing. Automatic conversion from reference to primitive types
 * 
 *  //Disadvantage to using wrapper classes are that they are a tad bit expensive - memory wise and time involved in data retrieval
 *  
 *  LESSON 12 - ARRAYLIST
 *  This is a wrapper class that returns a resizable array. 
 *  Some methods offered allow us to add and remove elements after the compilation process.
 */
package myFirstJavaProgram;

import java.util.ArrayList;

public class Wrapper {

	public static void intro() {
		//primitive variable initialization
		boolean isMale = true;
		int luckyNumber = 7;
		char firstLetter = 'A';
		double debt = 124589.83;
		
		//autoboxing
		Boolean wrapperIsMale = isMale; // or direct value assignment wrapperIsMale = true;
		Integer wrapperLuckyNum = luckyNumber;
		Character wrapperFirstLetter = firstLetter;
		Double wrapperDebt = debt;
		
		
		//unboxing - convet to primitive for logging purposes
		System.out.println("wrapperIsMale  ==> " +  wrapperIsMale);
		System.out.println("wrapperLuckyNum  ==> " +  wrapperLuckyNum);
		System.out.println("wrapperFirstLetter  ==> " +  wrapperFirstLetter);
		System.out.println("wrapperDebt  ==> " +  wrapperDebt);
//		System.out.println("wrapper  ==> " +  wrapper);
		
	}

	public static void arrayList() {
		/**
		 * regular arrays are declared with DataType + [] + array_name = new DataType[array_size];
		 * for the wrapper version our data type is ArrayList Class -> ArrayList<DataType> array_name = new ArrayList<DataType>();
		 * 
		 */
		
		ArrayList<String> cars = new ArrayList<String>(3); //set initial capacity of array list to 3.
		
		cars.add("Mustang");
		cars.add("Tesla");
		cars.add("Prado");
		cars.add("Explorer");	//set 4th arraylist element sans out of bounds exception
		System.out.println("\nSize of array ==> " + cars.size() + cars);
		for (int i = 0;i < cars.size(); i++)
			System.out.println("\t" + cars.get(i));
		
		cars.remove(2);
		System.out.println("\nSize of array ==> " + cars.size());
		for (int i = 0;i < cars.size(); i++)
			System.out.println("\t" + cars.get(i));
		
		
		cars.clear(); //delete all elements in arrayList
		System.out.println("\nSize of array ==> " + cars.size());
		for (int i = 0;i < cars.size(); i++)
			System.out.println("\t" + cars.get(i));
		
	}
	
	public static void twoDimArrayList() {
		ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
//		ArrayList<ArrayList<String>> groceryList = new ArrayList<>();    //works as well...?????

		ArrayList<String> snacks = new ArrayList<String>(7);
		snacks.add("chocolate");
		snacks.add("biscuits");
		snacks.add(2, "Sweets");
		snacks.add(1, "Cookies");
		snacks.add(0, "oreos");
		
		ArrayList<String> meals = new ArrayList<String>();
		ArrayList<String> drinks = new ArrayList<String>();
		String[] drinksArray = {"malt", "barley", "beer", "juice", "water", "soda"};
		String[] snacksArray = {"fufu", "jollof", "waakye", "Fried rice", "omotuo"};
		
		for (int i = 0; i < snacksArray.length; i++)
			meals.add(snacksArray[i]);
		
		for (int i = 0 ; i < drinksArray.length; i++)
			drinks.add(drinksArray[i]);
		
		snacks.remove("biscuits");
		
		//add arrayLists to 2d array lists
		groceryList.add(0, meals);
		groceryList.add(1, snacks);
		groceryList.add(2, drinks);
	
		//display 2d arrayList
		System.out.println("grocery list " + groceryList);
		
//		display nested arrayList
		System.out.println("\nSize of array ==> " + groceryList.size());
		for (int i = 0;i < groceryList.size(); i++)
			System.out.println("\t" + groceryList.get(i) + "\n");
		
		//display string elements of nested arrayList
		for (int i=0; i < groceryList.size(); i++) {
			System.out.println("[\n");
			for(int j =0; j < groceryList.get(i).size(); j++) {
				System.out.println("\t" + groceryList.get(i).get(j) + ", ");
			}
			System.out.println("]\n");

		}
				
	}

}
