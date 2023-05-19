package Static5;

public class CallStatic_Inst_In_Main {

	// Static Method
	static void StaticMethod() {
		
		System.out.println("i am from static method");
	}
	
	// InstanceMethod
    void InstanceMethod() {
		
		System.out.print("i am from Instance method");
	}
    
	public static void main(String[] args) {
		
		// Calling Static Method
		CallStatic_Inst_In_Main.StaticMethod();
		
		// Object Creation
		CallStatic_Inst_In_Main obj = new CallStatic_Inst_In_Main();
		
		// Calling Instance Method
		obj.InstanceMethod();
		
	}

}
