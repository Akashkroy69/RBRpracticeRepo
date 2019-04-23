package stringpractice;

import java.util.Scanner;

/*
 * 
 * 
 * 5. Write a java program to remove characters from the first string which are present in the second string?
 * 
 * 
 * 
 * */
public class RemovingCharFromString1WhichAreInString2 {
	public static String freshString(String string1, String string2) {
		StringBuilder sBuilder = new StringBuilder();
		for (int i = 0; i < string1.length(); i++) {
			boolean charPresent = false;
			for (int j = 0; j < string2.length(); j++) {
				if (string1.charAt(i) == string2.charAt(j)) {
					charPresent = true;
					break;
				}
			}
			if (charPresent == false) {
				sBuilder.append(string1.charAt(i));

			}

		}

		return sBuilder.toString();
	}

	public static void main(String[] args) {

		String stringcharhastobedeletedfrm, stringtobechecked;
		Scanner obScanner = new Scanner(System.in);
		System.out.println("Enter two String: ");
		stringcharhastobedeletedfrm = obScanner.nextLine();
		stringtobechecked = obScanner.nextLine();
		String freshString = freshString(stringcharhastobedeletedfrm, stringtobechecked);

		System.out.println("Here is the fresh string: " + freshString);

	}

}
