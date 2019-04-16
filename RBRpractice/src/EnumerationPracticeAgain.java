enum UserStatus
{
	PENDING,
	ACTIVE,
	INACTIVE,
	DELETED
};
public class EnumerationPracticeAgain {

	public static void main(String[] args)
	{
		System.out.println(UserStatus.ACTIVE);  /// it always returns name of object's reference of constant for which object instance is created.
		for(UserStatus status : UserStatus.values()) ///Userstatus.values() creates array internally
		{
			System.out.println(status);
		}
		UserStatus status1 = UserStatus.PENDING;
		if(status1 != UserStatus.ACTIVE)
		{
			System.out.println("Not an active user!");
			
		}
	}

}
