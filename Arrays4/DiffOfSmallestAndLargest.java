package Arrays4;

public class DiffOfSmallestAndLargest {
	
	int arr[]= {10,20,54,82,32,4,};
	int max=0, min=4;
	int Difference;
    void FindSmallestLargert()
	{
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	System.out.println(max);
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i]<min)
		{
			min=arr[i];
		}
		
	}
	System.out.println(min);
	}
    void Difference()
    {
    	Difference = max-min;
    	
    	System.out.print(Difference);
    }
    public static void main(String[] args)
    {
    	DiffOfSmallestAndLargest obj = new DiffOfSmallestAndLargest();
    	obj.FindSmallestLargert();
    	obj.Difference();
    }
    
    
}
