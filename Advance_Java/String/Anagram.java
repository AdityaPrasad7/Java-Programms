package String;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "silent";
		String s2 = "litesn";
		if (anagram(s1, s2)) {
			System.out.println("Its an anagram string");
		}
		
	}
	
	static boolean anagram(String s1, String s2) {
		while(true) {
			
			// Check if lengths are equal
			if (s1.length() != s2.length()) {
				return false;
			}
			if (s1.length() == 0 && s2.length() == 0) {
				return true;
			}
			int[]charCount = new int[26];//create an array of size 26 to count characters
			
			//Traverse both string simultaneously
			for(int i = 0; i < s1.length(); i++) {
				charCount[s1.charAt(i)-'a']++;
				charCount[s2.charAt(i)-'a']--;
			}
			for(int count : charCount) {
				if(count != 0) {
					return false;
				}
			}
			return true;
		}
	}

}
