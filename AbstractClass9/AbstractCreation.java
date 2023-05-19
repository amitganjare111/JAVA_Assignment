package AbstractClass9;

 abstract class TestAbstraction2{  
	   abstract void run();  
	   void fast()
	   {
		   System.out.println("gear changed");
	   }  
	 }  
	 
	 class Abstract2 extends  TestAbstraction2 {  
	 void run()
	 {
		 System.out.println("running safely..");
		 }  
	 }  
	

	class AbstractCreation {
	 public static void main(String args[]){  
		 TestAbstraction2 obj = new  Abstract2();  
	  obj.run();  
	  obj.fast();  

	}

}
