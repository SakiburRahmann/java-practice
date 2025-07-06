import java.util.Scanner;

public class NumberIsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number greater than 1: ");

        int number;

        while(true) {
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. ");
                scanner.next();
                System.out.print("Please enter a positive integer greater than 1: ");
            }
            number = scanner.nextInt();

            if (number > 1) {
                break;
            } else {
                System.out.print("Invalid input. Please enter a positive integer greater than 1: ");
            }
        }

        boolean isPrime = isPrime(number);
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true; 
    }
}
