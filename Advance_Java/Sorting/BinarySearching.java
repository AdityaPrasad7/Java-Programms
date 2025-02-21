package Sorting;

import java.util.Arrays;

public class BinarySearching {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[]a = {45,67,87,35,12};
//		Arrays.sort(a);
//		System.out.println(search(a, 87));
//	}
//	static int search(int []a, int e) {
//		int start = 0, end = a.length -1;
//		while(start <= end) {
//			int mid =start + (end-start)/2;
//			if(a[mid] == e) return mid;
//			else if (a[mid] > e) end = mid-1;
//			else start = mid+1;
//		}
//		return -1;
//	}
	
	public static void main(String[]args) {
		int[]a = {45,67,87,35,12};
		Arrays.sort(a);
		int n = search(a, 87, 0, a.length-1);
		System.out.println(n);
	}
	public static int search(int[]a, int key, int st, int end) {
		if(st > end) return -1;
		int mid = st+(end-st)/2;
		if(key == a[mid]) return mid;
		else if(a[mid] > key) 
		return search(a, key, st, mid-1);
		else return search(a, key, mid+1, end);
	}

}
