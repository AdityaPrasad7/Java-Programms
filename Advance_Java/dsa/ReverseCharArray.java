package dsa;
import java.util.Scanner;

	public class ReverseCharArray {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the number of characters
	        System.out.print("Enter the number of characters: ");
	        int n = scanner.nextInt();

	        // Create an array to store characters
	        char[] charArray = new char[n];

	        // Input characters into the array
	        System.out.println("Enter the characters: ");
	        for (int i = 0; i < n; i++) {
	            charArray[i] = scanner.next().charAt(0); // Read character input
	        }

	        // Print characters in reverse order
	        System.out.print("Characters in reverse order: ");
	        for (int i = n - 1; i >= 0; i--) {
	            System.out.print(charArray[i] + " ");
	        }
	        
	        scanner.close();
	    }
	}

