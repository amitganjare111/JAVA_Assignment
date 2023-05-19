package Method_Overloading13;

/*Write two methods with the same name but different number of parameters of different 
  data type and call the methods from main method */

public class Overloading2 {


	void Method1(int a,int b)
	{
		System.out.println("Method 1 parameter : "+a+" "+b);
	}
	
	void Method1(int a, String str, int c)
	{
		System.out.println("Method 2 parameter : "+a+" "+str+" "+c);
	}
	
	public static void main(String[] args) {
		
		Overloading2 obj = new Overloading2();
		obj.Method1(11, 33);
		obj.Method1(22, "Jala Academy", 55);
	}
}
