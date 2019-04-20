package arrayPractice;

import java.util.Scanner;

public class ReverseArray {
	private static int[] reverse(int[] array)
	{
		for (int i = 0,j=array.length-1; i < j; i++,j--) {
			int temp;
			
			temp=array[j];
			array[j]=array[i];
			array[i]=temp;
			
			
		}
		return array;
	}
	public static void main(String[] args) {
		
		Scanner scanObjScanner = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int arraySize = scanObjScanner.nextInt();
		int[] number = new int[arraySize];
		for (int i = 0; i < number.length; i++) {
			number[i] = scanObjScanner.nextInt();
		}
		
		number = reverse(number);
		for (int num: number) {
			System.out.println(num);
			
		}
		
		
	}

}
