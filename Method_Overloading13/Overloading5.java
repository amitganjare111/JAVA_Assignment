package Method_Overloading13;

/*Write two methods with the same name, number of parameters and
  data type but different return Type*/
public class Overloading5 {
	
    int  Method1(int a, int b)
	{
    	System.out.println("Method 1 parameter : "+a+" "+b);
	}
	
	String Method1(int a, int b)
	{
		System.out.println("Method 1 parameter : "+a+" "+b);
	}
	
	public static void main(String[] args) {
		
		Overloading5 obj = new Overloading5();
		obj.Method1(11, 33);
		obj.Method1(22, 44);
		
	}
}
