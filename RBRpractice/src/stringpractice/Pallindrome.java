package stringpractice;

import java.util.Scanner;

public class Pallindrome {

	public static void isPallindrome(String string) {
		for (int i = 0, j = string.length() - 1; i < j; i++, j--) {
			if (string.charAt(i) != string.charAt(j)) {
				System.out.println("String is not Pallindrome.");
				return;
			}
			System.out.println("String is Pallindrome.");
			return;

		}

	}

	public static void main(String[] args) {
		String string;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		string = scanner.nextLine();
		//while (true)
			isPallindrome(string);

	}

}
