package RegExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Q1. Write a java program to remove the comments from xml string ?
	
	Input : <?xml version="1.0" encoding="UTF-8"?><root>
	<a<!-- I'm a comment-->><b/><b/>hola<c i='o'></c></a></root>
	
	
	Note: Between <!-- and -->, any text in that section is considered a comment in xml string
	
	
	
	
	Output: <?xml version=\"1.0\" encoding=\"UTF-8\"?><root ><a ><b /><b /><c i=\"o\" ></c>hola</a></root>
*/
public class Question1 {
	public static void main(String[] args) {
		String inputString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root>\n" + 
				"<a<!-- I'm a comment-->><b/><b/>hola<c i='o'></c></a></root>";
		//As in xml <!-----> is considered as a comment
		Pattern pattern=Pattern.compile("<!--.*-->");
		Matcher matcher=pattern.matcher(inputString);
		String[] freshString=null;
		if (matcher.find()) {
			freshString=pattern.split(inputString);
		}
		
		for (String string : freshString) {
			System.out.print(string);
		}
	}

}
