
package Operator2;

import java.util.Scanner;

public class LogicalAndOrNot {

	Scanner sc = new Scanner(System.in);
	
	int marks = sc.nextInt();
	 void AND()
	{
		if(marks>80 && marks<=100)// it run when both condition are true
		{
			System.out.println("AND");
		}
	}
	 
	 void OR()
		{
			if(marks>60 || marks<80)// it run when one condition is true 
			{
				System.out.println("OR");
			}
		}
	 
	 void NOT()
		{
			if (!(marks>50))// if condition true then return true 
			{
				System.out.println("NOT");
			}
		}
	public static void main(String[] args) {
		
		LogicalAndOrNot obj = new LogicalAndOrNot();
		       obj.AND();
		       obj.OR();
		       obj.NOT();
	}
}
