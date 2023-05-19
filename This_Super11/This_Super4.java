package This_Super11;

//Call argument constructor of current class using this()

class constructor{  
    constructor(){
    	this(10);
     System.out.println("first constructor");
    }  
    constructor(int x){  
      
     System.out.println(x);  
  }  
}  
public class This_Super4 {
	public static void main(String[] args) {
		constructor obj = new constructor();

	}

}
