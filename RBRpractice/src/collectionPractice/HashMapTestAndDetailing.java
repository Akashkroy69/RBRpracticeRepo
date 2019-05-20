package collectionPractice;


import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTestAndDetailing {
	public static void main(String[] args) {
		//here an object of hashmap is being created which contains a table which will contain references
		// to entry objects which will be created bt put method of hash map
		HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
		//here by put(), an object of inner class of hashmap is created which implements Entry Interface of map Interface
		//Entry object will have two fields of object references for <Integer,String> object instances here.
		//in put() on key object Integer's int value hascode() will be called which will give an index 
		//inside table 
		hashMap.put(20, "Akash");
		
		hashMap.put(new Integer(30), "Aman");
		
		hashMap.put(32, "Nishu");
		
		
		//HashMap/Map doesn't provide iterator so to iterate over the objects 
		//we need to use a collection class which provides iterator
		// for that we will use entrySet() of hashmap to create collection of type Set
		//entrySet() works on Map.Entry<k,V> objects i.e, creates a set of entry objects.
		Set<Entry<Integer, String>> set=hashMap.entrySet();
		
		//iterator object is going to work on Map.Entry<k,V>
		Iterator<Entry<Integer, String>> iterator=set.iterator();
		
		while(iterator.hasNext())
		{
			Map.Entry<Integer,String> mEntry=(Map.Entry<Integer, String>)iterator.next();
			System.out.println("Key is: "+mEntry.getKey()+" and the value is : "+mEntry.getValue());
		}
		//How to get a value by providing a key"
		//Ans: by calling E get(Object keyObject). 
		// This actually on keyObjects' int value will call hashcode() which gives the access to 
		// the index in which the key may be present 
		// then it will use the equals method provided by the wrapper class of keyobject to compare the key
		// if found the entry with the key then it accesses the value field and return the reference to it
		
		System.out.println("Here is the value in hash map for key 20. Accessing the value by providing "
				+ " the key: ");
		System.out.println(hashMap.get(new Integer(20)));
		
		
	}

}
