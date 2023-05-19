package String6;

public class MatchingStringUsingMatchesMethod {

	public static void main(String[] args) {
		
		 String Str = new String("Welcome to Jala Academy");

	      System.out.print("Return Value :" );
	      System.out.println(Str.matches("(.*)Jala(.*)"));

	      System.out.print("Return Value :" );
	      System.out.println(Str.matches("Academy"));

	      System.out.print("Return Value :" );
	      System.out.println(Str.matches("Welcome(.*)"));
	   }

	}


