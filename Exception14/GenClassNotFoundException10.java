package Exception14;

public class GenClassNotFoundException10 {

	// Write a program to generate ClassNotFoundException
	  public static void main(String args[])
	    {
	        try {
	 
	            Class.forName("Exception");
	        }
	 
	        catch (ClassNotFoundException ex) 
	        {
	            ex.printStackTrace();
	        }
	    }
}
