package Exception14;

import java.util.Scanner;

public class GenIOException {

	 public static void main(String[] argv)
		        throws Exception
		    {
		  
		        String s = "Good Day";
		  
		        Scanner scanner = new Scanner(s);
		  
		        System.out.println("" + scanner.nextLine());
		 
		        System.out.println("" + scanner.ioException());
		  
		    }
}
