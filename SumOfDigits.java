import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter an integer (positive or negative): ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                validInput = true; // Accept any integer (positive or negative)
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); 
            }
        }

        int originalNumber = number; // Store original for display
        number = Math.abs(number);   // Convert to absolute value to ignore sign
        int sum = 0;
        
        while (number > 0) {
            sum += number % 10; 
            number /= 10; 
        }

        System.out.println("Sum of digits of " + originalNumber + ": " + sum);
        scanner.close();
    }
}