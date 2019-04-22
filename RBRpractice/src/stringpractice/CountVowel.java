package stringpractice;

import java.util.Scanner;

public class CountVowel {
	public static int numerOfVowels(String string) {
		int count = 0;
		// char[] vowel= {'a','e','i','o','u'};
		for (int i = 0; i < string.length(); i++) {
			char vowel = string.charAt(i);
			if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
				count++;

			}

		}
		return count;
	}

	public static void main(String[] args) {
		String string;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string : ");
		while (true) {
			string = scanner.nextLine();
			
			int count = numerOfVowels(string);
			System.out.println("Number of the vowels in the string : " + count);
			
		}
		

	}

}
