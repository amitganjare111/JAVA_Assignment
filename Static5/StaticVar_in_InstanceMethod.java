package Static5;

// 3. Print static variables in Instance methods
public class StaticVar_in_InstanceMethod {

	static int var1=10;
	static String var2="Amit";
	
    void InstanceMethod() {
		
		System.out.println("1st Instance variable: "+var1+ "\n"+"2nd Instance variable: "+var2);
	}
	public static void main(String[] args) {
		
    StaticVar_in_InstanceMethod obj = new  StaticVar_in_InstanceMethod();	

    obj. InstanceMethod();
	}

}
