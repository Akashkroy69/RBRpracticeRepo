/*

	class SuperClass {
	    protected void foo() {}
	}
	class Child extends SuperClass {
	    public void foo() {}// when no access modifier will be given it takes as scope of default modifier
	                        //which is less in power than protected which will give compilation error as child class doesn't allow the scope to be 
	                        // reduced
	    
	}
	
	public class TestInheritance {
	    public static void main(String args[]) {
	        Child1 child = new Child();
	        child.foo();
	    }
	}


*/
