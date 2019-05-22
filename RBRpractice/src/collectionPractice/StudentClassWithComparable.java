package collectionPractice;

/*
 * in SortingObjectInCollection class list contains String class object so merge sort uses CompareTo() of String 
 * class to sort the object on parameter string.
 * 
 * But in other user classes we need to provide a method and parameter which can be used by 
 * merge sort to sort
 * 
 *  for that we have two ways 
 *  1. implementing Comparable interface in the user class
 *  2. to make a different class which implements Comparator interface.
 *  
 * 
 * */
public class StudentClassWithComparable<String> implements Comparable<String> {

	public String name;
	public String id;
	int a=10;
	
	public StudentClassWithComparable(String name,String idString) {
	this.id=idString;
	this.name=name;
	
	
	}
	public int compareTo(StudentClassWithComparable<String> o) {
		
		return 0;
	}
	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
