package stringpractice;

import java.util.Scanner;

public class ReverseStringUsingStringBuffer {
	public static String reverse(String stringtobereversed) {
		StringBuffer stringBuffer=new StringBuffer();

		for (int i = stringtobereversed.length() - 2; i <= 0; i--) {
			
			stringBuffer.append(stringtobereversed.charAt(i));

		}

		return stringBuffer.toString();
	}
	
	public static void main(String[] args) {
		String string;
		Scanner obScanner = new Scanner(System.in);
		System.out.println("Enter a String: ");
		string = obScanner.nextLine();
		//System.out.println(string);

		string = reverse(string);//code to be checked. why it is not printing the string after 
		                         // reverse function returns. In previous ex this happened too
		System.out.println("Here is the string after reversing : " + string);
		obScanner.close();
		
	}

}
