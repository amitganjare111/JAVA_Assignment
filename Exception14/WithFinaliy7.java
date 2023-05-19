package Exception14;

public class WithFinaliy7 {

	 public static void main(String[] args)
	    {
	        try {
	            System.out.println("inside try block");
	            
	            // Not throw any exception
	            System.out.println(34 / 2);
	        }
	        
	        // Not execute in this case
	        catch (ArithmeticException e) {
	            
	            System.out.println("Arithmetic Exception");
	            
	        }
	        // Always execute
	        finally {
	            
	            System.out.println("finally block execute always.");
	            
	        }
	    }
	}

