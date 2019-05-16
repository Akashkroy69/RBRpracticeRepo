package RegExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExampleOnLookingAt {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("a*b");
		Matcher matcherObj = pattern.matcher("aaaabbbaaabbahf f");
		if (matcherObj.lookingAt()) {
			System.out.println("does the pattern match: " + matcherObj.lookingAt());
			/*
			 * here lookingAt() will try to match prefix or full text with the pattern if it
			 * matches any one of them then it returns true.
			 */
		}
		// Or with following way also a string can be checked that whether it matches
		// with a pattern or not
		boolean isMatch = Pattern.matches("a*b", "aaaaaaaaaaaab");
		System.out.println(isMatch);
	}

}
