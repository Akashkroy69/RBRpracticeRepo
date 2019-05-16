package exceptionPractice;

public class Student {
	private int age;
	public void setAge(int age)
	{
		if(age<0)
		{
			try {
				throw new AgeInvalidException("Age is invalid");
			} catch (AgeInvalidException e) {
				// TODO Auto-generated catch block
				System.out.println(e.toString()+"\n-------------------------------\n"
						+ "From here printstacktrace method of Exception class will print the detail about "
						+ " exception.\n");
				e.printStackTrace();
				
			}
		}
		this.age=age;
		System.out.println("Age of the student is : "+age);
		
	}

}
