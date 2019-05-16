package innerClassPractice;

public class StaticInnerClassOuter {
	static class Inner
	{
		public void print()
		{
			System.out.println("Printing.");
		}
	}
	
	public static void main(String[] args) {
		//object of an Inner class is created directly like other normal classes without 
		//creating object for outer class.
		StaticInnerClassOuter.Inner innerObject=new StaticInnerClassOuter.Inner();
		innerObject.print();
	}

}
