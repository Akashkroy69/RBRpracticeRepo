package stringpractice;

import java.util.Scanner;

public class ReverseStringUsingStringBuffer {
	public static String reverse(String stringtobereversed) {

		StringBuffer stringBuffer = new StringBuffer();

		for (int i = stringtobereversed.length() - 1; i >= 0; i--) {

			stringBuffer.append(stringtobereversed.charAt(i));

		}

		return stringBuffer.toString();
	}
	// In the following code we are using the default method reverse() which is
	// provided
	// by java in String, StringBuffer and StringBuilder class.

	public static String reverseByDefaultMethodOfStringBuffer(String stringtobereversed) {
		return (new StringBuffer(stringtobereversed)).reverse().toString();

	}

	public static void main(String[] args) {
		String string;
		Scanner obScanner = new Scanner(System.in);
		System.out.println("Enter a String: ");
		string = obScanner.nextLine();
		// System.out.println(string);

		string = reverse(string);// code to be checked. why it is not printing the string after
									// reverse function returns. In previous ex this happened too
                                    /*
                                     *         ^
                                     *         |
                                     *         |
                                     *     PROBLEM RESOLVED: it was just that in function I had written wrong condition case
                                     *     in for loop in line:10
                                     * 
                                     * 
                                     * */
		System.out.println("Here is the string after reversing : " + string);
		System.out.println("Again reversing. This time by default method which is provided by"
				+ " StringBuilder or StringBuffer class : ");
		string = reverseByDefaultMethodOfStringBuffer(string);
		System.out.println(string);
		obScanner.close();

	}

}
