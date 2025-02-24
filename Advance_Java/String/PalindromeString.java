package String;

import java.util.Scanner;

public class PalindromeString {

	public static boolean isPal(String s){
		s = s.toLowerCase();
		int i = 0 , j = s.length()-1;
		while(i < j){
		if(s.charAt(i) != s.charAt(j)) return false;
		i++;
		j--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string: ");
		String s = sc.next();
			//String s = "Malayalam";
		if(isPal(s)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
		sc.close();
	}
}