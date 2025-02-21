package String;

public class reverseSentenceWords {
	 public static void main(String[] args) {
        String sentence = "hello! my name is Aditya.";
        String result = reverseWords(sentence);
        System.out.println(result);  // Expected output: easy is java
    }

    static String reverseWords(String sentence) {
        StringBuilder sb = new StringBuilder();
        int end = sentence.length(); // Start from the end of the sentence
        for (int i = end - 1; i >= 0; i--) { // Traverse the sentence from the end to the beginning
            if (sentence.charAt(i) == ' ' || i == 0) { // When a space is found, or we've reached the beginning of the string
                int start = (i == 0) ? i : i + 1; // Calculate the start index of the word
                for (int j = start; j < end; j++) { // Append the word to the result
                    sb.append(sentence.charAt(j));
                }
                if (i > 0) { // Add a space after the word (but not at the end)
                    sb.append(' ');
                }
                end = i; // Update the end to the current space position
            }
        }
        return sb.toString();
    }
}
