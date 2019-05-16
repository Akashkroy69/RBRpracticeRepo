package genericPractice;

public class BoundedTypesInGenericForClass <E extends Number> {
	E e;
	void setE(E e)
	{
		this.e = e;
	}
	public E getE()
	{
		return e;
	}
	public static void main(String[] args) {
		BoundedTypesInGenericForClass<Integer> integerObj=new BoundedTypesInGenericForClass<Integer>();
		//^ this works as Integer extends Number.
		integerObj.setE(10);
		System.out.println(integerObj.getE());
		
		//BoundedTypesInGenericForClass<String> stringObj=new BoundedTypesInGenericForClass<String>();
        //^ this is giving cmpile time error as String doesn't extend Number.	
	
	}

}
