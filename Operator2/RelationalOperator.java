package Operator2;

public class RelationalOperator {
    int a=80, b=70;
	 void Relational()
	 {
		 if (a>b)
		 {
			 System.out.println("A is greater than B");
		 }
		 
		 if (a<b)
		 {
			 System.out.println("B is greater than A");
		 }
		 
		 if (a>=b)
		 {
			 System.out.println("A is greater than or Equal to B");
		 }
		 
		 if (a<=b)
		 {
			 System.out.println("A is less than or equal to B");
		 }
	 }
	public static void main(String[] args) {
		
		RelationalOperator obj =new RelationalOperator();
		
		obj.Relational();
	}

}
