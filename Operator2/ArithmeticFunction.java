package Operator2;

// Write a function for arithmetic operators(+,-,*,/)

public class ArithmeticFunction {
  
	static void operator()
	{
		int a=10,b=20;
		int addition = a+b;
		int Subtraction = b-a;
		float multiplication = a*b;
		float division = b/a;
		
		System.out.print(addition+" "+Subtraction+" "+multiplication+" "+division);
	}
	public static void main(String[] args) {
		
		 ArithmeticFunction.operator();

	}

}
