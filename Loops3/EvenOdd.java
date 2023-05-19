package Loops3;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		  
		        Scanner sc=new Scanner(System.in);
		        
		        int n;   
		        System.out.println("Enter the size of n: ");
		        n=sc.nextInt();  
		       
		        System.out.println("The Even Elements are...");
		        for(int i=0;i<n;i++)
		        {
		            if(i%2==0)   //Check whether even or not
		            {
		                System.out.print(i+" ");
		            }
		        }
		        System.out.println(" ");
		        
		      
		        System.out.println("The Odd Elements are...");
		        for(int i=0;i<n;i++)
		        {
		            if(i%2!=0)   //check whether odd or not
		            {
		                System.out.print(i+" ");
		            }
		        }
		    }
	}

