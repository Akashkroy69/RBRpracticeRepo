package stringpractice;

/*
 * 
 * 
 * questtion: 4.
 * 
 * Given a string s1 and a string s2, write a java method to say whether s2 is a rotation of s1 ?
		
   
   Example : given s1 = abcd and s2 = cdab, return true, given s1 = abcd, and s2 = acbd , return false
   
 *
 *
 */
import java.util.Scanner;

public class RotationString {
	public static boolean isRotation(String origString, String stringrotationtobechecked) {
		int startingindexS1 = 0;

		if (origString.length() == stringrotationtobechecked.length()) {
			for (int i = 0; i < origString.length(); i++) {
				if (origString.charAt(0) == stringrotationtobechecked.charAt(i)) {
					startingindexS1 = i;
					break;
				}

			}
			for (int i = 0; i < origString.length(); i++) {
				if (stringrotationtobechecked.charAt(i) == origString.charAt(startingindexS1++ % origString.length())) {

				} else {
					System.out.println("tag1");
					return false;
				}
			}
			System.out.println("tag2");
			return true;
		} else {
			System.out.println("tag3");
			return false;
		}
	}

	public static void main(String[] args) {
		String origString, stringrotationtobechecked;
		Scanner obScanner = new Scanner(System.in);
		System.out.println("Enter two String" + " (NOTE: string should not repeat any character): ");
		origString = obScanner.nextLine();
		stringrotationtobechecked = obScanner.nextLine();
		System.out.println(isRotation(origString, stringrotationtobechecked));

	}

}
