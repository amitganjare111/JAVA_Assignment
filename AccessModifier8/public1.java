package AccessModifier8;

public class public1 {

	class public2{
	public int a=100;
	public String b="Amit";
	
	 void Pmethod()
	{
		System.out.println("value of public field is : "+a+" "+b);
	}
	}
	 class public3 {
		public2 obj = new public2();
		
		obj.Pmethod();
	}
	public static void main(String[] args) {
		
		
	}

}
