package genericPractice;

public class DefiningGenericToInterfaceChild<T, E> implements DefiningGenericToInterfaceParent<E> {
	E e; // ^ child must have super set of generic with respect to interface.

	public void setE(E e) {

		this.e = e;
	};

	public E getE() {
		return e;
	}

	public static void main(String[] args) {
		DefiningGenericToInterfaceChild<Integer, String> obChild = new DefiningGenericToInterfaceChild<Integer, String>();
		obChild.setE("akash_");
		System.out.println(obChild.getE());
	}
}
