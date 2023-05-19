package Arrays4;

import java.util.Arrays;
import java.util.Scanner;

public class FindSecondLargestElement {

	static void find()
	{
		
		    Scanner sc=new Scanner(System.in);
		    System.out.print("Enter value of Array");
		    int n=sc.nextInt();
		    
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		      a[i]=sc.nextInt();
		    
		    Arrays.sort(a);
		    
		    System.out.print("The second largest number: "+a[1]);

	}

	 public static void main(String[] args)
	 {
		 FindSecondLargestElement.find();
	 }
}
		  

