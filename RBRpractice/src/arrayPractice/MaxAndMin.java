package arrayPractice;

/*
 * 
 * 
 * Question: 1. Write a program to find the largest and smallest element 
 * in the given array?
 * 
 * 
 * */
import java.util.Arrays;

public class MaxAndMin {

	public int max(int[] array) {
		Arrays.sort(array);
		int length = array.length;
		return array[length - 1];

	}

	public int min(int[] array) {
		Arrays.sort(array);
		return array[0];

	}

	public static void main(String[] args) {
		int[] array = { 5, 43, 23, 87, 12, 67, 47, 37 };
		MaxAndMin objAndMin = new MaxAndMin();
		System.out.println("Max: " + objAndMin.max(array));
		System.out.println("Min: " + objAndMin.min(array));

	}

}
