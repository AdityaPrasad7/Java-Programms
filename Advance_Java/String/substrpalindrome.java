package String;

public class substrpalindrome {
    public static void main(String[] args) {
        String s1 = "Malayalam";
        for(int i = 0; i < s1.length(); i++){
            for(int j = s1.length()-1; j > i; j--){
                if(isPalindrome(s1,i,j)){
                    System.out.println(s1.substring(i, j+1));
                }
            }
        }
    }
    static boolean isPalindrome (String s, int st, int end){
        s = s.toLowerCase();
        while (st < end) {
            if(s.charAt(st) != s.charAt(end)){
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
}

