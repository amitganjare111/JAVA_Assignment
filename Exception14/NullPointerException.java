package Exception14;

public class NullPointerException {

	 public static void main (String[] args)
	    {
	        String ptr = null;
	
	        try
	        {
	            if (ptr.equals("gfg"))
	                System.out.print("Same");
	            else
	                System.out.print("Not Same");
	        }
	        catch(NullPointerException e)
	        {
	            System.out.print("NullPointerException Caught");
	        }
	    }
	}
