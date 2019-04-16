package arrayPractice;

public class ArrayIsAnObject {
	
	public static void main(String[] args) {
		int[] arr= {1,2};
		if(arr instanceof Object)
		{
			System.out.println("Arr is an object of int[].class which is created by JVM\nBy default int.class will inherit Object class"
					+ " .class will be added by Java compiler and later JVM will write class code for class"
					+ ". Jvm adds 'length' variable for arr's class int[] ");
		}
		
	}

}
