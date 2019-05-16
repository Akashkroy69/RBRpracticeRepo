package RegExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.Checksum;

/*Q2: Write a java program to validate the url?
		Input : Url
		
		Output: true/false
		
		
		Note : Url is valid if it starts with either of the following
			http:// [OR]
			http://www.	[OR]
			https:// [OR]
	
			https://www.
			
		if user enter 'quit',program should stop checking. 	
*/
public class URLformatTesting {

	public static boolean isURLvalid(String urlString) {

		if (Pattern.matches("http(s?)://(www/.)?.*", urlString)) {
			System.out.println("The Entered URL is : in right format.");
			return true;
		} else {
			System.out.println("Enter the right format of URL.");
			return false;
		}
	}

	public static void main(String[] args) {
		// Pattern pattern= Pattern.compile("http(s?)://(www/.)?.*");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter URL(enter 'quit' to quit checking' : ");
		String urlString = scanner.nextLine();
		while (!urlString.equalsIgnoreCase("quit")) { // I was using this--> [urlString != "quit"] as condition which is
														// wrong as this format doesn't
			// checks value but it checks only obj ref whether they refer to same obj
			// instance or other.
			isURLvalid(urlString);
			System.out.println("Enetr URL again :");
			urlString = scanner.nextLine();
			

		}
		System.out.println("testing is quitted.");
	}

}
