package Collection16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap <Integer,String> list = new HashMap<Integer,String>();
	 //1.Insert key value into the map
		list.put(1,"Amit");
		list.put(2,"Amol");
		list.put(3,"Karan");
		list.put(4,"Rohit");
		list.put(5,"Ankit");
		list.put(6,"Ketan");

		
		list.put(7,"Avinash");
		list.put(8,"Sagar");
		list.put(9,"Ram");
		list.put(10,"Samar");
		
	 //2.Fetch value of a key
		for(Map.Entry L:list.entrySet()) {
			  System.out.println(L.getKey()+" "+L.getValue());
		  }
		
		System.out.println("__________________________________");
	 //3.1Create Clone of HashMap.
		HashMap<Integer,String> list2 = (HashMap<Integer,String>)list.clone();
		System.out.println("CloneMap : "+list2);
		
		System.out.println("__________________________________");
		
	 //3.2.Create clone of HashMap
		System.out.print("CloneMap2 :"+list.clone());
		
		System.out.println("__________________________________");
	 //3.3.Create copy of HashMap.
		HashMap<Integer,String> list3 = list;
		System.out.println("CopyMap : "+list3);
		
		System.out.println("__________________________________");
	 //4.check given key is in Map
		boolean check1 = list.containsKey(9);
		System.out.println(check1);

		System.out.println("__________________________________");
	 //5.check given value is in Map.
		boolean check2 = list.containsValue("Rohit");
		System.out.println(check2);
		
		System.out.println("__________________________________");
	 //6.Check if the map is empty
		
		boolean EmptyCheck = list2.isEmpty();
		System.out.println(EmptyCheck);
		
		System.out.println("__________________________________");
	 //7.Print the size of the Map to the console
		int checkSize = list2.size();
		System.out.println(checkSize);
		 
		System.out.println("__________________________________");
	 //8.Print all the Keys of the map to the console
		for(Map.Entry L1:list.entrySet()) {
			  System.out.println(L1.getKey());
		  } 
		System.out.println("__________________________________");
	 //9.Remove a specific Key-value pair
		list.remove(5,"Ankit");
		System.out.println(list);
	}

}
