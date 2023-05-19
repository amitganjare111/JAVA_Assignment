package Inheritance7;


class A{
		
	void AM1(int a)
	{
		System.out.println("--------------Class 1 data------------------");
		
		System.out.println("class A method 1 values is : "+a);
	}
	
	void AM1(int a, int b)
	{
		System.out.println("class A method 2 values is : "+a+" "+b);
	}
	
	void overriding(int a,int b, int c)
	{
		System.out.println("class A method 3 values is : "+a+" "+b+" "+c);
		
	}
	
}

class B extends main1{
	
	void BM1(float a)
	{
		System.out.println("--------------Class 2 data------------------");
		
		System.out.println("class B method 1 values is : "+a);
	}
	
	void BM1(float a, float b)
	{
		System.out.println("class B method 2 values is : "+a+" "+b);
	}
	
	void overriding(int a,int b, int c)
	{
		System.out.println("class B overriding method values is : "+a+" "+b+" "+c);
	
	}
}
class C extends B{
	
	void CM1(String a)
	{
		System.out.println("--------------class 3 data------------------");
		
		System.out.println("class C method 1 values is : "+a);
	}
	
	void CM1(float a, int b)
	{
		System.out.println("class C method 2 values is : "+a+" "+b);
	}
	
	void overriding(int a,int b, int c)
	{
		System.out.println("class C overriding method values is : "+a+" "+b+" "+c);
	
		System.out.println("------------------------------------------------");
	}

	}
public class main1 {
	
	public static void main(String [] args) {
		
		A objA = new A();
		  objA.AM1(10);
		  objA.AM1(10,20);
		  objA.overriding(10,20,30);
		  
	    B objB = new B();
	      objB.BM1(12);
	      objB.BM1(15.0f,21.2f);
	      objB.overriding(25, 35, 45);
	      
	    C objC =new C();
	      objC.CM1("Amit");
	      objC.CM1(15.5f,22);
	      objC.overriding(55, 65, 75);

	}
}
	

