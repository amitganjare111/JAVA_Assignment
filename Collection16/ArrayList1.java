package Collection16;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		//1.Add an element to the ArrayList
		  list.add("Amit");
		  list.add("Amol");
		  list.add("Samir");
		  list.add("Rohit");
		  list.add("Nihal");
		  list.add("Prajwal");
		  list.add("Harshal");
		  list.add("Akash");
		  list.add("Sopan");
		  list.add("Amar");
		                                                                 
		  System.out.println("----------------Que.2---------------------");
	   //2.Iterate through the ArrayList by using Iterator object

		  Iterator itr=list.iterator();
		  while(itr.hasNext()) {
		  System.out.println(itr.next()+" ");
	      }
		  System.out.println("-----------------Que.3--------------------");
		  
	  //3.Add an element at a specific index
		  list.add(2,"Vaibhav");
		  System.out.println(list);
		  System.out.println("-----------------Que.4--------------------");
		  
	  //4.Remove an element from the ArrayList, Remove at an index
		  list.remove("Rohit");
		  list.remove(2);
		  System.out.println(list);
		  System.out.println("----------------Que.5---------------------");
		  
	  //5.Update the element at a specific index
		  list.set(3,"AAAA");
		  for(String newlist:list) {
			  System.out.print(newlist+" ");
		  }
		  System.out.println();
		  System.out.println("----------------Que.6---------------------");
		  
	  //6.Check the element is present at a particular index
		 boolean Result = list.contains("AAAA");
		  System.out.println("is Element Present in ArrayList : "+Result);
		  System.out.println("----------------Que.7---------------------");
		  
	  //7.Get an element at a particular index
		  String element = list.get(2);
		  System.out.println("Get an element at a particular index : "+element);
		  System.out.println("----------------Que.8---------------------");
		
	  //8.Find out the size of the ArrayList
		  int size = list.size();
		  System.out.println(size);
		  System.out.println("----------------Que.9---------------------");
		  
	  //9.Check the given element is present in the ArrayList
		  boolean Result2 = list.contains("Sopan");
		  System.out.println("is Element Present in ArrayList : "+Result2);
		  System.out.println("----------------Que.10---------------------");
		  
	 //10.Remove all elements of the ArrayList
		  list.clear();
		  System.out.print(list);
		  
		  list.removeAll(list);
		  System.out.print(list);
	}
}
