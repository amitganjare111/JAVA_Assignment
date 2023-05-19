package AccessModifier8;

public class Default {

	int a=10;
	String b="Amit";
	
	void defaultMethod() {
		String c="ganjare";
		System.out.println(c);
	}
	
	class second {
		void secondM() {
		
		System.out.print(b);
		}
	}
	public static void main(String[] args) {
		
		Default obj = new Default(); 
                obj.defaultMethod();
                
          //second obj1 = new second();
           //      obj1.secondM();
	}

}
