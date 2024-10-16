package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    // Method to calculate square root
    public static double squareRoot(double x) {
        logger.info("Start of Square Root");
        logger.info("End of Square Root");
        return Math.sqrt(x);
    }

    // Method to calculate factorial
    public static long factorial(int x) {
        logger.info("Start of Factorial");
        long fact = 1;
        for (int i = 2; i <= x; i++) {
            fact *= i;
        }
        logger.info("End of Factorial");
        return fact;
    }

    // Method to calculate natural logarithm (ln)
    public static double naturalLogarithm(double x) {
        logger.info("Start of Natural Logarithm");
        logger.info("End of Natural Logarithm");
        return Math.log(x);
    }

    // Method to calculate power (x^b)
    public static double power(double x, double b) {
        logger.info("Start of Powe");
        logger.info("End of Power");
        return Math.pow(x, b);
    }

    public static void main(String[] args) {
        logger.info("Starting Execution");
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Scientific Calculator - Choose an option:");
            System.out.println("1. Square root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural logarithm (ln(x))");
            System.out.println("4. Power (x^b)");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Square root
                    System.out.print("Enter a number: ");
                    double num = scanner.nextDouble();
                    if (num < 0) {
                        System.out.println("Square root of negative numbers is not allowed.");
                    } else {
                        System.out.println("Square root of " + num + " is: " + squareRoot(num));
                    }
                    break;

                case 2: // Factorial
                    System.out.print("Enter a positive integer: ");
                    int factNum = scanner.nextInt();
                    if (factNum < 0) {
                        System.out.println("Factorial is not defined for negative numbers.");
                    } else {
                        System.out.println("Factorial of " + factNum + " is: " + factorial(factNum));
                    }
                    break;

                case 3: // Natural logarithm
                    System.out.print("Enter a number: ");
                    double logNum = scanner.nextDouble();
                    if (logNum <= 0) {
                        System.out.println("Natural logarithm is not defined for non-positive numbers.");
                    } else {
                        System.out.println("Natural logarithm of " + logNum + " is: " + naturalLogarithm(logNum));
                    }
                    break;

                case 4: // Power function
                    System.out.print("Enter the base (x): ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the exponent (b): ");
                    double exponent = scanner.nextDouble();
                    System.out.println(base + " raised to the power of " + exponent + " is: " + power(base, exponent));
                    break;

                case 5: // Exit
                    exit = true;
                    System.out.println("Exiting the calculator...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
        }
        logger.info("End of Execution");
        scanner.close();
    }
}