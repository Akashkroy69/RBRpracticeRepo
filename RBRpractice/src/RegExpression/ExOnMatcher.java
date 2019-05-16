package RegExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExOnMatcher {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("a*b");
		Matcher matcher1 = pattern.matcher("aaaaab");
		Matcher matcher2 = pattern.matcher("aaaabaaab");
		if (matcher1.matches()) {
			System.out.println("yes the pattern has matched " + "and the index starts from " + " index"
					+ matcher1.start() + " and ends at " + matcher1.end());
		}
		System.out.println("Does the second one matches? "
				+ matcher2.matches());/*
										 * as matches method tries to match the whole string if it doesn't match then it
										 * returns false.
										 * this kind of thing has to be checked by lookingAt()
										 */
	}

}
