package Method_Overloading13;

/*4. Write two methods with the same name and same number of parameters of different 
     type and call from main method*/

public class Overloading4 {


	void Method1(int a,int b)
	{
		System.out.println("Method 1 parameter : "+a+" "+b);
	}
	
	void Method1(int a, String str)
	{
		System.out.println("Method 2 parameter : "+a+" "+str);
	}
	
	public static void main(String[] args) {
		
		Overloading4 obj = new Overloading4();
		obj.Method1(11, 33);
		obj.Method1(22, "Jala Academy");
	}
}
