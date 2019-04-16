import java.lang.Enum;
enum ColorTest
{
	RED,
	BLUE,
	GREEN
};
public class EnumerationPractice {
	public static void main(String[] args)
	{
	   ColorTest arr[]=ColorTest.values(); //Array is being created in which constants of array type will be stored.
	   
	   for(ColorTest col:arr)
	   {
		   System.out.println(col + " is present at index " + col.ordinal());
	   }
	   System.out.println(ColorTest.valueOf("RED"));
	}

}
