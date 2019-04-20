package arrayPractice;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 * question 5:
 * 
 * Write a program to find the missing number in integer array of 1 to 100?
 * 
 * 
 * 
 * */
public class MissingElementsInArray {
	//Prints the missing number in the array 
	public void missingNumber(int[] array)
	{
		Arrays.sort(array);
		int j=0;
		System.out.println("Here are the missing numbers from the Array"
				+ " : ");
		for (int i = 1; i <= 100; i++) {
			if (i==array[j] && j<array.length || array[j]==0) {
				j++;
				
			}
			else {
				System.out.print(i+" ");
			}
			//System.out.println(j+"  "+i);
		}
		
	}
	public static void main(String[] args) {
		Scanner scanObjScanner = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int arraySize = scanObjScanner.nextInt();
		int[] number = new int[arraySize];
		System.out.println("Enter the elements in the array: ");
		for (int i = 0; i < number.length; i++) {
			number[i] = scanObjScanner.nextInt();
		}
		
		MissingElementsInArray objArray=new MissingElementsInArray();
		objArray.missingNumber(number);

	}

}
