package RegExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleRegex {
	
	public static void main(String[] args) {
		int count=0;
		Pattern pattern= Pattern.compile("is");// It compiles the reg expression into NFA and returns the expression
		                                       // Like reg expression has some defined patterns
		                                       //     ex: RΣ^*A . It represents words which starts with R and A.
	    Matcher matcher=pattern.matcher("java is a programming language. It is mostly used in big data applications");
	    
	    
	    /*pattern object access the matcher method to find the expression which it holds in the string/file 
	     * passed to the method.
	     * it collects the info that where in the file/string it has seen the patterns.
	     * 
	     * */
	    
		while(matcher.find())//find() method returns boolean value if it finds the next pattern in the file/string.
		{
			/*
			 * start() method retrns the index where the pattern is starting in the string
			 * */ 
			System.out.println("tag: This is the index in which the pattern starts: "+matcher.start()+" ");
			
			count++;
		}
		System.out.println("The pattern is found : "+ count+ " times.");
	}

}
