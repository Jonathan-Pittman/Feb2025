package Lab1;

import java.util.Scanner;

public class Lab1_9 {

	    public static String performOperation(String input, int choice) {
	        switch (choice) {
	            case 1:
	                return input + input;

	            case 2:
	                // Replace odd positions with '#'
	                StringBuilder replaceOdd = new StringBuilder(input);
	                for (int i = 1; i < input.length(); i += 2) {
	                    replaceOdd.setCharAt(i, '#');
	                }
	                return replaceOdd.toString();

	            case 3:
	                // Remove duplicate characters
	                StringBuilder removeDuplicates = new StringBuilder();
	                for (int i = 0; i < input.length(); i++) {
	                    if (removeDuplicates.indexOf(String.valueOf(input.charAt(i))) == -1) {
	                        removeDuplicates.append(input.charAt(i));
	                    }
	                }
	                return removeDuplicates.toString();

	            case 4:
	                // Change odd characters to upper case
	                StringBuilder changeOddToUpper = new StringBuilder(input);
	                for (int i = 0; i < input.length(); i++) {
	                    if (i % 2 != 0) {
	                        changeOddToUpper.setCharAt(i, Character.toUpperCase(input.charAt(i)));
	                    }
	                }
	                return changeOddToUpper.toString();

	            default:
	                return "Invalid choice!";
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Ask for input string
	        System.out.print("Enter the string: ");
	        String input = scanner.nextLine();

	        // Show the available choices
	        System.out.println("\nChoose an operation:");
	        System.out.println("1. Add the String to itself");
	        System.out.println("2. Replace odd positions with '#'");
	        System.out.println("3. Remove duplicate characters");
	        System.out.println("4. Change odd characters to upper case");

	        // Get the user's choice
	        System.out.print("\nEnter your choice (1-4): ");
	        int choice = scanner.nextInt();

	        // Perform the operation and display the result
	        String result = performOperation(input, choice);
	        System.out.println("\nResult: " + result);
	    }
}

