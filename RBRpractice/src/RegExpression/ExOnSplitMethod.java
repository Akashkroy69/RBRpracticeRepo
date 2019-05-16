package RegExpression;

import java.util.regex.Pattern;

// Creating a string array ehich holds only words from a sttring not white spaces.
public class ExOnSplitMethod {
	public static void main(String[] args) {
		String conString=" I am a good  boy.";
		Pattern pattern=Pattern.compile("\\s");
		String [] arrayStrings=pattern.split(conString);
		for (String string : arrayStrings) {
			System.out.print(string);
		}
		
	}

}
