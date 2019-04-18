package arrayPractice;

import java.util.Scanner;

/*Although once array size is defined it can't be change but we can create an illusion of resizing 
 * the array by using heap concept*/
public class ResizingArray {

	/// MAKING THE FOLLOWING METHOD AS PUBLIC STATIC AS THIS KIND OF METHOD CAN BE
	/// USED VERY FREQUENTLY BY OTHER PROGRAMS.
	/// SO THAT THEY CAN CALLL IT BY CLASS NAME.

	public static char[] deleteAndResizeArray(char[] data, int deletePosition) {
		if (deletePosition < data.length) {
			char[] temp = new char[data.length - 1];
			/* A new object will be created here which holds array of character. */
			System.arraycopy(data, 0, temp, 0, deletePosition); // here deletePosition refers to number 3
																// which means for this method that we want
																// to copy 3 elements in the dest array
																// not till 3rd index.
			System.arraycopy(data, deletePosition + 1, temp, deletePosition, data.length - deletePosition - 1);

			/*
			 * by last 2 statements we have coppied all elements in temp's object of array
			 * 
			 * 
			 * except the element which we intend to delete
			 */

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
		Scanner index = new Scanner(System.in);

		System.out.println("Enter the index which you want to delete.");
		int indexPosition = index.nextInt();
		data = ResizingArray.deleteAndResizeArray(data, indexPosition);

		/*
		 * after calling deleteAndResize method the object 'a', 'k', 'a', 's', 'h' }
		 * will loose all the references outside heap and count variable for number of
		 * refernces becomes 0. seeing this garbage collector will mark it to delete or
		 * deletes
		 * 
		 * 
		 * so only the new object which was created in context of assigning temp will be
		 * threre to which now data also refers
		 */

		/*
		 * SEE THE PICTURE ATTATCHED TO IT OR NOTES TO KNOW HOW HOW HEAPS HELPS IN
		 * CREATING THIS ILLUSION.
		 */
        System.out.println("Here is the new character array.");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);

		}

	}

}
