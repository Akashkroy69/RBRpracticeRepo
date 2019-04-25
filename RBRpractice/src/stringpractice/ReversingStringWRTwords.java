package stringpractice;

import java.util.Scanner;

/*
 * 
 * 
 * 
 * 
 * 8. Write a java program to reverse a words in a given string?
   Example : i love raudra and ravindra
		     ravindra and raudra love i
 
 *
 *
 *
 *
 *
 */

/*
 * 
 * Algorithm: In Java, it is simple :we can convert a string in string array with the help of split function.
 * 
 * 
 * But in c it is done by following algorithm:
 * 
 * step 1. reverse all characters in the each words/tokens of the string.
 *          ex: i like this program very much
 *          will becme like:i ekil siht margorp yrev hcum
 * step 2: then reverse the whole string.
 * 
 * 
 * */
public class ReversingStringWRTwords {

	public static void reverse(String string) {
		String[] locString = string.split(" ");
		/*
		 * instead of using string we can use mutable //stringBuilder/StringBuffer
		 * class's append method too whose returned obj later could be converted in to
		 * String class's string.
		 * 
		 */ 
		String tempString = "";
		for (int i = locString.length - 1; i >= 0; i--) {

			tempString += locString[i] + " ";
		}
		System.out.println("here is the reversed string : " + tempString);
	}

	public static void main(String[] args) {
		String string = "Akash is a good boy";
		Scanner obScanner = new Scanner(System.in);

		System.out.println("Enter a String: ");
		string = obScanner.nextLine();

		reverse(string);

	}
}
