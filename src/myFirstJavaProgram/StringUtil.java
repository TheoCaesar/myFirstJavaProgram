/**
 * LESSON 10 - STRING CLASS
 * Strings are a reference data type(class/object) that offers us methods and properties to manipulate string data.
 */
package myFirstJavaProgram;

public class StringUtil {

	public static void intro() {
		// TODO Auto-generated method stub
		
		String name = "Bartholomew Montgomery";
		
		//some string properties
		System.out.println("name.charAt(5) - char at index 5 ==> " + name.charAt(5));
		System.out.println("name.codePointAt(1) - return ASCII value ==> " + name.codePointAt(1));
		System.out.println("name.codePointBefore(1) - return ASCII value of char before specified index ==> " + name.codePointBefore(1));
		System.out.println("name.codePointCount(0, name.length()) ==> " + name.codePointCount(0, name.length()));
		System.out.println("name.codePointCount(0, 5) ==> " + name.codePointCount(0, 5));

		System.out.println("name.length() ==> " + name.length());
		System.out.println("name.compareTo('timini') - returns negative if argument is lesser than callee lexicographically ==> " + name.compareTo("Zainab"));
		System.out.println("name.compareTo(name) - returns 0 if callee is equal to argument ==> " + name.compareTo(name));
		System.out.println("name.compareTo('timini') - returns positive if argument is greater than callee lexicographically ==> " + name.compareTo("abraham"));

		System.out.println("name.concat(\" Agyemang\") ==> " + name.concat(" Agyemang"));
		System.out.println("name.toUpperCase() ==> " + name.toUpperCase());
		System.out.println("name.toLowerCase() ==> " + name.toLowerCase());
		System.out.println("name.indent(5) ==> " + name.indent(5));
		System.out.println("name.indexOf(\"Mont\") - returns start index if substr is present ==> " + name.indexOf("Mont"));
		System.out.println("name.indexOf(\"kwame\") - returns -1 if substr is absent ==> " + name.indexOf("kwame"));

		System.out.println("name.isEmpty() ==> " + name.isEmpty());
		System.out.println("name.isBlank() ==> " + name.isBlank());
		System.out.println("name.toCharArray() ==> " + name.toCharArray());
		System.out.println("name. ==> " + name.replace('o', 'Q'));
		System.out.println("name.lastIndexOf('r') ==> " + name.lastIndexOf('r'));
		System.out.println("(\"   \" + name + \"    \").stripTrailing() ==> " + ("   " + name + "    ").stripTrailing());
		
	}

}
