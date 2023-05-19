package Static5;

public class InstanceVar_IN_StaticMethod {

	int var1=20;
	String var2="Ganjare";
	
    static void StaticMethod() {
		
       InstanceVar_IN_StaticMethod obj = new InstanceVar_IN_StaticMethod();
	   System.out.println("Instance variable from static method: "+obj.var1+" "+obj.var2); 
	}
	
	public static void main(String[] args) {
		
		InstanceVar_IN_StaticMethod.StaticMethod();

	}

}
