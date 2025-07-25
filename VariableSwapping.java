import java.util.Scanner;

public class VariableSwapping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = getValidatedDouble(scanner, "Enter number 1: ");
        double b = getValidatedDouble(scanner, "Enter number 2: ");

        System.out.println("First number before swap: " + a);
        System.out.println("Second number before swap: " + b);
        
        a = a + b;
        b = a - b;
        a -= b;
        
        System.out.println("First number after swap: " + a);
        System.out.println("Second number after swap: " + b);

        scanner.close();
    }

    static double getValidatedDouble(Scanner scanner, String prompt) {
        double value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                return value;
            } else {
                System.out.println("Invalid input! Please enter a numeric value.");
                scanner.next();
            }
        }
    }
}
