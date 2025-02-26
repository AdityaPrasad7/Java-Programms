package String;

public class showNumbersOnly {
    public static void main(String[] args) {
        String str = "A1d2t3y4a5";
        int sum = 0;
        for(int i = 0; i <= str.length()-1; i++){
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9'){
                sum += ch - '0';
            }
        }
        System.out.println(sum);
    }
}
