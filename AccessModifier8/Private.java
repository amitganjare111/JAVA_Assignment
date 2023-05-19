package AccessModifier8;

public class Private {

	private String name="Amit";
        
	  private void display() {
	    System.out.println("The name is " + name);
	  }
	  
	  class subClass extends Private {
		  
		  void SubClassMethod() {
		  System.out.println("Accessing Private class field in SubClass : "+name);
	  }
	  }
	public static void main(String[] args) {
		
		Private obj =new Private();
		// private method calling
		   obj.display();
		   // calling private field 
		   System.out.println(obj.name);
		   
		  // subClass obj1 = new subClass();
		  // obj1.SubClassMethod();
	}

}
