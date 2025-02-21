package Sorting;

public class InsertionSort {
    public static void insertionSort(int[]a) {
    	for(int i = 1; i < a.length; i++) {
    		int key = a[i];
    		int j = i-1;
    		while(j >= 0 && a[j] > key) {
    			a[j+1] = a[j];
    			j--;
    		}
    		a[j+1] = key;
    	}
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        insertionSort(arr);
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

