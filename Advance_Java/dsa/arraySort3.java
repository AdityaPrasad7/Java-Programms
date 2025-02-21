package dsa;
import java.util.Arrays;
public class arraySort3 {
	public static void main(String ags[]) {
		int[]a = {1,6,3,7,7,5,5,0,7,0};
		int[]b = new int[a.length];
		int index = 0;
		boolean[]flag = new boolean[101];
		for(int i = 0; i < a.length; i++) {
			if(!flag[a[i]]) {
				flag[a[i]] = true;
				b[index++] = a[i];
			}
		}
		int[] c = Arrays.copyOf(b, index);
		System.out.println(Arrays.toString(c));
		
		
		/* OR
		  	for (int i = 0; i < index; i++) {
            System.out.print(b[i] + (i < index - 1 ? ", " : "")); 
            // Print with comma separation
        }*/
	}
}
