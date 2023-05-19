package Arrays4;

public class FindMinimumAndMaxArray {

	public static void main(String[] args) {
	
		int arr[]={1,2,3,4,5,6};
		
        int max = arr[0];
        int min = arr[0];
        
        for( int i=0; i<=arr.length-1; i++)
        {
          if(arr[i]>max)
          {
            max = arr[i];
          }
          
          if(arr[i]<min)
          {
            min = arr[i];
          }
          
        }
        System.out.println("maximum elements: "+max);
        System.out.print("minimum elements: "+min);
       }
 }

	


