package String;

public class OccurenceOfCharacter {
    public static void main(String[] args) {
        String str = "Hello, World!";
        char ch = 'l';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("The character " + ch + " occurs " + count + " times in the string " + str + ".");
                
    }
}
