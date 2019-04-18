package arrayPractice;

import java.util.Arrays;

/*Write a program to print the number which is occuring odd number of times*/
public class ElementOccuringOddTimes {
	private int occuringOddTimes(int[] array) {
		Arrays.sort(array);

		for (int i = 0; i < array.length; i++) {
			int count = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;

				} else {
					i = j - 1;
					break;
				}
			}
			if (count % 2 == 1) {
				return array[i];
			}

		}
     return Integer.MAX_VALUE;
	}

	public static void main(String[] args) {
		int[] array = { 2, 3, 5, 4, 5, 2, 4 };
		ElementOccuringOddTimes objElementOccuringOddTimes=new ElementOccuringOddTimes();
		
		int oddTimeRepeater = objElementOccuringOddTimes.occuringOddTimes(array);
		if(oddTimeRepeater!=Integer.MAX_VALUE)
			System.out.println(oddTimeRepeater);

	}

}
