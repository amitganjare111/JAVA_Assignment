package Arrays4;

public class FindEvenAndOddNumberCount {

	static void evenOdd()
	{
		int arr[] = {10,20,31,50,80,74,9,52,41,78,65};
		int count=0, count1=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
				count++;
		}
		System.out.println(count);
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2!=0)
				count1++;
		}
		System.out.print(count1);
	}
	public static void main(String[] args) {
		
		FindEvenAndOddNumberCount.evenOdd();
	}

}
