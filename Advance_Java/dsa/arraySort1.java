package dsa;


import java.util.Arrays;
public class arraySort1 {

	public static void main(String[] args) {
		int[]arr = {0,5,0,7,9,0,8};
		sortArray(arr);
	}
	static void sortArray(int[]arr) {
		int index = 0;
		for(int i = 0; i <arr.length; i++) {
			if(arr[i] != 0) {
				arr[index++] = arr[i];
			}
		}
		while(index < arr.length) {
			arr[index++] = 0;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	
//	public static void main(String ags[]) {
//	int[]a = {1,6,3,0,7,0,5,0};
//	int[]b = new int[a.length];
//	int index = 0;
//	for(int i = 0; i < a.length; i++) {
//		if(a[i] != 0) {
//			b[index++] = a[i];
//		}
//	}
//	System.out.println(Arrays.toString(b));
//}
	
	
	
	
	
	
	// without using toString()
	
//	 public static void main(String[] args) {
//	        int[] arr = {0, 5, 0, 7, 9, 0, 8};
//	        sortArray(arr);
//	        printArray(arr);  // Custom method to print the array
//	    }
//	    
//	    static void sortArray(int[] arr) {
//	        int index = 0;  // Index to keep track of non-zero elements
//	        
//	        // Traverse the array and move non-zero elements to the front
//	        for (int i = 0; i < arr.length; i++) {
//	            if (arr[i] != 0) {
//	                arr[index++] = arr[i];
//	            }
//	        }
//	        
//	        // Fill the remaining positions with zeroes
//	        while (index < arr.length) {
//	            arr[index++] = 0;
//	        }
//	    }
//	    
//	    // Custom method to print the array
//	    static void printArray(int[] arr) {
//	        
//	        for (int i = 0; i < arr.length; i++) {
//	            System.out.print(arr[i]);  // Print the current element
//	            if (i < arr.length - 1) {  // If it's not the last element, print a comma
//	                System.out.print(", ");
//	            }
//	        }
	          // Print the closing bracket
	

	   }



