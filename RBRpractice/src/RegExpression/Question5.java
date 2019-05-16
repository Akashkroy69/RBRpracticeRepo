package RegExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Q5. Write a java program to check whether the given string ended with ".htm" or ".html"?*/
public class Question5 {
	public static boolean endsWithhtmOrhtml(String string) {

		Pattern pattern = Pattern.compile(".*(.html|.htm)");

		Matcher matcher = pattern.matcher(string);

		return matcher.matches();// here find() can't be used as find() method just finds the pattern in the
									// given string.
		// It can find the string in start, middle or at the end.
		/// But matches() finds and tries to match the whole string pattern with the
		// string.
	}

	public static void main(String[] args) {
		String string;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the url: ");

		string = scanner.nextLine();

		System.out.println(endsWithhtmOrhtml(string));

	}

}
