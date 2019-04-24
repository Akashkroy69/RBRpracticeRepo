package stringpractice;

import java.util.Scanner;

/*
 * 
 * 
 * 
 * 
 * 
 * Write a java program to remove the space in the given string?
		Input: Ravindra babu ravula
		Output: Ravindrababuravula
*
*
*
*/
public class RemoveAllSpace {

	public static void removeSpacesMethodOne(String string) {
		string = string.replaceAll(" ", "");
		System.out.println("By Method One : "+string);
	}

	public static void removeSpacesMethodTwo(String string) {

		char[] charArray = string.toCharArray();
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] != ' ') {
				stringBuilder.append(charArray[i]);

			}
		}

		string = stringBuilder.toString();
		
		System.out.println("By Method 2: "+string);

	}

	public static void main(String[] args) {
		String string;
		System.out.println("Enter a String : ");
		Scanner scanner = new Scanner(System.in);
		string = scanner.nextLine();
		removeSpacesMethodOne(string);// (string);//(string);
		//System.out.println(string);
		removeSpacesMethodTwo(string);

	}

}
