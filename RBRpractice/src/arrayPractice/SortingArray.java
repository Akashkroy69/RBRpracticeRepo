package arrayPractice;

/*
 * 
 * 
 * 3. Given an array A[], write a program to sort the array?
 * 
 * 
 * */
public class SortingArray {
	static int i=0;

	private static int partitionQuickSort(int[] array, int startingIndex, int lastIndex) {

		int pivot = array[lastIndex];
		int i = startingIndex - 1;
		for (int j = startingIndex; j < array.length - 1; j++) {
			if (array[j] <= pivot) {
				i = i + 1;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;

			}

		}
		int temp = array[i + 1];
		array[i + 1] = pivot;
		array[lastIndex] = temp;
		return i + 1;
	}

	private static void quickSort(int[] array, int firstIndex, int lastIndex) {
		int partitionIndex = 0;
		
		System.out.println(i++);
		if (firstIndex < lastIndex) {
			partitionIndex = partitionQuickSort(array, firstIndex, lastIndex);
			if (lastIndex == firstIndex) {
				return;

			}
			quickSort(array, firstIndex, partitionIndex - 1);
			quickSort(array, partitionIndex + 1, lastIndex);

		}

	}

	public static void sortUsingQuicksortAlgorithm(int[] array, int firstIndex, int lastIndex) {
		/*
		 * int key=array[1]; for (int i = ; i < array.length; i++) {
		 * 
		 * for (int j = ; j < array.length; j++) {
		 * 
		 * }
		 * 
		 * }
		 */

		partitionQuickSort(array, 0, array.length - 1);

		
		for (int number : array) {
			System.out.print(number + " ");
		}
		quickSort(array, firstIndex, lastIndex);
		/*
		 * quickSort(array, firstIndex, lastIndex);
		 * System.out.println("After quick sort elements in ascending order:"); for (int
		 * number : array) { System.out.print(number + " "); }
		 */
	}

	public static void main(String[] args) {
		int[] array = { 2, 54, 23, 87, 98, 575, 453, 75 };
		int[] arrays = { 9, 6, 5, 0, 8, 2, 4, 7 };

		SortingArray.sortUsingQuicksortAlgorithm(arrays, 0, arrays.length - 1);

	}
}
