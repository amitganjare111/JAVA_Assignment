package Interface10;

public class CreateAndInterface1 {

	interface Car {

		int code=1234;//public static final  final means constant 
		void speed();  // public and abstract
    }
	public static class BMW implements Car
	{
	  //public is mandatory when overriding interface  methods 
		public void speed() {
			System.out.println("speed method of car interface ");
		}
		public	 void registration() {
			System.out.println("registration  method of car interface ");
		};
		
		public static void main(String args[])
		{
			BMW b= new BMW();
			b.speed();
		}
	}
}

