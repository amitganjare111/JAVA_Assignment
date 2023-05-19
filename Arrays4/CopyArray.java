package Arrays4;

import java.util.Scanner;

public class CopyArray {

	 public static void main(String[] args)
     {
       int a[] = new int [5];
       int b[] = new int [5];
       Scanner sc =new Scanner(System.in);
       
       System.out.print("Enter Array Elements");
       for( int i=0; i<5; i++)
       {
         a[i] = sc.nextInt();
       }
       
       System.out.print("coppied array: ");
       for( int i=0; i<5; i++)
       {
         b[i] = a[i];
         System.out.print(b[i]);
       }
     
      }
}

