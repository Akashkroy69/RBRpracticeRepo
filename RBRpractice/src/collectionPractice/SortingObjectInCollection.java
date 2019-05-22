package collectionPractice;

import java.util.ArrayList;
import java.util.Collections;



public class SortingObjectInCollection {

	public static void main(String[] args) {
		java.util.List<String> list = new ArrayList<String>();
		list.add("Nishu");
		list.add("Aakash");
		list.add("Aman");

		Collections.sort(list);// the sort method of Collections class will use merge
		// sort algorithm internally
		// as it is basically a stable sorting algorithm.
		// here the merge sort will use CompareTo() of String class as the list
		// collection object
		// contains object of String class.

		for (String str : list) {
			System.out.println(str);
		}
	}
}
