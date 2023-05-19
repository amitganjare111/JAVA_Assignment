package Static5;

public class Call_InstMethod_In_StaticMethod {

	// Instance Method
	public void InstanceMethod() {
		
		System.out.println("Instance Method");
	}
	
	static void StaticMethod() {
		
	Call_InstMethod_In_StaticMethod obj =new Call_InstMethod_In_StaticMethod();
        obj.InstanceMethod();	
	}
	public static void main(String[] args) {
		
		Call_InstMethod_In_StaticMethod.StaticMethod();
	}

}
