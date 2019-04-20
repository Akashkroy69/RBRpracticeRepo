package arrayPractice;

import java.util.Arrays;

public class ThirdSmallestElement {
	public static void thirdSmallest(int[] array) {
		int count = 0;
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			if (i == 0 || array[i] != array[i - 1]) {
				count++;

			}
			if (count == 3) {
				System.out.println("The third smallest number is : " + array[i]);
				return;

			}
		}
		if (count != 3) {
			System.out.println("Nothing is found.");
			return;
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 1,2,2,3 };

		thirdSmallest(array);
	}

}
