package String6;

public class Extract_String_Using_SubString {

	public static void main(String[] args) {
		
		String Str = "welcome to Jala Academy";
		System.out.println("Original String : "+Str);
		
		System.out.println("-------------------------");
		
	    String SubStr= Str.substring(3,15);    
	    System.out.println("Extract from String Using SubString : "+SubStr);
	}

}
