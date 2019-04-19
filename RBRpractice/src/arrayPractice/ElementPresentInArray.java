package arrayPractice;

/*
 * 
 *
 *2.Given an array A[], write a program to check whether
 *the element "x" present in the array or not?
 *  
 *  
 **/
public class ElementPresentInArray {

	public static boolean isPresent(int[] array, int number) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				return true;

			}

		}
		return false;

	}

	public static void main(String[] args) {
		int[] array = { 3, 422, 54, 76, 466, 75, 34, 54, 85 };
		System.out.println(ElementPresentInArray.isPresent(array, 422));
		System.out.println(ElementPresentInArray.isPresent(array, 23));

	}

}
