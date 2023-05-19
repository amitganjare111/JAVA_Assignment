package Loops3;

import java.util.Scanner;

public class Palindrome {

			public static void main(String[] arg)
			{
				System.out.println("enter number");
			 	Scanner sc=new Scanner(System.in);
			 	int OriginalNumber=sc.nextInt();
			int lastNumber;
			int ReverseNumber=0;

			while(OriginalNumber>0)
			{
				lastNumber=OriginalNumber%10;// it gives last last digit.
				ReverseNumber=ReverseNumber*10+lastNumber;//it add last digit into first position
				OriginalNumber=OriginalNumber/10; // it remove last digit 
			}
			System.out.println(ReverseNumber+" is a palindrome number");
			
			
		}
	}


