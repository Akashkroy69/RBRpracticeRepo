package RegExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import RegExpression.URLformatTesting;;

/*
 * 
 * 
 * 
 * Q3: Write a java program to get the host name, protocol and path string from given Url string without using URL class?
	Input: UrlString
	Output: hostname: 
		protocol:
		pathString: 
Example: Input:  http://www.example.com:80/path/to/myfile.html?key1=value1&key2=value2
	Output: hostname: www.example.com
		protocol: http
		pathstring: path/to/myfile.html

*
*
*
*
*
*/
public class Questio3InfoFromGivenURL {

	public static String getHostnameString(String urlString) {
		StringBuilder stringBuilder = new StringBuilder();
		Pattern pattern = Pattern.compile(".*com");
		Matcher matcherObj = pattern.matcher(urlString);
		if (matcherObj.find()) {
			int startIndex = matcherObj.start();
			int endIndex = matcherObj.end();
			for (int i = startIndex + 7; i < endIndex; i++) {
				stringBuilder.append(urlString.charAt(i));
			}
			return stringBuilder.toString();
		}
		return "Couldn't Find the Host Name.";
	}

	public static String getProtocolString(String urlString) {
		StringBuilder stringBuilder = new StringBuilder();
		Pattern pattern = Pattern.compile("http(s?)");
		Matcher matcherObj = pattern.matcher(urlString);
		if (matcherObj.find()) {
			int startIndex = matcherObj.start();
			int endIndex = matcherObj.end();
			for (int i = startIndex; i < endIndex; i++) {
				stringBuilder.append(urlString.charAt(i));
			}
			return stringBuilder.toString();
		}
		return "Couldn't Find the Protocol Name.";
	}

	public static String getPathString(String urlString) {
		StringBuilder stringBuilder = new StringBuilder();
		Pattern pattern = Pattern.compile("com/.*");
		Matcher matcherObj = pattern.matcher(urlString);
		if (matcherObj.find()) {
			int startIndex = matcherObj.start();
			int endIndex = matcherObj.end();
			for (int i = startIndex+4; i < endIndex; i++) {
				stringBuilder.append(urlString.charAt(i));
			}
			return stringBuilder.toString();
		}
		return "Couldn't Find the path.";
	}

	public static void main(String[] args) {
		String urlString;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter valid url: ");
		urlString = scanner.nextLine();
		/*
		 * System.out.println("------------------------------------------------------");
		 * System.out.println("Hostname: " + getHostnameString(urlString));
		 * System.out.println("Protocol: " + getProtocolString(urlString));
		 * System.out.println("Path: " + getPathString(urlString));
		 * System.out.println("------------------------------------------------------");
		 */
		if (URLformatTesting.isURLvalid(urlString)) {

			System.out.println("Hostname: " + getHostnameString(urlString));
			System.out.println("Protocol: " + getProtocolString(urlString));
			System.out.println("Path: " + getPathString(urlString));
		} else {
			main(null);
		}

	}

}
