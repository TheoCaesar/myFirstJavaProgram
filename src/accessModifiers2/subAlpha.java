
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
 */package accessModifiers2;
import accessModifiers1.Alpha;

public class subAlpha extends Alpha{
	subAlpha(){
		System.out.println(this.protectedMsg); 	// Allowed - access protected prop from parent - even across packages
//		System.out.println(this.defaultMsg); 	// Not Allowed - can't access default prop from parent
		System.out.println(this.publicMsg); 	// Allowed - access from parent public prop - even across packages
//		System.out.println(this.privateMsg); 	// Not Allowed - can't access private prop from parent

	}
}
