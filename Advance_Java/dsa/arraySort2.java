package dsa;

import java.util.Arrays;

public class arraySort2 {

    public static void main(String[] args) {
        int[] arr = {0, 5, 0, 7, 0, 9, 8};
        int[] arr2 = new int[arr.length];
        
        int index = 0;  // j is the index for the non-zero elements

        // First, place the zeros at the start
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr2[index++] = 0;  // Fill in the zeros at the start of b
                
            }
        }

        // Then place the non-zero elements after the zeros
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr2[index++] = arr[i];  // Add non-zero elements in order
        }
    }
        // Output the result
        System.out.println(Arrays.toString(arr2));
    }




//	public static void main(String ags[]) {
//		int[]a = {1,6,3,0,7,0,5,0};
//		int[]b = new int[a.length];
//		int index = a.length-1;
//		for(int i = 0; i < a.length; i++) {
//			if(a[i] != 0) {
//				a[index--] = a[i];
//			}
//		}
//		System.out.println(Arrays.toString(b));
//	}
}
