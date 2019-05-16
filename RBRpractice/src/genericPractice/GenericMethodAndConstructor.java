package genericPractice;

public class GenericMethodAndConstructor {
	// defining generic in constructor
	public <E> GenericMethodAndConstructor(E e)// <E> is being defined as generic locally.
	{
		System.out.println("Here is e : " + e);
	}

	// defining generic in methods
	public <T> void GenericMethod(T t) {
		System.out.println("Here is t: " + t);
	}

	public static void main(String[] args) {
		GenericMethodAndConstructor object = new GenericMethodAndConstructor("akash is a good boy");
		object.GenericMethod(100);
	}

}
