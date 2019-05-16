package innerClassPractice;

public class InnerClassObjCreationMethods {
	private int i=10;
	//Inner class is being created.
	class InnerClass_firstInnerClass{
		public void accessOuterClassFields()
		{
			System.out.println("Here Inner class is accessing outer class variable i : "+i);
			//makeInnerObject();
			
			System.out.println("^ An inner clas can access all private to public fields of outr class.");
		}
		
		
	}
	//METHOD 1: To create obj for an innerclass by accessing a method from outer class object.
	public void makeInnerObject()
	{
		InnerClass_firstInnerClass objCreationInnerByMethod1=new InnerClass_firstInnerClass();
		objCreationInnerByMethod1.accessOuterClassFields();
	}

}
