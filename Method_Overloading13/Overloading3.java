package Method_Overloading13;

/*Write two methods with the same name and same number of parameters of same type 
  and call from main method */
public class Overloading3 {


	void Method1(int a,int b)
	{
		System.out.println("Method 1 parameter : "+a+" "+b);
	}
	
	void Method1(int a, int b)
	{
		System.out.println("Method 2 parameter : "+a+" "+b);
	}
	
	public static void main(String[] args) {
		
		Overloading1 obj = new Overloading1();
		obj.Method1(11, 33);
		obj.Method1(22, 44);
	}
}
