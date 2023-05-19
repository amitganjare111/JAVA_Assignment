package Interface10;

import Interface10.Interface4.first;
import Interface10.Interface4.second;
import Interface10.Interface4.show;

//Create two interfaces with the same method (same signature) in both the interfaces. 
//Implement these two interfaces in one class. Call the method.	
		interface first{
			void m1();
		}
		
		interface second{
			void m1();
		}
		
		public static class show implements first, second{
			public void m1() {
				System.out.println("method from first interface");
			}
			
			public void m1() {
				System.out.print("method from second interface");
			}
		}
		public class Interface5 {
		public static void main(String[] args) {
			
			show obj = new show();
			  obj.m1();
			  obj.m1();

		}

	}

}
