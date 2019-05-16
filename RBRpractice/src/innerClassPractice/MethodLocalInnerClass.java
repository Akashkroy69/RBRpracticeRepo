package innerClassPractice;

public class MethodLocalInnerClass {
	private int i=10;
	
	public void doThigs()
	{
		int j=20;
		final int k=30;
		class Inner{
			public void accessOuter()
			{
				System.out.println("Accessing outer class private variable: "+i);
				System.out.println("Acceessing local variable j of the method where the inner class has been defined: "+j);
				System.out.println("Accessing local final variable k of the method where the inner class has been defined: "+k);
			}
		}
		Inner objInner=new Inner();//Method local inner classes can be instantiated only from inside the method where it has been defined.
		
		objInner.accessOuter();
	}

	
	public static void main(String[] args) {
		MethodLocalInnerClass objMethodLocalInnerClass=new MethodLocalInnerClass();
		objMethodLocalInnerClass.doThigs();
	}
}
