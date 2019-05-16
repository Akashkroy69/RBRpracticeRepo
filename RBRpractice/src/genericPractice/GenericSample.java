package genericPractice;

import java.util.ArrayList;

public class GenericSample {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();// here No generic is being used.
		
		list.add("akash");
		list.add(100);// here autoboxing into Integer object is done as ArrayList is A type of 
		              // Collection class which holds object in which objects can be collected.
		
		for (Object object : list) {
			String string=(String)object;// this line is going to give runtime error when it faces Integer Object
			System.out.println(string);
		}
	}

}
