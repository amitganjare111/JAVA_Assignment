package JAVA_Basics1;

public  class LocalGlobal {
	static int a=100; // a is Global variable
	
	static void method()
	{
		int b = 200; // b is a local variable  
		 System.out.println("local variable: "+b);
	}
	public static void main(String[] args) {
		
        System.out.println("Global variable: "+a);
        LocalGlobal.method();
	}

}
