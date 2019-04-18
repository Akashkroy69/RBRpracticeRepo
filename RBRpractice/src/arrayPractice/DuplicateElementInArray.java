package arrayPractice;

import java.util.Arrays;
//This problem could be solved easily by hash table and hash map which we will see later.
import java.util.Scanner;

public class DuplicateElementInArray {
	public static void main(String[] args) {
		Scanner scanObjScanner = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int arraySize = scanObjScanner.nextInt();
		int[] number = new int[arraySize];
		for (int i = 0; i < number.length; i++) {
			number[i] = scanObjScanner.nextInt();
		}
		Arrays.sort(number);
		System.out.println("Printin after sorting the numbers: ");
		for(int num:number)
			System.out.print(num+" ");
		System.out.println();
		for (int i = 0; i < number.length; i++) {
			int count = 1;
			for (int j = i + 1; j < number.length; j++) {
				if (number[i] == number[j]) {
					count++;

				}
				else {
					i=j-1;
					break;
				}

			}
			if (count > 1) {
				System.out.println("number " + number[i] + " is repeated " + count + " times.");
			}

		}
	}

}
