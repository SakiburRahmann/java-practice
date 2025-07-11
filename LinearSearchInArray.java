import java.util.Scanner;

public class LinearSearchInArray {

    private static final double EPSILON = 1e-9;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = getValidatedInt(scanner, "Enter the number of elements: ");
        double[] numbers = readDoubleArray(scanner, length);

        double target = getValidatedDouble(scanner, "Enter the value to search for: ");
        int index = linearSearch(numbers, target);

        if (index >= 0) {
            System.out.println("Value " + target + " found at index " + index + ".");
        } else {
            System.out.println("Value " + target + " not found in the array.");
        }

        scanner.close();
    }

    private static int getValidatedInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                if (value > 0) {
                    return value;
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Consume invalid token
            }
        }
    }

    private static double getValidatedDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Consume invalid token
            }
        }
    }

    private static double[] readDoubleArray(Scanner scanner, int length) {
        double[] array = new double[length];
        for (int i = 0; i < length; i++) {
            array[i] = getValidatedDouble(scanner, "Enter element " + (i + 1) + ": ");
        }
        return array;
    }

    private static int linearSearch(double[] array, double target) {
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i] - target) < EPSILON) {
                return i;
            }
        }
        return -1;
    }
}
