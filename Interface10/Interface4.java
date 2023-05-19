package Interface10;

//Create two interfaces with one method each. Implement these two interfaces in one 
//class.
public class Interface4 {

	interface first{
		void m1();
	}
	
	interface second{
		void m2();
	}
	
	public static class show implements first, second{
		public void m1() {
			System.out.println("method from first interface");
		}
		
		public void m2() {
			System.out.print("method from second interface");
		}
	}
	public static void main(String[] args) {
		
		show obj = new show();
		  obj.m1();
		  obj.m2();

	}

}
