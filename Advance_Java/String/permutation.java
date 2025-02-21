package String;

public class permutation {
    public static void main(String[] args) {
        String string = "abc";
        // Generate and print all permutations of the string
        permutations(string, 0, string.length() - 1);
    }

    /**
     * Swaps two characters in a string at specified indices.
     * 
     * @param s the input string
     * @param i the first index
     * @param j the second index
     * @return the new string with characters at indices i and j swapped
     */
    static String swap(String s, int i, int j) {
        char[] a = s.toCharArray(); // Convert string to character array to manipulate characters
        char temp = a[i];          // Store the character at index i temporarily
        a[i] = a[j];               // Assign the character at index j to index i
        a[j] = temp;               // Assign the temporarily stored character to index j
        return new String(a);      // Convert the modified character array back to a string and return it
    }

    /**
     * Recursively generates all permutations of the string by swapping characters.
     * 
     * @param s   the current string
     * @param st  the starting index of the substring to permute
     * @param end the ending index of the substring to permute
     */
    static void permutations(String s, int st, int end) {
        // Base case: if the start index equals the end index, print the permutation

		// Input string: "abc"

		// Initial call: permutations("abc", 0, 2)

		// st = 0, end = 2 → Not equal, so we enter the for loop and recursively call with st + 1.
		// First recursive call: permutations("abc", 1, 2)

		// st = 1, end = 2 → Not equal, so we enter the for loop and recursively call with st + 1.
		// Second recursive call: permutations("abc", 2, 2)

		// st = 2, end = 2 → Base case triggered!
		// System.out.println(s) → Prints "abc".
		// return → Ends this branch of recursion.

        if (st == end) {
            System.out.println(s);
            return;
        }

        // Iterate over all possible characters to swap with the character at the start index
        for (int i = st; i <= end; i++) {
            String s1 = swap(s, st, i);      // Swap the current character with the character at index st
            permutations(s1, st + 1, end);  // Recurse for the next part of the string
        }
    }
}
