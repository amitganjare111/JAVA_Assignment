package Constructor12;

//Write constructors with return type int and String

public class Constructor4 {

	 int Constructor4(int a) {
		System.out.print(a);
		return a;
	 }
	 String Constructor4(String str) {
		 System.out.print(str);
		return str;
	 }
		public static void main(String[] arg) {
			//Can a constructor return a string?
		/*No, constructor does not have any return type in Java. 
		  Constructor looks like method but it is not. It does not
		   have a return type and its name is same as the class name. */
	 }
}
