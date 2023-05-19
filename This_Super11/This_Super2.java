package This_Super11;

  class first{
	int rollno=11;  
	String name="Rahul";  
	float fee=52;  
}
class second extends first{
	int rollno=22;  
	String name="Amit";  
	float fee=62;
	
   void show() {
	   System.out.println(rollno+" "+name+" "+fee);
	   System.out.print(super.rollno+" "+super.name+" "+super.fee);
   }
}
public class This_Super2 {

	public static void main(String[] args) {
		second obj = new second();
	           obj.show();
	}

}
