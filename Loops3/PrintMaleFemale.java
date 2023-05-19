package Loops3;

import java.util.Scanner;

// Print gender (Male/Female) program according to given M/F using switch
public class PrintMaleFemale {

	static char c;
	static void input()
	{
	Scanner s=new Scanner(System.in); 
	System.out.println("Enter m or f"); 
	 c=s.next().charAt(0); 
	}
	static void check()
	{
	       switch(c)
	        { 
			case 'm': 
				System.out.println("Gender is male"); 
				break; 
			case 'f': 
				System.out.println("Gender is female"); 
				break; 
			} 
	}
	
	public static void main(String[] args) {
	
		PrintMaleFemale.input();
		PrintMaleFemale.check();
	}

}
