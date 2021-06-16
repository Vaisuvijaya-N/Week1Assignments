package week2.assignments.arrays;

public class FindIntersection {

	public static void main(String[] args) {
		int[] arr1= {22,32,56,62,89,92,2};
		int arr2[]= {33,56,43,63,89,3};
		
		for (int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println("matching numbers="+arr1[i]);
				}
				
			}
		}
	}
}
