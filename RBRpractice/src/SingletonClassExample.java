
public class SingletonClassExample {
       private static SingletonClassExample instance;
       private SingletonClassExample()
       {
    	   
       }
       static
       {
    	   instance = new SingletonClassExample();
    	   System.out.println("instance for the class has been created.");
       }
       public static SingletonClassExample getInstance()
       {
    	   return instance;
       }

}
/*class A extends SingletonClassExample///Error is because A's constructor can't access its super class constructor
{
	public static void main(String[] args) {
		//SingletonClassExample obj = new SingletonClassExample();// cant access the private constructor.
		SingletonClassExample.getInstance();
	}
}*/

///Method 2 to write a singleton class
class SingletonClassExample2
{
    private static SingletonClassExample2 instance;
    private SingletonClassExample2()
    {
    	
    }
    public static SingletonClassExample2 getInstance()
    {
    	if(instance == null)
    		{
    		   instance=new SingletonClassExample2();
    		   return instance;
    		}
    	else
    		return instance;
    }
}
