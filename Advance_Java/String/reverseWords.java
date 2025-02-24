package String;

import java.util.Scanner;

public class reverseWords {

    //Using String builder

    // public static void main(String[] args) {
    //     String sentence = "Hello! My name is Aditya.";
    //     String result = reverseSentence(sentence);
    //     System.out.println(result);  // Expected output: avaj si ysae
    // }

    // static String reverseSentence(String str) {
    //     StringBuilder sb = new StringBuilder();
    //     int start = 0;
    //     int end = str.length();
    //     for (int i = 1; i <= end; i++) { // Iterate over the sentence character by character
    //         if (i == end || str.charAt(i) == ' ') { // When we reach a space or the end of the sentence
    //             for (int j = i - 1; j >= start; j--) { // Reverse the word and append it to the result
    //                 sb.append(str.charAt(j));
    //             }
    //             if (i < end) { // Add the space after the word, but not at the end
    //                 sb.append(' ');
    //             }
    //             start = i + 1; // Move the start to the next word after the space
    //         }
    //     }
    //     return sb.toString();
    // }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a String: ");
        // String s = sc.nextLine();
        String s = "Aditya is a good guy.";
        for(int i = s.length()-1; i >= 0; i--){
            System.out.print(s.charAt(i));
        }
        sc.close();
    }


    //Using Split method
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a String: ");
    //     String s = sc.nextLine();
    //     String [] a = s.split(" ");
    //     for(int i = a.length-1; i >= 0; i--){
    //         System.out.print(a[i]+" ");
    //     }
    //     sc.close();
    // }


    //without using split method

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a String: ");
    //     String s = sc.nextLine();
    //     int end = s.length();
    //     for(int i = s.length()-1; i >= 0; i--){
    //         if(s.charAt(i)== ' ' || i == 0){
    //             if(i == 0){
    //                 System.out.print(s.substring(i, end));
    //             } else{
    //                 System.out.print(s.substring(i+1, end)+" ");
    //             }
    //             end = i;
    //         }
    //     }
    //     sc.close();
    // }


    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a String: ");
    //     String s = sc.nextLine();
    //     int end = s.length();
    //     for(int i = s.length()-1; i >= 0; i--){
    //         if(s.charAt(i) == ' ' || i == 0){
    //             if(i == 0){
    //                 System.out.print(s.substring(i, end));
    //             } else {
    //                 System.out.print(s.substring(i+1, end)+" ");
    //             }
    //             end = i;
    //         }
    //     }
    //     sc.close();
    // }


    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a String: ");
    //     String s = sc.nextLine();
    //     int end = s.length();
    //     for(int i = s.length()-1; i >= 0; i--){
    //         if(s.charAt(i) == ' ' || i == 0){
    //             if(i == 0){
    //                 System.out.print(s.substring(i, end));
    //             } else {
    //                 System.out.print(s.substring(i+1, end)+" ");
    //             }
    //             end = i;
    //         }
    //     }
    //     sc.close();
    // }
}

