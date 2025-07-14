import java.util.Scanner;

public class CalculatePower {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double base = getValidatedDouble(scanner, "Enter the base: ");
            int exponent = getValidatedInt(scanner, "Enter the exponent (integer only): ");

            if (base == 0 && exponent == 0) {
                System.out.println("Result: Undefined (0^0 is indeterminate)");
            } else {
                double result = calculatePower(base, exponent);
                System.out.println("Result: " + result);
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
                scanner.next();
            }
        }
    }

    private static int getValidatedInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
        }
    }

    static double calculatePower(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        if (exponent < 0) {
            return 1 / calculatePower(base, -exponent);
        }

        return base * calculatePower(base, exponent - 1);
    }

}
