package Arrays4;

import java.util.Scanner;

public class FindArrayElement {

	public static void main(String[] args) {
		
		      int[] myArray = {55, 45, 69, 44};
		      int num;
		      Scanner sc = new Scanner(System.in);
                     num = sc.nextInt();
                 
		      for(int i = 0; i<myArray.length; i++){
		         if(num == myArray[i]){
		            System.out.println("Array contains the given element");
		         }
		      
		      }

	}

}
