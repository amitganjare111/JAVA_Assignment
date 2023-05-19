package Interface10;
      
	interface Detail{
		String name;
		int regno;
		public void getDetails();
	}
   class Show implements Detail {
		 
		name ="Jala";
		regno = 12345;
	   public void getDetails()
		{
		 System.out.println("Name : "+name+" "+"RegNo : "+regno);
		}
	}
	public class Interface3 {
	public static void main(String[] args) {
		
		 Show obj = new Show();
		 obj.getDetails();
	}

}
}
