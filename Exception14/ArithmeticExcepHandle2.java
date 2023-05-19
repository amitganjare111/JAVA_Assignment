package Exception14;

public class ArithmeticExcepHandle2 {

	public static void main(String[] args) {
	int a=10;
	int b=0;
	int div = 0;
	try {
	 div = a/b;
	}
	catch(ArithmeticException e) {
		System.out.print(e);
	}
	System.out.print(div);
	
	}}

