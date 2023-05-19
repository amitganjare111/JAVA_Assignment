package Constructor12;

/*Call the constructors(both default and argument constructors) of super 
  class from a child class */
 class Constructor {

	 Constructor(){
		 System.out.println("no argument");
	 }
	 Constructor(int a, int b){	
	        super();
			System.out.println("two argument");
	 }
 }
	 class child extends Constructor4{
		Constructor4 obj1 = new Constructor4(12,22);
	 }
 
 public class Constructor2 {
	public static void main(String[] args) {
		
		child obj2 = new child();
	}

}
