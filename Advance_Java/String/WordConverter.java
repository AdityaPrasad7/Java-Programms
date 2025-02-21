package String;


public class WordConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Aditya";
		System.out.println(caseConvert(a));
	}
	 static String caseConvert(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(i >= 0 && ch >= 'A' && ch <= 'Z')
			sb.append((char)(ch+32));
			else if(i >= 0 && ch >= 'a' && ch <= 'z')
				sb.append((char)(ch-32));
			else sb.append(ch);
		}
		return sb.toString();
	}
}
