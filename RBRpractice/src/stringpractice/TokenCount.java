package stringpractice;

/*
 * 
 * 
 * 
 * Q2. Write a java program to count the number of times token string appeared in given target string? 
		Input: TargetString : java is a programming language. It is mostly used in big data applications
		       TokenString: is
		Output: 2
		
		*
		
		*
		*
		*
		*/
public class TokenCount {
	public static void countToken(String string, String token) {
		String[] locStrings = string.split(" ");
		int count = 0;
		for (int i = 0; i < locStrings.length; i++) {
			if (token.equals(locStrings[i])) {
				count++;

			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		String string = "I am a good boy. am I in your mind? I am intersted too am";
		String token = "am";
		countToken(string, token);

	}

}
