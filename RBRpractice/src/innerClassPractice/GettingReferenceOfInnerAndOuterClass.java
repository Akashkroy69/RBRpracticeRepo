package innerClassPractice;

public class GettingReferenceOfInnerAndOuterClass {///This is outer class name.
	
	int i=10;
	class Inner
	{
		public void accessOuterFields()
		{
			System.out.println("This is the outer variable i: "+i);
			System.out.println("This is the reference of inner instance: "+this);
			System.out.println("This is the reference of outer class : "+GettingReferenceOfInnerAndOuterClass.this);
		}
	}
	public void makeInnerInstance()//Instance fields work on some object instance of class so
	//The following statement work on the instance which calls it.
	{
		Inner objInner=new Inner();
		objInner.accessOuterFields();
	}

	public static void main(String[] args) {//In static method first we need to have instance of class
		// Unlike non-static method it can't make instance variable of inner class.
		
		GettingReferenceOfInnerAndOuterClass.Inner objInner=new GettingReferenceOfInnerAndOuterClass().new Inner();
		objInner.accessOuterFields();
		
	}
}
