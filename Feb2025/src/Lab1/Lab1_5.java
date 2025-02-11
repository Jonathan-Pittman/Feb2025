package Lab1;

import java.util.Scanner;

public class Lab1_5 {
    public static void main(String[] args) {
        Scanner Number = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        try {
            double number = Number.nextDouble();
            
            if (number > 0) {
                System.out.println("The number is positive.");
            } else if (number < 0) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid number.");
        } finally {
            Number.close();
        }
    }
}
