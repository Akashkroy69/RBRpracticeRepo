package oopsQuestion2;

//A faculty    
//member has office hours and a rank
public class Faculty extends Employee {

	private float officeHours;
	private int rank;

	public Faculty() {
		this("unknown", "unknown", null, "unknown", 0, 0, 0, 0);
	}

	public Faculty(String name, String address, String phoneNumber, String email, double salary, int office,
			float officeHours, int rank) {
		super(name, address, phoneNumber, email, salary, office);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public float getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(float officeHours) {
		this.officeHours = officeHours;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return super.toString() + "Faculty [officeHours=" + officeHours + ", rank=" + rank + "]";
	}

}
