package week2.assignments.arrays;

import java.util.Arrays;

public class MissingElements {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		
	//i tried	
		for (int i=0;i<arr.length;i++) {
			if(arr[i]!=i+1) {
				System.out.println("missing number="+(i+1));
				break;
			}
		}
		
//in doubt clear session 
	for (int j=arr[0];j<arr.length;j++) {
			if(j!=arr[j-1])
					{
				System.out.println("mis num="+j);
				break;
					}
		}
			
	}

}
