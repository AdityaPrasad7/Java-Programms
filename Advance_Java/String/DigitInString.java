package String;

import java.util.Scanner;

// public class DigitInString {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 			System.out.println("Enter a String: ");
// 			String a = sc.next();
// 			System.out.println(extractDigit(a));
// 			System.out.println(sumOfDigits(a));
// 			System.out.println(removeDigits(a));
// 			sc.close();
// 	}
	
// 	public static String extractDigit(String str) {
// 		StringBuilder d = new StringBuilder();
// 		for(Character ch : str.toCharArray()) {
// //			if(Character.isDigit(ch)) {
// 			if(ch >= '0' && ch <= '9') {
// 				d.append(ch);
// 			}
// 		}
// 		return d.toString();
// 	}
// 	public static int sumOfDigits(String str) {
// 		int sum = 0;
// 		for(int i = 0; i < str.length(); i++) {
// 			Character ch = str.charAt(i);
// 			//for(Character ch: str.toCharArray()) {
// 			if(ch >= '0' && ch <= '9') {
// 					sum+= ch-'0';
// 			}
// 		}
// 		return sum;
// 	}
// 	public static String removeDigits(String str) {
// 		StringBuilder d = new StringBuilder();
// 		for(Character ch: str.toCharArray()) {
// 			if(ch < '0' || ch > '9') {
// 				d.append(ch);
// 			}
// 		}
// 		return d.toString();
// 	}
// }

// public class DigitInString{
// 	public static void main(String[] args) {
// 		String s = "t5678uygt678yugt678u";
// 		System.out.println(extractDiigit(s));
// 	}
// 	public static String extractDiigit(String st){
// 		StringBuilder d = new StringBuilder();
// 		for(char ch : st.toCharArray()){
// 			if(ch >= '0' && ch <= '9'){
// 				d.append(ch);
// 			}
// 		}
// 		return d.toString();
// 	}
// }




public class DigitInString{
	public static void main(String[] args) {
		String s = "t5678uygt678yugt678u";
		char[]ch = s.toCharArray();
		for(int i = ch.length-1; i >= 0; i--){
				System.out.print(ch[i]);
			}
	// }
	// public static String reverseStringsss(String st){
	// 	StringBuilder d = new StringBuilder();
	// 	for(char ch : st.toCharArray()){
	// 		if(ch >= '0' && ch <= '9'){
	// 			d.append(ch);
	// 		}
	// 	}
	// 	return d.toString();
	}
}