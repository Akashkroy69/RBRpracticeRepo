package collectionPractice;

public class StringObjectValuesSameOrNot {
	String string;

	public StringObjectValuesSameOrNot(String string) {

		this.string = string;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == (StringObjectValuesSameOrNot) obj) {// == operator sees whether both the object ref are referring
														// tosame object or
			// not
			return true;
		}
		if (obj instanceof StringObjectValuesSameOrNot) {
			// Here we first need to typecast obj to StringObjectValuesSameOrNot type as
			// earlier it is being recieved
			// as Object 's object.
			// then we need to access string object of the class instance to assign into
			// another String obj ref.
			String string2 = ((StringObjectValuesSameOrNot) obj).string;
			int length = this.string.length();
			if (length == string2.length()) {

				char[] var1 = string.toCharArray();
				char[] var2 = string2.toCharArray();

				for (int i = 0; length-- != 0; i++) {
					if (var1[i] != var2[i]) {
						return false;
					}
				}
				return true;

			}
			return false;
		}
		return false;
	}

	public static void main(String[] args) {
		StringObjectValuesSameOrNot obj1 = new StringObjectValuesSameOrNot("akash");
		StringObjectValuesSameOrNot obj2 = new StringObjectValuesSameOrNot("akash");
		System.out.println(obj1.equals(obj2));

	}

}
