package String;

public class caseconvert {
    public static void main(String[] args) {
        String input = "AdiIya";
        String result = convertCase(input);
        System.out.println(result);
    }

    static String convertCase(String s) {
        StringBuilder result = new StringBuilder(); // To store the resulting string

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // If it's the first character, convert it to lowercase if it's uppercase
            if (i >= 0 && ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));  // Convert uppercase to lowercase using ASCII
            }
            // For the rest of the characters, convert to uppercase if they're lowercase
            else if (i > 0 && ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));  // Convert lowercase to uppercase using ASCII
            }
            // If the character doesn't need conversion, append it as is
            else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}

