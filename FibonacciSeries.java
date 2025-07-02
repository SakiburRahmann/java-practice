import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int terms = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter the number of terms in the Fibonacci series: ");
            if (scanner.hasNextInt()) {
                terms = scanner.nextInt();
                if (terms > 0) {
                    validInput = true;
                } else {
                    System.out.println("Please enter a positive integer greater than zero.");
                }
            } else {
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.next(); // consume the invalid input
            }
        }

        if (terms == 1) {
            System.out.println("Fibonacci Series: 0");
        } else {
            int first = 0, second = 1;
            System.out.print("Fibonacci Series: " + first + ", " + second);
            for (int i = 3; i <= terms; i++) {
                int next = first + second;
                System.out.print(", " + next);
                first = second;
                second = next;
            }
            System.out.println();
        }

        scanner.close();
    }
}