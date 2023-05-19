package String6;

public class equalsIgnore_startWith_endWith_compareTo {

	public static void main(String[] args) {
		
		 String str = "This is a test string";
		  String str1 = "This";
		  
		  //equalsIgnoreCase
		  System.out.println(str1.equalsIgnoreCase("This"));
		  System.out.println("----------------------------");
		  
		  //startsWith
		  System.out.println(str.startsWith("This"));
		  System.out.println(str.startsWith("test", 10));
		  System.out.println(str.startsWith("This"));
		  System.out.println("----------------------------");
		  
		  //endsWith
		  System.out.println(str.endsWith("test"));
		  System.out.println(str.endsWith("test string"));
		  System.out.println(str.endsWith("string")); 
		  System.out.println("----------------------------");
		  
		  //compareTo
		  System.out.println(str.compareTo(str1));
		  if(str.compareTo(str1) == 0)
		    {
		      System.out.println("str1 is equal to str2");
		    }
		  else
		    {
		      System.out.println("str1 is not equal to str2");
		    }
	}

}
