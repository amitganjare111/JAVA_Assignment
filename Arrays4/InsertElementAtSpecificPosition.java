package Arrays4;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementAtSpecificPosition {

	public static void main(String[] args) {
		
		 int[] a = {10,20,30,40,50,60,70,80,90,100};
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Enter index number");
	        int index = sc.nextInt();
	     System.out.print("Enter value u want to add");
	        int value = sc.nextInt();
	        
	        System.out.println("Before Insert "+Arrays.toString(a) );
	 
	        for(int i=a.length-1;i>index;i--)
	        {
	            a[i]=a[i-1];
	        }
	        a[index]=value;
	        
	        System.out.println("After Insert "+Arrays.toString(a) );
	    }

	}


