package genericPractice;

public class DefiningGenericToClass<E> {
	E e;

	public DefiningGenericToClass(E e) {
		this.e = e;
	}

	public void setE(E e) /*
							 * here if we define again public <E> void setE(E e) {} then this will be a
							 * separate generic than the generic which we have defined with class name. This
							 * won't give a syntax error but <E> will be a separate generic.
							 */
	{
		this.e = e;
	}

	public E getE() // here we can't use <E> as it will be a separate generic . we have to use E
	{
		return this.e;
	}

	public static void main(String[] args) {
		DefiningGenericToClass<String> obGeneric = new DefiningGenericToClass<String>("Akash");

		System.err.println(obGeneric.getE());

		// obGeneric.setE(100);
		// ^ this will give compile time error as we have decided generic type for the
		// object obGeneric

	}

}
