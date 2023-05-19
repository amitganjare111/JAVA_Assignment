package This_Super11;

//Call constructor of the current class using this()

class Main{  
    Main(){
     System.out.println("first constructor");
    }  
     Main(int x){  
     this();  
     System.out.println(x);  
  }  
}  
 
public class This_Super3 {
   public static void main(String args[]){  
       Main a=new Main(10);  
	}
}
