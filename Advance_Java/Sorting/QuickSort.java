package Sorting;

import java.util.Arrays;

public class QuickSort {

	
	
	public static void main(String[] args) {
		int [] arr = {2,4,1,8,7,3};
		quickSort(arr, 0, arr.length-1);
		//System.out.println(Arrays.toString(arr));
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	public static void quickSort(int [] a, int st, int end) {
		if(st >= end) return;
		int i = st;
		int j = end;
		int pivot = a[(st+end)/2];
		while(i <= j) {
			while(a[i] < pivot) i++;
			while(a[j] > pivot) j--;
		
			if(i <= j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		quickSort(a, st, j);
		quickSort(a, i, end);
	}
}

