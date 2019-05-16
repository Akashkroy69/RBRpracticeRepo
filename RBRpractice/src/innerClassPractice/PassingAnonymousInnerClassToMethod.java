package innerClassPractice;

public class PassingAnonymousInnerClassToMethod {

	public void doStuff(Display displayObject)
	{
		System.out.println("Recieving Object of Display intrface which is being created by "
				+ "Anonymous Inner class.");
		displayObject.display();
	}
	
	public static void main(String[] args) {
		PassingAnonymousInnerClassToMethod objectAnonymousInnerClassToMethod=new PassingAnonymousInnerClassToMethod();
	//HERE WE ARE PASSING A ANONYMOUS INNER CLASS AND ITS OBJECT TO A METHOD
		//WITH THAT THIS IS THE ONLY PLACE WHERE A KIND OF OBJECT OF AN INTERFACE IS 
		// BEING CREATED.
	objectAnonymousInnerClassToMethod.doStuff(new Display() {
		
		@Override
		public void display() {
			System.out.println("displaying from overrided method of Display Interface.");
			
		}
	});
	}
}
