package Interface10;

/*Create an interface with only one method and implement it in a class. Call the method 
  implemented.*/
public class CreateAndInterface2 {

	interface Car {

		int code=1234;//public static final  final means constant 
		void speed();  // public and abstract
		void registration();
    }
	public static class BMW implements Car
	{
	  //public is mandatory when overriding interface  methods 
		public void speed() {
			System.out.println("speed method of car interface ");
		}
		public	 void registration() {
			System.out.println("registration  method of car interface ");
		}
		
		public static void main(String args[])
		{
			BMW b= new BMW();
			b.speed();
			b.registration();
		
		}
	}
}