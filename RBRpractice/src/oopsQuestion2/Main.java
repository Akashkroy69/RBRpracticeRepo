package oopsQuestion2;

public class Main {
	public static void main(String[] args) {
		Person aPerson=new Person("Akash", "Banglore", "9566089884", "Akash69600@gmail.com");
		Student aStudent=new Student("Aman", "Kamalpur", "7079107730", "Aman69600@gmail.com", 1);
		Employee aEmployee =new Employee("Abilash", "banglore", "90060791077", "abhi69600@gmail.com", 25000, 1);
		Staff aStaff=new Staff("cook", "Baldeo", "Banglore", "7904482530", "bala@gmail.com", 10000, 1);
		Faculty aFaculty=new Faculty("Ravi sir", "Hyderabad", "7070169083", "ravi@gmail.com", 100000, 2, 8, 1);
		System.out.println(aPerson.toString());
		System.out.println(aStudent.toString());
		System.out.println(aEmployee.toString());
		System.out.println(aStaff.toString());
		System.out.println(aFaculty.toString());

	}

}
