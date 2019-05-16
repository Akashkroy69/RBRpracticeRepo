package genericPractice;

public class BoundedGenericOnMethods {

	public <E extends Number> E setValue(E e) {
		return e;
	}

	public static void main(String[] args) {
		BoundedGenericOnMethods ob = new BoundedGenericOnMethods();

		System.out.println(ob.setValue(200));// Autoboxing is used to convert into integer Object and thus
		// generic is also defined as Integer which does extends Number

		System.out.println(ob.setValue(new Integer(100)));
		// ob.setValue(new String("Akash"));
		// ^ here it is trying to define generic as String which doesn't extend Number
		// so throws compile timme error
		
		
	}

}
