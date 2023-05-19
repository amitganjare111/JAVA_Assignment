package This_Super11;

// Call constructor of the parent class using super()

class Animal{  
     Animal(){
    	 System.out.println("animal is created");
     }  
}  
class Dog extends Animal{  
      Dog(){  
      super();  
      System.out.println("dog is created");  
    }  
}  
public class This_Super5 {
     public static void main(String args[]){  
         Dog d=new Dog();  
  }
}  


	