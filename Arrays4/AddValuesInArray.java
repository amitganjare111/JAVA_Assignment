package Arrays4;

import java.util.Scanner;

public class AddValuesInArray {

	int arr[]=new int[5];
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("enter numbers");
		for(int i=1; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();	
		}
		
		for(int i=1; i<arr.length; i++)
		{
			System.out.print(arr[i]);	
		}
		
	}
	public static void main(String[] args) {
		
		AddValuesInArray obj = new AddValuesInArray();
		  obj.input();
	}

}
