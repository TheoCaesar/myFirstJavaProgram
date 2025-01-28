/**
 * This is created to illustrate the various visibility levels we get from using the varieties we have (none/default, public, private and protected)
 * across the various levels(class, package, subclass, world/everywhere)
 */
/**
 * We will be creating an additional package for this testing as we need to see
 * how visible a property, method or class in itself will act based on the access
 * modifier and the location at which we attempt to access it.*/
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
