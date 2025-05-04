import java.util.Scanner;

public class EnhancedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Enhanced Console Calculator ===");
            System.out.println("1. Basic Arithmetic");
            System.out.println("2. Scientific Calculator");
            System.out.println("3. Unit Conversions");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    basicArithmetic(scanner);
                    break;
                case 2:
                    scientificCalc(scanner);
                    break;
                case 3:
                    unitConversions(scanner);
                    break;
                case 4:
                    System.out.println("Exiting calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    // Basic Arithmetic
    public static void basicArithmetic(Scanner scanner) {
        System.out.println("\nChoose operation: 1. Add  2. Subtract  3. Multiply  4. Divide");
        int op = scanner.nextInt();

        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();

        switch (op) {
            case 1:
                System.out.println("Result = " + (a + b));
                break;
            case 2:
                System.out.println("Result = " + (a - b));
                break;
            case 3:
                System.out.println("Result = " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Result = " + (a / b));
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid arithmetic choice.");
        }
    }

    // Scientific Calculator
    public static void scientificCalc(Scanner scanner) {
        System.out.println("\nChoose: 1. Square Root  2. Exponentiation");
        int op = scanner.nextInt();

        if (op == 1) {
            System.out.print("Enter number: ");
            double num = scanner.nextDouble();
            if (num >= 0) {
                System.out.println("Square Root = " + Math.sqrt(num));
            } else {
                System.out.println("Cannot compute square root of negative number.");
            }
        } else if (op == 2) {
            System.out.print("Enter base: ");
            double base = scanner.nextDouble();
            System.out.print("Enter exponent: ");
            double exp = scanner.nextDouble();
            System.out.println("Result = " + Math.pow(base, exp));
        } else {
            System.out.println("Invalid scientific operation.");
        }
    }

    // Unit Conversions
    public static void unitConversions(Scanner scanner) {
        System.out.println("\nChoose conversion: 1. Temperature (C↔F)  2. Currency (USD↔INR)");
        int op = scanner.nextInt();

        if (op == 1) {
            System.out.println("1. Celsius to Fahrenheit  2. Fahrenheit to Celsius");
            int tempChoice = scanner.nextInt();
            if (tempChoice == 1) {
                System.out.print("Enter Celsius: ");
                double c = scanner.nextDouble();
                double f = (c * 9 / 5) + 32;
                System.out.println("Fahrenheit = " + f);
            } else if (tempChoice == 2) {
                System.out.print("Enter Fahrenheit: ");
                double f = scanner.nextDouble();
                double c = (f - 32) * 5 / 9;
                System.out.println("Celsius = " + c);
            } else {
                System.out.println("Invalid temperature choice.");
            }
        } else if (op == 2) {
            final double rate = 83.25; // Example exchange rate
            System.out.println("1. USD to INR  2. INR to USD");
            int currencyChoice = scanner.nextInt();
            if (currencyChoice == 1) {
                System.out.print("Enter USD: ");
                double usd = scanner.nextDouble();
                System.out.println("INR = " + (usd * rate) + " INR");

            }
             else if (currencyChoice == 2) {
                System.out.print("Enter INR: ");
                double inr = scanner.nextDouble();
                System.out.println("USD = $" + (inr / rate));
            } else {
                System.out.println("Invalid currency choice.");
            }
        } else {
            System.out.println("Invalid unit conversion choice.");
        }
    }
}
