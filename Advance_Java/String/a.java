package String;

public class a {
    public static void main(String[] args) {
        String s = "AWAWSSG";
        String result = getFinalStringOptimized(s);
        System.out.println(result); // Output: "G"
    }

    public static String getFinalStringOptimized(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i)); // Add character to StringBuilder
            
            // Check if the last three characters form "AWS"
            if (sb.length() >= 3 &&
                sb.substring(sb.length() - 3).equals("AWS")) {
                sb.delete(sb.length() - 3, sb.length()); // Remove "AWS"
            }
        }

        // Return "-1" if the result is empty, otherwise return the result
        return sb.length() == 0 ? "-1" : sb.toString();
    }
}
