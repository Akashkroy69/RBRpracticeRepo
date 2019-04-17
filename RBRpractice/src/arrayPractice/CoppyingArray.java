package arrayPractice;

import java.util.Arrays;;

public class CoppyingArray {
	int[] arrA={1,2,3};
	int[] arrB;
	public CoppyingArray() {
		
		
	}
	public void methodOne()
	{
		System.out.println("Implementing with the help of assigning object reference of "
				+ " arrA into arrB. But this is not called Coppying But works fine");
		arrB=arrA;
		
		for (int i = 0; i < arrB.length; i++) {
			System.out.println(arrB[i]);
		}
	}
	public void methodTwo()
	{
		System.out.println("coppying with the help of for loop");
		arrB=new int[arrA.length];
		for (int i = 0; i < arrA.length; i++) {
			arrB[i]=arrA[i];
		}
		
		for (int i = 0; i < arrB.length; i++) {
			System.out.println(arrB[i]);
		}
	}
	public void methodThree()
	{
		System.out.println("Coppying with the help of Array class's copyOf() method.");
		arrB=Arrays.copyOf(arrA, arrA.length);
		

		for (int i = 0; i < arrB.length; i++) {
			System.out.println(arrB[i]);
		}
	}
	public void methodFour()
	{
		System.out.println("Coppying with arraycopy method of System class.");
		System.arraycopy(arrA, 0, arrB, 0, arrA.length);

		for (int i = 0; i < arrB.length; i++) {
			System.out.println(arrB[i]);
		}
	}
	public void methodFive()
	{
		System.out.println("Coppying with the help of clone method of Object class of java.");
		arrB=(int[])arrA.clone();

		for (int i = 0; i < arrB.length; i++) {
			System.out.println(arrB[i]);
		}
	}
	public static void main(String[] args) {
		CoppyingArray objectArray=new CoppyingArray();
		objectArray.methodOne();
		objectArray.methodTwo();
		objectArray.methodThree();
		objectArray.methodFour();
		
		objectArray.methodFive();
	}

}
