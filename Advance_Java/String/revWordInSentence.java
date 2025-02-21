package String;

public class revWordInSentence {
	public static void main(String[] args) {
		 String s1 = "Hello! My name is Aditya.";
		 String result = reverse(s1);
		 System.out.println(result);
	}
	static  String reverse(String str){
		StringBuilder sb = new StringBuilder();
		int end  = str.length();
		for(int i = end - 1; i >= 0; i--){
			if(str.charAt(i) == ' ' || i == 0){
				 int start = (i == 0) ? i : i+1;
				for(int j = end - 1; j >= start; j--){
					sb.append(str.charAt(j));
				}
				if(i > 0){
					sb.append(' ');
				}
				end = i;
			}
		}
		return sb.toString();
	}
}
