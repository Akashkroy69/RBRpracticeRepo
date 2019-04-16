package oopsQuestion3;

/*
 * 
 * 
 * 
 * (The MyInteger class) Design a class named MyInteger. The class contains:      
                                                                             
 ■ An int data field named value that stores the int value represented by this  
   object.                                                                      
 ■ A constructor that creates a MyInteger object for the specified int value.   
 ■ A getter method that returns the int value.                                  
 ■ The methods isEven(), isOdd(), and isPrime() that return true if the         
   value in this object is even, odd, or prime, respectively.                   
 ■ The static methods isEven(int), isOdd(int), and isPrime(int) that            
   return true if the specified value is even, odd, or prime, respectively.     
 ■ The static methods isEven(MyInteger), isOdd(MyInteger), and                  
   isPrime(MyInteger) that return true if the specified value is even, odd,     
   or prime, respectively.                                                      
 ■ The methods equals(int) and equals(MyInteger) that return true if            
   the value in this object is equal to the specified value.                    
 ■ A static method parseInt(char[]) that converts an array of numeric           
   characters to an int value.                                                  
 ■ A static method parseInt(String) that converts a string into an int          
   value.
 Write a client program that tests all methods in the class.       

*
*
*
*/
public class MyInteger {
	private int value;

	/*
	 * public MyInteger() { this(0); }
	 */

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	/*
	 * public void setValue(int value) { this.value = value; }
	 */
	public boolean isEven() {
		return isEven(value);

	}

	public boolean isOdd() {
		return isOdd(value);
	}

	public boolean isPrime() {
		return isPrime(value);
	}

	public static boolean isOdd(int value) {
		if (value % 2 == 0)
			return false;
		else
			return true;
	}

	public static boolean isEven(int value) {
		if (value % 2 == 0)
			return true;
		else
			return false;
	}

	public static boolean isPrime(int value) {
		if (value >= 1) {
			for (int i = 2; i < value; i++) {
				if (value % i == 0) {
					return false;
				}

			}
			return true;
		} else {
			return false;
		}
	}

	public static boolean isEven(MyInteger myInteger) {
		return myInteger.isEven();

	}

	public static boolean isOdd(MyInteger myinteger) {
		/// System.out.println("here is the answer: "+myinteger.isOdd()+"
		/// ///"+myinteger);
		return myinteger.isOdd();

	}

	public static boolean isPrime(MyInteger myinteger) {
		return myinteger.isPrime();
	}

	public boolean isEqual(int value) {
		return this.value == value;
	}

	public boolean isEqual(MyInteger myinteger) {
		return this.value == myinteger.value;
	}

	public static int parseInt(char[] numericCharArray) {
        int number=0;
        for(int i=0,j=(int)Math.pow(10, numericCharArray.length-1);i<numericCharArray.length;i++,j=j/10)
        {
        	number+=(numericCharArray[i]-48)*j;
        }
		return number;
	}

	public static int parseInt(String numericString) {
        int number=0;
        for(int i=0,j=(int)Math.pow(10, numericString.length()-1);i<numericString.length();i++,j/=10)
        {
        	number+=(numericString.charAt(i)-48)*j;
        }
		return number;
	}

}
