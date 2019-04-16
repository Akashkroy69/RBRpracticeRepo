package oopsQuestion2;

//A student has a class status         
//(freshman, sophomore, junior, or senior)
public class Student extends Person {
	private int status;
	private static final int FRESHMAN = 1;
	private static final int SOPHOMORE = 2;
	private static final int JUNIOR = 3;
	private static final int SENIOR = 4;

	public Student() {
		this("unknown", "unknown", null, "unknown", 0);
	}

	public Student(String name, String address, String phoneNumber, String email, int status) {
		super(name, address, phoneNumber, email);
		this.status = status;

	}

	public String getStatus() {
		switch (status) {
		case 1:
			return "Freshman";

		case 2:
			return "Sophomore";
		case 3:
			return "Junior";
		case 4:
			return "Senior";

		default:
			return "Unknown";
		// break;
		}
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return super.toString() + "Student [status=" + status + "]";
	}

}
