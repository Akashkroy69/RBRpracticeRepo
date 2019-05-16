package collectionPractice;


//outer class
public class OverridingEqualsOfObjectForOurClass {

	// Inner Class
	class Student {
		String name, id;

		Student(String nameString, String idString) {
			this.name = nameString;
			this.id = idString;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Student) {
				// here the equals() is overridden method from String class.
				return this.name.equals(((Student) obj).name) && this.id.equals(((Student) obj).id);
			}
			return false;
		}

	}

	public static void main(String[] args) {
		OverridingEqualsOfObjectForOurClass.Student studentObjOne = new OverridingEqualsOfObjectForOurClass().new Student(
				"akash", "1031220177");
		OverridingEqualsOfObjectForOurClass.Student studentObjTwo = new OverridingEqualsOfObjectForOurClass().new Student(
				"akash", "1031220177");
		System.out.println(studentObjOne.equals(studentObjTwo));

	}
}
