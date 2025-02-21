package Sorting;

public class LinearSearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a = {34,56,43,89,59};
		System.out.println(LinearSearch(a,43));

	}
//	public static int search(int[]a, int e) {
//		for(int i = 0; i < a.length; i++) {
//			if(a[i] == e) {
//				return i;
//			}
//		}
//		return -1;
//	}
	
	
	//using recursion
	
	public static int LinearSearch(int[]a, int e) {
		return search(a, e, 0);
	}
	public static int search(int[]a, int e, int index) {
		
		if(index > a.length) return -1;
		if(a[index] == e) return index;
		return search(a, e, index+1);
	}
}
