package Interface10;

//Create an interface with a default method and implement it in a class. Do not provide 
//implementation to the default method and call the method.

	interface main{
		  default void m1() {
		   System.out.print(" interface's default method");
		 }
	}

	class show1 implements main{
	      
	}
	public class Interface6
	{
	public static void main(String[] args) {
		
		show1 obj = new show1();
		  obj.m1();
	}

}
