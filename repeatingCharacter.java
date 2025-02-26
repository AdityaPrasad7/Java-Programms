package String;

public class repeatingCharacter {
    public static void main(String[] args) {
        String str = "aabbcccd";
        int[] freq = new int[256]; // Assuming ASCII characters

        // Count occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Print characters that appear more than once
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] >= 1) {
                System.out.print(str.charAt(i));
                freq[str.charAt(i)] = 0; // Avoid duplicate printing
            }
        }
    }
}

