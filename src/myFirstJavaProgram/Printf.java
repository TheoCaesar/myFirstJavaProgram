/**
 * Lesson 16 - printf
 * an optional method to cntrl, format & display text in our terminal,
 * takes two args - the format string + object/variable/value 
 * 		now our format string has a format specifier in it that acts as a placeholder, within which we'll replace our second arg.
 * 
 * 	Format specifier(placeholder) - this could be a combo of flags/precision/width/ and conversion character
 */
package myFirstJavaProgram;


public class Printf {

	public static void basics() {
		//printf with just the conversion characters
		boolean isMale = true;
		char grade = 'A';
		int currentYear = 2025;
		float salary = 12500.32102f;
		double debt = 2382594818542652.102948;
		String month = "February";
		
		System.out.printf("This is the year %d\n", currentYear);	 	//%d (decimal) - format specifier for integers; 
		System.out.printf("%b, Jeremy is a boy\n", isMale);				// %b (bool) - format specifier for boolean
		System.out.printf("Physics grade -> %c\n", grade );				//%c (char)	- format specifier for characters
		System.out.printf("Monthly Salary -> %f\n", salary);			//%f	- format specifier for float & double
		System.out.printf("National Debt -> %f\n",  debt);				//%f	- format specifier for float and double
		System.out.printf("10 more days to the end of %s\n",  month);	//%s	- format specifier for string

	}
	
	public static void width() {
		//using width in our format specifier (placeholder) allows us specify 
		//the minimum number of chars to write in our output. NB: this is used in addition to our flags.
		boolean isMale = true;
		char grade = 'A';
		int currentYear = 2025;
		float salary = 12500.32102f;
		double debt = 2382594818542652.102948;
		String longestWord = "de-oxyribonucleic_acid";
		
		System.out.printf("The longest word I can think of => -->|%s|<--\n", longestWord);		//%f - format specifier for string
		System.out.printf("The longest word, display at least 30 chars => -->|%30s|<--\n", longestWord);		//%f - format specifier for string
		System.out.printf("The longest word, display at least 10 chars => -->|%10s|<--\n", longestWord);		//%f - format specifier for string

		//NB: should characters in string be less than the specified width, then the differenece is replaced by whitespaces and aligned to the right
		//If the chars should be more than specified with, then nothing really happnens...all because, width when specified, represents the minimum amount of chars to display.
		
		//We can also pass negative values as our width, and while the same rule applies, the negative sign left justifies; i.e. align to left for whitespaces.
		System.out.printf("The longest word, display at least 30 chars (aligned to left) => -->|%-30s|<--\n", longestWord);		//%f - format specifier for string

		/**
		 * Question - can the width be used with other data types apart from strings???
		 * Answer - NO!, we could do this with any of our 
		 */
		System.out.println("\nWidth  formatter with non string data types");
		System.out.println("---------------------------------------------------");

		System.out.printf("\tThis is the year -->|%20d|<--\n", currentYear);	 	//%d (decimal) - format specifier for integers; 
		System.out.printf("\t-->|%10b|<--, Jeremy is a boy\n", isMale);				// %b (bool) - format specifier for boolean
		System.out.printf("\t\tPhysics grade -> -->|%5c|<--\n", grade );				//%c (char)	- format specifier for characters
		System.out.printf("\tMonthly Salary -> -->|%15f|<--\n", salary);			//%f	- format specifier for float & double
		System.out.printf("\tNational Debt -> -->|%25f|<--\n",  debt);				//%f	- format specifier for float and double
		
	}

	static void precision() {
		float salary = 12500.32102f;
		double debt = 2382594818542652.102948;
		System.out.printf("Monthly Salary (float - sans precision) -> %f\n", salary);			//%f	- format specifier for float & double
		System.out.printf("National Debt (float - sans precision) -> %f\n",  debt);				//%f	- format specifier for float and double

		//this allows us to set the number of digits after the decimal point. 
		//we precede the precision value with a decimal point  
		System.out.printf("Monthly Salary (float - 2 d.p) -> %.2f\n", salary);			//%f	- format specifier for float & double
		System.out.printf("National Debt (float - 4 d.p) -> %.4f\n",  debt);				//%f	- format specifier for float and double

	}
	
	
	static void flags() {
		/**	adds an effect to the output based on the flag added to our format specifier.
		 * 	|+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|
		 * 	|			flag			|				Outcome							|
		 *  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		 *  |			-				|				left justify					|
		 *  |			+				|		Append + or - for numeric values		|
		 *  |			0				|		Zero padding for numeric values			|
		 *  |			,				|		Comma separator for numbers > 1000		|		
		 *  |+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|								|		   
		 * 
		 */
		
		float salary = 12500.32102f;
		double debt = 2382594818542652.102948;
		System.out.printf("Monthly Salary (float - sans precision) -> %f\n", salary);			//%f	- format specifier for float & double
		System.out.printf("National Debt (float - sans precision) -> %f\n",  debt);				//%f	- format specifier for float and double

		System.out.println();
		//this allows us to set the number of digits after the decimal point. 
		//we precede the precision value with a decimal point  
		System.out.printf("Monthly Salary (float - 2 d.p) -> %,.2f\n", salary);			//%f	- format specifier for float & double
		System.out.printf("National Debt (float - 4 d.p) -> %,.4f\n",  debt);				//%f	- format specifier for float and double

		
		int currentYear = 2025;
		System.out.printf("\tThis is the year -->|%+d|<--\n", currentYear);	 		//%d (decimal) - format specifier for integers; 
		System.out.printf("\tThis is the year -->|%+d|<--\n", currentYear);	 		//%d (decimal) - format specifier for integers, signed.; 
		System.out.printf("\tThis is the year -->|%+20d|<--\n", currentYear);	 	//%20d (decimal) - format specifier for integers, signed, with a width of 20 white spaces; 
		System.out.printf("\tThis is the year -->|%+020d|<--\n", currentYear);	 	//%d (decimal) - format specifier for integers, signed, with a width of 20 white spaces, zero padded; 
		System.out.printf("\tThis is the year -->|%+,020d|<--\n", currentYear);	 	//%d (decimal) - format specifier for integers, signed, with a width of 20 white spaces, zero padded and comma separated; 	
	}
}
