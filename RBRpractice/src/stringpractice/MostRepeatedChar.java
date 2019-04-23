package stringpractice;

/*question 7. Write a java program to find the most repeted character in the given string?*/
import java.util.Scanner;

public class MostRepeatedChar {
	public static void mostRepeating(String string) {
		int count = 0, maxcount = 0;
		int index = string.length();
		for (int i = 0; i < string.length(); i++) {
			count = 0;
			for (int j = 0; j < string.length(); j++) {
				if (string.charAt(i) == string.charAt(j)) {
					count++;
				}
			}
			if (count > maxcount) {
				maxcount = count;
				index = i;
			}
		}
		System.out.println("Here is the most repeating character: " + string.charAt(index) + "" + " which repeats "
				+ maxcount + " times.");

	}

	public static void main(String[] args) {

		String string;
		Scanner obScanner = new Scanner(System.in);
		System.out.println("Enter a String: ");
		string = obScanner.nextLine();
		mostRepeating(string);
	}

}
