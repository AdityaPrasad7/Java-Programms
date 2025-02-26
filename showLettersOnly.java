package String;

public class showLettersOnly {
    public static void main(String[] args) {
        String str = "A1d2t3y4a5";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= str.length()-1; i++){
            char ch = str.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}


