package Arrays4;

//Write a method to verify if the array contains two specified elements(12,23)

public class CheckArrayComtainSpecificElement {

	int arr[] = {22,11,55,44,66,12,78,23,77};
	int arr1[] = {12,23,0,0,0,0,0,0,0};
	void check()
	{
		for(int i=0; i<arr1.length-1; i++)
		{
		  for(int j=0; i<arr.length-1; i++)
		  {
			if(arr[i]==arr1[i]);
		  }
		System.out.print("contain");
	}
	}
	public static void main(String[] args) {
		CheckArrayComtainSpecificElement obj = new CheckArrayComtainSpecificElement();
		 obj.check();
	}

}
