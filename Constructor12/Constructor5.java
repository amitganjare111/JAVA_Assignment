package Constructor12;

public class Constructor5 {

	 Constructor5(int i)
	    {
	        System.out.println(i);
	    }

	    public static void main(String args[])
	    {
	    	 Constructor5 b = new  Constructor5(0);
	        int x = 10;
	        while( x > 0)
	        {
	        	 b = new  Constructor5(x--);  
	        }
	    }
}