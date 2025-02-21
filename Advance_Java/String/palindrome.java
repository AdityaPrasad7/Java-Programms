package String;

public class palindrome{
    // public static void main(String[] args) {
    //     String s  = "Malayalam";
    //     if(isPalindrome(s, 0, s.length()-1)) System.out.println("Its palindrom :)");
    //     else System.out.println("not palindrome :(");
    // }

    public static void main(String[] args) {
        String s = "Malayalam";
        for(int i = 0; i < s.length()-1; i++){
            for(int j = i+1; j < s.length(); j++){
                if(isPalindrome(s, i, j)){
                    System.out.println(s.substring(i, j+1));
                }
            }
        }
    }

    public static boolean isPalindrome(String s, int st, int end){
        int i = st;
        int j = end;
        while( i < j){
            s = s.toLowerCase();
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
