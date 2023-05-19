package Static5;

public class static_variable {

	// static variable
	static int var1=10;
	static String var2="Amit";
	
	//instance variable
	int var3=20;
	String var4="Ganjare";
	
	//1st static Method
	static void StaticMethod1() {
	
		System.out.println("1st Static variable: "+var1); 
	}
	//2nd Static Method
	static void StaticMethod2() {
		
		System.out.println("2nd Static variable: "+var2); 
	}
	
	//1st Instance Method
	void InstanceMethod1() {
		
		System.out.println("1st Instance variable: "+var3);
	}
	//2nd Instance Method
	void InstanceMethod2() {
			
		System.out.println("2nd Instance variable: "+var4);
	}
	
	public static void main(String[] args) {
	
		static_variable.StaticMethod1();
		static_variable.StaticMethod2();
		
		static_variable obj = new static_variable();
		obj.InstanceMethod1();
		obj.InstanceMethod2();
	}

}
