package Loops3;

import java.util.Scanner;

public class EvenOddUsingSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		switch(num%2) //this will return 0 and 1
		{
		case 0:
		    System.out.println(num+" is an Even number");
		    break;
		case 1:
		    System.out.println(num+" is an Odd number");
		}

	}

}
