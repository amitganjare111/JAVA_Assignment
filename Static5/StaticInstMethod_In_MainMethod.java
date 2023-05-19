package Static5;

// 6.Print all the static, instance variables in main method

public class StaticInstMethod_In_MainMethod {

	// static variable
		static int var1=10;
		static String var2="Amit";
		
		//instance variable
		int var3=20;
		String var4="Ganjare";
		
	public static void main(String[] args) {
	
		// for static Method
		System.out.println("Static Variable Content: ");
		System.out.println(StaticInstMethod_In_MainMethod.var1+" "+var2);
		
		System.out.println("----------------------------------");
		
		//for Instance Method
		System.out.println("Instance Variable Content: ");
		StaticInstMethod_In_MainMethod obj = new StaticInstMethod_In_MainMethod();
		System.out.print(obj.var3+" "+obj.var4);	
	}

}
