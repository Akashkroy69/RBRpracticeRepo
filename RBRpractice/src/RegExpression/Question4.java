package RegExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 
 * Q4. Write a java program to check whether given string contains /../ or /./?
		Input: ravindraravula/./
		Output: true
		
		*
		*
		*/
public class Question4 {
	
	public static boolean isPresent(String string)
	{
		Pattern pattern = Pattern.compile("/./|/../");
		Matcher matcher= pattern.matcher(string);
		return matcher.find();
	}
	
	public static void main(String[] args) {
		
		/*
		 * System.out.println(pattern.toString()); Matcher matcher =
		 * pattern.matcher("akash/../"); System.out.println(matcher.find());
		 */
		String string;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the string: ");
		string=scanner.nextLine();
		System.out.println(isPresent(string));
		
		
	}

}
