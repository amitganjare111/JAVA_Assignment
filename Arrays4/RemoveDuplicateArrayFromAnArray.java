package Arrays4;

import java.util.Arrays;

public class RemoveDuplicateArrayFromAnArray {

	public static void main(String[] args) {
		
		int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};  
		 int k[] = new int [arr.length];
		 int i;
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for( i = 0; i < arr.length-1; i++) 
        {  
            for(int j = 1, a=0; j <arr.length; j++) 
            {  
                if(arr[i] == arr[j])  
                    k[a] = arr[j];
                a++;
            }  
        } 
        for( i = 0; i < arr.length-1; i++) 
        {
        	System.out.println(k[i]);
        }
}

	}


