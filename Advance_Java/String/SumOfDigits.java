package String;

public class SumOfDigits {
    public static void main(String[] args) {
        String s1 = "He12llo";
        int sum = 0;
        for(int i = 0; i <= s1.length()-1; i++){
            char ch = s1.charAt(i);
            if(ch >= '0' && ch <= '9'){
                sum += ch - '0';
            }
        }
        System.out.println(sum);
    }
}
