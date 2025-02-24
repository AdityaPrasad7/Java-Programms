package String;

public class Anagram1 {
    public static void main(String[] args) {
        String s1 = "Aditya";
        String s2 = "diatya";
        if (isAnagram(s1, s2)) {
            System.out.println("It's an anagram String!!");
        }
    }
    static boolean isAnagram(String s1, String s2){
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        while(true){
            if(s1.length() != s2.length()){
                return false;
            }
            if(s1.length() == 0 && s2.length() == 0){
                return true;
            }
            int [] charCount = new int[26];
            for(int i = 0; i <= s1.length()-1; i++){
                charCount[s1.charAt(i) - 'a']++;
                charCount[s2.charAt(i) - 'a']--;
            }
            for(int count : charCount){
                if(count != 0){
                    return false;
                }
            }
            return true;
        }
    }
}
