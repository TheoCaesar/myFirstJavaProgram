/**
 * OOPS Lesson 7 - Passing Objects to methods as args
 * 
 */
package sectionOOPS;

public class Garage {
	int lotNumber = 0;
	
	public void park(Car carobj){
		System.out.println(carobj.make + " "  + carobj.model +  " parked at lot #" + (++lotNumber));
	}	  
	
}
