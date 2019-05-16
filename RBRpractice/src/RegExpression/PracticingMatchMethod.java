package RegExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticingMatchMethod {
	public static void main(String[] args) {
		String contentString="This is Akash book content.";
		String patternString=".*book.*";
		Pattern pattern=Pattern.compile(patternString);
	    boolean isMatching= pattern.matches(patternString, contentString);
	    //Matcher matcher=pattern.matcher(contentString);
	    if (isMatching) {
			System.out.println(isMatching);
					//+" starting at: "+matcher.start()+" and ends at : "+ matcher.end());
		}
	}

}
