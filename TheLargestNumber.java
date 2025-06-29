import java.util.Scanner;

public class TheLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to compare: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next();
        }
        int totalNumbers = scanner.nextInt();

        if (totalNumbers <= 0) {
            System.out.println("No numbers to compare.");
            scanner.close();
            return;
        }

        System.out.print("Enter number 1: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next();
        }
        int largestNumber = scanner.nextInt();
        int countLargest = 1;

        for (int i = 1; i < totalNumbers; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
            int currentNumber = scanner.nextInt();

            if (currentNumber > largestNumber) {
                largestNumber = currentNumber;
                countLargest = 1;
            } else if (currentNumber == largestNumber) {
                countLargest++;
            }
        }

        if (countLargest == totalNumbers) {
            System.out.println("All the numbers are equal: " + largestNumber);
        } else if (countLargest == 1) {
            System.out.println("The largest number is: " + largestNumber);
        } else {
            System.out.println("The largest number is " + largestNumber + " (appeared " + countLargest + " times)");
        }
        scanner.close();
    }
}