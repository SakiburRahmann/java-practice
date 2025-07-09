import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer to calculate its factorial: ");
        int number = getValidatedInt(scanner);
        long factorial = calculateFactorial(number);

        System.out.println("The factorial of " + number + " is: " + factorial);
        scanner.close();
    }

    static int getValidatedInt(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number >= 0 && number <= 20) {
                    return number;
                } else {
                    System.out.print("Invalid input! Please enter a non-negative integer between 0 to 20: ");
                }
            } else{
                System.out.print("Invalid input! Please enter a numeric value: ");
                scanner.next();
            }
        }
    }

    static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

}
