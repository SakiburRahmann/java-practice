import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number;

        while (true) {
            while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. ");
            scanner.next();
            System.out.print("Please enter a positive integer: ");
            }
            number = scanner.nextInt();

            if (number > 0) {
                break;
            } else {
                System.out.print("Invalid input. Please enter a positive integer: ");
            }
        }

        int sumLoop = 0;

        for (int i = 1; i <= number; i++) {
            sumLoop += i;
        }

        int sumFormula = ((number * (number + 1)) / 2);

        System.out.println("Sum of first " + number + " natural numbers using loop: " + sumLoop);
        System.out.println("Sum of first " + number + " natural numbers using formula: " + sumFormula);

        scanner.close();
    }
}