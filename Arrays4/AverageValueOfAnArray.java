package Arrays4;

import java.util.Scanner;

// write a function to calculate the average value of an array of integers
public class AverageValueOfAnArray {

	int arr[]=new int[5];
	int sum;
	float Average;
	Scanner sc=new Scanner(System.in);
	 void AddElementArray()
	{
		System.out.println("enter numbers");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
			sum +=arr[i];
		}
		Average = sum/arr.length;
		System.out.println("Average of Array is : "+Average);
	}
	public static void main(String[] args) {
		
		AverageValueOfAnArray obj = new AverageValueOfAnArray();
		obj.AddElementArray();
	}

}
