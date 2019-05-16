package genericPractice;

import java.util.ArrayList;

public class GenericSample2 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("akash");
		//list.add(100);    <---- this line is giving compile time error because of generic
		//so that we become aware at copile time only
		
	}

}
