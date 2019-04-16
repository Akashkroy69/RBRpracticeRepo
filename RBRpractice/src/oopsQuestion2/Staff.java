package oopsQuestion2;

//A staff member has a title
public class Staff extends Employee {
	private String title;

	public Staff() {
		this("Unknown", "Unknown", "Unknown", null, "Unknown", 0, 0);
	}

	public Staff(String title, String name, String address, String phoneNumber, String email, double salary, int office) {
		super(name, address, phoneNumber, email, salary, office);
		this.title = title;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " title is : " + title;
	}

}
