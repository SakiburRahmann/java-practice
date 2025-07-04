import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (true) {
            System.out.print("Enter an integer: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;
            }
            System.out.println("Invalid input. Try again.");
            scanner.next();
        }

        int reversedNumber = 0;

        while(number != 0) {

            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
            
        }
        System.out.println("Reversed number: " + reversedNumber);

        scanner.close();
    }
}