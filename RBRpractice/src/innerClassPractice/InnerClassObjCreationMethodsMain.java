package innerClassPractice;

public class InnerClassObjCreationMethodsMain {
	
	
	
	
	public static void main(String[] args) {
		InnerClassObjCreationMethods objectOuterClass = new InnerClassObjCreationMethods();

		//Method 1: to create obj of inner class.
		
		System.out.println("Method 1: to create obj of inner class. by: "
				+ "inside a method of the outer class \n"
				+ " <Inner class name > <object name> = <new> <Inner class name>();\n\nWhen outer class object access this method"
				+ "\nthen object for inner class will be created.\n\n\n");
		objectOuterClass.makeInnerObject();
		// METHOD 2: TO CREATE object of inner class.
		
		
		System.out.println("\n\n\nMETHOD 2: TO CREATE object of inner class by '<outer class name>.<Inner class name> obj = \n" + 
				"<objectOuterClass>.<new> <InnerClass name>();'\n\n\n");
		InnerClassObjCreationMethods.InnerClass_firstInnerClass objOneInnerClass = 
				                       objectOuterClass.new InnerClass_firstInnerClass();
		
		objOneInnerClass.accessOuterClassFields();
		
		
		System.out.println("\n\n\nMETHOD 3: TO CREATE object of inner class by '<outer class name>.<Inner class name> obj = \n" + 
		"<new> <Outerclass name()>.<new> <InnerClass name>();'\n\n\n");
		
		//METHOD 3: TO CREATE object of inner class
		InnerClassObjCreationMethods.InnerClass_firstInnerClass objTwoInnerClass=new InnerClassObjCreationMethods().new InnerClass_firstInnerClass();
	    objTwoInnerClass.accessOuterClassFields();
	}
	
	

}
