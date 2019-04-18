package arrayPractice;

import java.util.Scanner;

/*Although once array size is defined it can't be change but we can create an illusion of resizing 
 * the array by using heap concept*/
public class ResizingArray {
	
	///MAKING THE FOLLOWING METHOD AS PUBLIC STATIC AS THIS KIND OF METHOD CAN BE 
	/// USED VERY FREQUENTLY BY OTHER PROGRAMS.
	/// SO THAT THEY CAN CALLL IT BY CLASS NAME.

	public static char[] deleteAndResize(char[] data, int deletePosition) {
		if (deletePosition < data.length) {
			char[] temp = new char[data.length - 1];
			System.arraycopy(data, 0, temp, 0, deletePosition); // here deletePosition refers to number 3
																// which means for this method that we want
																// to copy 3 elements in the dest array
																// not till 3rd index.
			System.arraycopy(data, deletePosition + 1, temp, deletePosition, data.length - deletePosition - 1);
			return temp;

		}

		else {
			return data;
		}
	}

	public static void main(String[] args) {

		char[] data = { 'a', 'k', 'a', 's', 'h' };
		/// Data is a reference to the object created on the right side
		// which holds array of character.
		// ResizingArray resizeArray=new ResizingArray();
		Scanner index=new Scanner(System.in);
		
		System.out.println("Enter the index which you want to delete.");
		int indexPosition=index.nextInt();
		data = ResizingArray.deleteAndResize(data, indexPosition);
		
		
		///SEE THE PICTURE ATTATCHED TO IT OR NOTES TO KNOW HOW 
		///HOW HEAPS HELPS IN CREATING THIS ILLUSION.

		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);

		}

	}

}
