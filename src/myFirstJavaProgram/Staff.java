/** 
 * OOPS Lesson 5 - toString()
 * this is an inbuilt method inherited by all objects, returning a string that "textually reps" that object.
 * It can be used implicitly (when we execute sysout) and explicitly (when we execute Object.toString()).
 * 
 * Now whenever we try to display an object via sysout, we see the address of where that object is stored in memory.
 * By convention, its advisable to override this toString() method and output something that is a "textual representation"
 * of our object, i.e. make the output readable.
 *  
 */
package myFirstJavaProgram;

public class Staff {
	String name;
	int age;
	double basicPay;
	String department;
	String title;
	
	public Staff(String name, int age, String dept, String role) {
		this.name= name;
		this.age = age;
		this.department = dept;
		this.title = role;
	}
	
	public Staff(String name, int age, String dept, String role, double pay) {
		this.name= name;
		this.age = age;
		this.department = dept;
		this.title = role;
		this.basicPay = pay;
	}
	
	public String toString() {
		return "Staff Name: " + this.name + "\n" + 
				"Age: " + this.age + "\n" + 
				"Department: " + this.department + "\n"+
				"Job Title: " + this.title + "\n" + 
				"Salary: " + ((this.basicPay > 0) ? this.basicPay : "N/A") + " \n";
	}
}
