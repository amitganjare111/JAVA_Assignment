package Arrays4;

public class ReverseArray {

	public static void main(String [] args)
    {
     int arr[]={1,2,3,4,5};
     
     System.out.print("Original Array is: ");
     
     for( int i=0; i<arr.length; i++)
     {
       System.out.print( arr[i]+ " ");
     }
     
     System.out.print("\n");
     System.out.print("Reverse Array is: ");
     
     for(int j=arr.length-1; j>=0; j--)
     {
       System.out.print( +arr[j]+ " "); 
     }
    }
}
