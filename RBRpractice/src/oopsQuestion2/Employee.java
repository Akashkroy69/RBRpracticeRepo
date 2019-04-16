package oopsQuestion2;
/*
 * 
 * 
 * 
 * 
 * 
 * 
 * Q2. (The Person, Student, Employee, Faculty, and Staff classes) 
Design a class named Person and its two subclasses named Student and Employee.          
Make Faculty and Staff subclasses of Employee. A person has a name,            
address, phone number, and email address. A student has a class status         
(freshman, sophomore, junior, or senior). Define the status as a constant. An  
employee has an office, salary, and date hired. Use the MyDate class defined   
in Programming Exercise 10.14 to create an object for date hired. A faculty    
member has office hours and a rank. A staff member has a title. Override the   
toString method in each class to display the class name and the person’s name

*
*
*
*
*/


public class Employee extends Person {

	private int office;
	private double salary;
	private MyDate dateHired;

	public Employee() {
		this("unknown", "unknown", null, "unknown", 00, 0);
	}

	public Employee(String name, String address, String phoneNumber, String email, double salary, int office) {
		super(name, address, phoneNumber, email);
		this.office = office;
		this.salary = salary;
		dateHired = new MyDate();
	}

	public int getOffice() {
		return office;
	}

	public void setOffice(int office) {
		this.office = office;
	}

	public double getSalary() { //// String.format("%.2f",salary) could be used if return type would have been
								//// String
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDateHired() {
		return dateHired.getDay() + "/" + dateHired.getMonth() + "/" + dateHired.getYear();
	}

	public void setDateHired(MyDate dateHired) {
		this.dateHired = new MyDate();
	}

	@Override
	public String toString() {
		return super.toString() + "[office=" + office + ", salary=" + salary + ", dateHired=" + dateHired + "]";
	}

}



