package String;

import java.util.Arrays;

public class arraySort2 {

    public static void main(String[] args) {
        int[] arr = {5, 0, 7, 0, 9, 8, 0};
        sort(arr);
        // Output the result
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[]arr) {
    	int j = 0;
    	  for (int i = 0; i < arr.length; i++) {
              // If the current element is non-zero, swap it with the element at index j
              if (arr[i] == 0) {
                  int temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
                  j++;
              }
          }
      }
  }
 