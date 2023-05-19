package Method_Overloading13;

/* Write two methods with the same name but different number of parameters of same type 
   and call the methods from main method */

public class Overloading1 {

	void Method1(int a,int b)
	{
		System.out.println("Method 1 parameter : "+a+" "+b);
	}
	
	void Method1(int first, int second, int third )
	{
		System.out.println("Method 2 parameter : "+first+" "+second+" "+third);
	}
	
	public static void main(String[] args) {
		
		Overloading1 obj = new Overloading1();
		obj.Method1(11, 33);
		obj.Method1(22, 25, 29);
	}

}
