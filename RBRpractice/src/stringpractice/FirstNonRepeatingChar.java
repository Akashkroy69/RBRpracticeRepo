package stringpractice;

import java.util.Scanner;

public class FirstNonRepeatingChar {
	public static void firstCharNonRepeats(String string) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			count = 0;
			for (int j = 0; j < string.length(); j++) {
				if (string.charAt(i) == string.charAt(j)) {
					count++;

					if (count > 1) {
						break;

					}

				}

			}
			if (count == 1) {
				System.out.println("First character in the string which doesn't repeats: " + string.charAt(i));
				return;
			}

		}
		System.out.println("Every character in the string repeats itself.");
	}

	public static void main(String[] args) {
		String string;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		string = scanner.nextLine();
		firstCharNonRepeats(string);
	}

}
