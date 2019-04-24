package stringpractice;

import java.util.Scanner;

/*
 * 
 * 
 * 
 *
 * 
 * 
 * 10. Write a java program to sort the given string?
		Example: input : ravindra
				 output : aadinrrv
				 
*-----------------------------------------
* THIS PROGRAM NEEDS TO BE CHECKED
* STATUS: NOT GIVING THE EXPECTED OUTPUT
*----------------------------------------- 
* 
* */
public class SortingCharInString {
	public static void sortingCharacter(String string) {
		/*
		 * int i=string.charAt(0); System.out.println(i);
		 */
		int min;
		char[] sorted = new char[string.length()-1];
		/*
		 * int t=string.charAt(0)-string.charAt(1);
		 * 
		 * System.out.println(t);
		 */
		for (int i = 0; i < string.length(); i++) {
			min = i;
			for (int j = i + 1; j < string.length(); j++) {

				if (string.charAt(j) <= string.charAt(min)) {
					min = j;
					System.out.println("in this iteration the char which has to be "
							+ " sorted :"+ string.charAt(min));
				}
			}
			sorted[i] = string.charAt(min);
		}
		System.out.println("Here is the sorted array: ");
		for (char c : sorted) {
			System.out.print(c);
			
		}
		

	}

	public static void main(String[] args) {
		String string;
		System.out.println("Enter a String : ");
		Scanner scanner = new Scanner(System.in);
		string = scanner.nextLine();
		sortingCharacter(string);

	}

}
