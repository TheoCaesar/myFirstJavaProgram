/**
 * 	 ___________________________________________________________________________________________________________
 *	|		MODIFIER		|	  CLASS		|		PACKAGE			|		SUBCLASS		|		WORLD		|
 *  |+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|
 *	|		public			|		Y		|			Y			|			Y			|		  Y			|
 *	|		protected		|		Y		|			Y			|			Y			|		  N			|
 *	|		no modifier		|		Y		|			Y			|			N			|		  N			|
 *	|		private			|		Y		|			N			|			N			|		  N			|
 *	|+++++++++++++++++++++++|+++++++++++++++|+++++++++++++++++++++++|+++++++++++++++++++++++|+++++++++++++++++++|
 * 
 */
package accessModifiers1;

public class Beta {
	String className = "Beta: ";
	String defaultMsg = className + "This is a default accessible string";
	private String privateMsg = className + "This is a private message";
	public String publicMsg = className + "This is a public message";

}