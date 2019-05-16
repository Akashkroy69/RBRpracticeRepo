package RegExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//--------------------------------------------------
//SATUS : WORKING
//NOTE : NEED TO WORK ON REG EXPRESSION. i HAVE DONE ENOGH PRACTICE BUT ON REG EXPRESSION CONVENTIONS I NEED
//TO WORK MORE.
//--------------------------------------------------

/*Q6. Check whether given string represents IPV4 address or not*/
public class TestingIPV4format {
	public static boolean isIPV4format(String string) {
		Pattern pattern = Pattern
				.compile("([0-9]{1,3}+.[0-9]{1,3}+.[0-9]{1,3}+.[0-9]{1,3}+)|([0-1]{1,8}+.[0-1]{1,8}+.[0-1]{1,8}+.[0-1]{1,8}+)");
		Matcher matcher = pattern.matcher(string);
		return matcher.matches();

	}

	public static void main(String[] args) {
		String ipv4AddressString;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the ipv4 address whose format has to be checked: ");
		ipv4AddressString = scanner.nextLine();
		boolean rightFormat = isIPV4format(ipv4AddressString);
		System.out.println(rightFormat);

	}

}
