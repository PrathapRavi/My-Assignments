package Assignments2;

import java.util.Arrays;

public class PrintDuplicate {

	public static void main(String[] args) {
		
		int arr[] = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int length = arr.length;
          System.out.println("The length of the array is "+length);
          
		Arrays.sort(arr);
		int count=0;
     
		for(int i =0; i<arr.length;i++ ) {
			
			for(int j= i+1; j < arr.length; j++) {
				
				if (arr[i]==arr[j]) {
					
					count++;
				
					System.out.println(+arr[i]);
					
				}
			}
		}
		

	}

}
