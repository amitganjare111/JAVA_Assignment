package Exception14;

public class GenerateArithmeticExcep8 {

public static void main(String[] args) {
		
		try{
		int firstNum = 25;
		int secondNum = 20%2;
		
		int div = firstNum/secondNum;
		System.out.println("Result : "+ div);
		}catch(ArithmeticException ae){
			System.out.println("Arithmetic Exception occurred in code");
		}
		
		System.out.println("After division");
	}
		
}
