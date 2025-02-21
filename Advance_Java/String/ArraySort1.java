package String;
import java.util.Arrays;
public class ArraySort1 {

	//public static void main(String[] args) {
	// 	int[]arr = {0,5,0,7,9,0,8};
	// 	sortArray(arr);
	// 	System.out.println(Arrays.toString(arr));
	// }
	// static void sortArray(int[]arr) {
	// 	int j = 0;
	// 	for(int i = 0; i <arr.length; i++) {
	// 		if(arr[i] != 0) {
	// 			int temp = arr[i];
	// 			arr[i] = arr[j];
	// 			arr[j] = temp;
	// 			j++;
	// 		}
	// 	}
	// }
	
	
	 public static void main(String[] args) {
	        int[] arr = {0, 5, 0, 7, 9, 0, 8};
	        sortArray(arr);
	        printArray(arr);  // Custom method to print the array
	    }
	    
	    static void sortArray(int[] arr) {
	        int index = 0;  // Index to keep track of non-zero elements
	        
	        // Traverse the array and move non-zero elements to the front
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] != 0) {
	                arr[index++] = arr[i];
	            }
	        }
	        
	        // Fill the remaining positions with zeroes
	        while (index < arr.length) {
	            arr[index++] = 0;
	        }
	    }
//	    
	    // Custom method to print the array
	    static void printArray(int[] arr) {
	        
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i]);  // Print the current element
	            if (i < arr.length - 1) {  // If it's not the last element, print a comma
	                System.out.print(", ");
	            }
	        }
	          // Print the closing bracket
	    }
	}

