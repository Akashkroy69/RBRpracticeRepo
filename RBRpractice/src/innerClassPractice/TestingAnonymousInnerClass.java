package innerClassPractice;

public class TestingAnonymousInnerClass {
	public void doThings() {
		System.out.println("This is a method in asimple class.");
	}

	public static void main(String[] args) {
		TestingAnonymousInnerClass obj = new TestingAnonymousInnerClass() {
			// this anonymous Inner class. Technically it is a subclass of the class
			// TestingAnonymousClass
			@Override
			public void doThings() {

				super.doThings();
				System.out.println("This is overrided method in anonymous class.");
			}

			public void newMethod() {

			}
		};

		obj.doThings();
		// obj.newMethod();
		//^This wont work as obj is reference of parent class although at run time 
		//instance of child class is assigned with it but compiler can't figure it out so it throws 
		//compiler error.
	}

}
