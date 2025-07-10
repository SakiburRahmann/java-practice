import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of numbers you want to add: ");
        int amountOfNumbers = getValidatedInputForArrayLength(scanner);
        
        double[] arrayOfNumbers = createArray(scanner, amountOfNumbers);
        double sumOfArrayElements = sumOfArrayElements(arrayOfNumbers);
        System.out.println("Sum: " + sumOfArrayElements);

        scanner.close();
    }

    static int getValidatedInputForArrayLength(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int amountOfNumbers = scanner.nextInt();
                if (amountOfNumbers <= 1) {
                    System.out.print("Invalid input! Please enter a number more than 1: ");
                } else {
                    return amountOfNumbers;
                }
            } else {
                System.out.print("Please enter a numeric value (Integer): ");
                scanner.next();
            }
        }
    }

    static double getValidatedInputForDouble(Scanner scanner) {
        while (true) {
            if (scanner.hasNextDouble()) {
                double input = scanner.nextDouble();
                return input;
            } else {
                System.out.print("Please enter a numeric value: ");
                scanner.next();
            }
        }
    }

    static double[] createArray(Scanner scanner, int amountOfNumbers) {
        double[] arrayOfNumbers = new double[amountOfNumbers];
        for (int i = 0; i < amountOfNumbers; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arrayOfNumbers[i] = getValidatedInputForDouble(scanner);
        }
        return arrayOfNumbers;
    }

    static double sumOfArrayElements(double[] arrayOfNumbers) {
        double sumOfArrayElements = 0;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            sumOfArrayElements += arrayOfNumbers[i];
        }
        return sumOfArrayElements;
    }
}
