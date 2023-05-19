package Loops3;

import java.util.Scanner;

public class ArmstrongNumber {

		public static void main(String[] args) {

	        int originalNum, digit, cubeSum = 0,num;
	        
	        Scanner sc = new Scanner(System. in );
	        num = sc.nextInt();
	        originalNum = num;

	        while (num!= 0)
	        {
	            digit = num % 10;
	            cubeSum += Math.pow(digit, 3);
	            num /= 10;
	        }

	        if(cubeSum == originalNum)
	            System.out.println("1");
	        else
	            System.out.println("0");
	    }
	}

	
