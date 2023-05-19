package Static5;

public class Call_StaticMethod_In_InstanceMethod {

	static void StaticMethod() {
		
		System.out.println("Static Method");
	}
	
    public void InstanceMethod() {
		
    	Call_StaticMethod_In_InstanceMethod.StaticMethod();
	}
	
    public static void main(String[] args) {
		
	Call_InstMethod_In_StaticMethod obj = new Call_InstMethod_In_StaticMethod();
	     obj. InstanceMethod();   
	}

}

