package stringpractice;

import java.util.Scanner;

public class ReverseString {
	public static String reverse(String stringtobereversed)
	{
		String reversedString="";
		
		for (int i = stringtobereversed.length()-1; i <= 0; i--) {
			reversedString=reversedString+stringtobereversed.charAt(i);
			
		}
		
		 return reversedString;
		
	}
	public static void main(String[] args) {
		String string;
		Scanner obScanner=new Scanner(System.in);
		System.out.println("Enter a String: ");
		string=obScanner.nextLine();
		
		string=reverse(string);
		System.out.println("Here is the string after reversing : "+string);
		obScanner.close();
		
	}

}
