package Sorting;

import java.util.Arrays;
import java.util.Iterator;

public class BubbleSort {
//    public static void bubbleSort(int[] arr) {
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    // Swap arr[j] and arr[j+1]
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {64, 34, 25, 12, 22, 11, 90};
////        System.out.println(Arrays.toString(arr));
//        bubbleSort(arr);
////        System.out.println(Arrays.toString(arr));
//        System.out.println("Sorted array:");
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
//    }
//}


	public static void BubbleSort(int[]arr) {	
		int n = arr.length;
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[]a = {90,45,91,67,98,47};
		BubbleSort(a);
		for(int n : a) {
			System.out.print(n+ " ");
		}
	}

}























