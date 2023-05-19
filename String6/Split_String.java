package String6;

public class Split_String {

	public static void main(String[] args) {
		
		String str = "This is an example";
        String[] splits = str.split("\\s");
        
        //This regEx splits the String on the WhiteSpaces 
        for(String splits2: splits) {
            System.out.println(splits2);
        }
 
    }

}
