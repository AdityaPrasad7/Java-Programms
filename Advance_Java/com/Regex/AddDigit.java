package com.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphanumeric string: ");
        String s = sc.next();
        sc.close(); // Close the Scanner to avoid resource leaks

        // Regular expression to match one or more digits
        String regex = "\\d+"; // Use \\d+ for any digit sequence
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);

        int sum = 0;
        // Iterate over all matches of digits in the string
        while (m.find()) {
            // Extract the matched digit substring
            String digitStr = m.group();

            // Check if the extracted string can be parsed to an integer
            try {
                sum += Integer.parseInt(digitStr);
            } catch (NumberFormatException e) {
                // Handle cases where the extracted string is not a valid integer
                System.err.println("Warning: Encountered non-numeric character in the string. Skipping...");
            }
        }

        System.out.println("Sum of digits: " + sum);
    }
}