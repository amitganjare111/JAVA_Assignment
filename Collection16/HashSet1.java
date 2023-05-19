package Collection16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet();
		//1.Add an element to the HashSet
		      set.add("Rohan");
			  set.add("Amit");
			  set.add("Amol");
			  set.add("Samir");
			  set.add("Rohit");
			  set.add("Nihal");
			  set.add("Prajwal");
			  set.add("Harshal");
			  set.add("Akash");
			  set.add("Sopan");
			  
	     //2.copy Another collection in Hash set
	   ArrayList<String> list = new ArrayList<String>();
			  list.add("AAAA");
			  list.add("BBBB");
			  list.add("CCCC");
			  list.add("DDDD");
			  list.add("EEEE");
	   HashSet<String> set2 = new HashSet(set);
	      Iterator<String> i = set2.iterator();
	      while(i.hasNext())
	      {
	    	  System.out.println(i.next());
	    	  
	      }

	}

}
