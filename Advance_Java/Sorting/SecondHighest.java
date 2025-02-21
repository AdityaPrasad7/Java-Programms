package Sorting;

import java.util.Arrays;

public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a = {42,12,67,97,57};
		Arrays.sort(a);
		int n = a[a.length-2];
		System.out.println(n);
	}

}
