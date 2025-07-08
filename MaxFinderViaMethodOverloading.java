import java.util.Scanner;

public class MaxFinderViaMethodOverloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = getComparisonCount(scanner);
        int firstNumber = getValidatedInt(scanner, "Enter the first number: ");
        int secondNumber = getValidatedInt(scanner, "Enter the second number: ");

        if (count == 2) {
            int max = max(firstNumber, secondNumber);
            System.out.println("The maximum of " + firstNumber + " and " + secondNumber + " is: " + max);
        } else {
            int thirdNumber = getValidatedInt(scanner, "Enter the third number: ");
            int max = max(firstNumber, secondNumber, thirdNumber);
            System.out.println("The maximum of " + firstNumber + ", " + secondNumber + ", and " + thirdNumber + " is: " + max);
        }

        scanner.close();
    }

    static int getValidatedInt(Scanner scanner, String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input! Please enter a numeric value: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    static int getComparisonCount(Scanner scanner) {
        int count;
        while (true) {
            System.out.print("How many numbers do you want to compare (2 or 3): ");
            if (scanner.hasNextInt()) {
                count = scanner.nextInt();
                if (count == 2 || count == 3) {
                    return count;
                } else {
                    System.out.println("Invalid input! You can compare 2 or 3 numbers only.");
                }
            } else {
                System.out.println("Invalid input! Please enter a numeric value.");
                scanner.next(); 
            }
        }
    }

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }
}
