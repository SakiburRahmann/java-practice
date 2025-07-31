import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OverloadedCalculator calculator = new OverloadedCalculator();
        Scanner scanner = new Scanner(System.in);

        String mode = selectMode(scanner);           
        String operation = selectOperation(scanner); 

        if (mode.equals("1")) {
            int a = getIntInput(scanner, "Enter first integer: ");
            int b = getIntInput(scanner, "Enter second integer: ");
            performIntOperation(calculator, operation, a, b);
        } else {
            double a = getDoubleInput(scanner, "Enter first double: ");
            double b = getDoubleInput(scanner, "Enter second double: ");
            performDoubleOperation(calculator, operation, a, b);
        }

        scanner.close();
    }

    public static String selectMode(Scanner scanner) {
        String mode = "";
        while (!(mode.equals("1") || mode.equals("2"))) {
            System.out.print("Select mode:\n1. int\n2. double\n> ");
            mode = scanner.nextLine().trim();
        }
        return mode;
    }

    public static String selectOperation(Scanner scanner) {
        String op = "";
        while (!isValidOperation(op)) {
            System.out.print("Choose operation (+, -, *, /): ");
            op = scanner.nextLine().trim();
        }
        return op;
    }

    public static void performIntOperation(OverloadedCalculator calc, String op, int a, int b) {
        System.out.println("\nResult (Integer Mode):");
        switch (op) {
            case "+" -> System.out.println("Addition: " + calc.add(a, b));
            case "-" -> System.out.println("Subtraction: " + calc.subtract(a, b));
            case "*" -> System.out.println("Multiplication: " + calc.multiply(a, b));
            case "/" -> System.out.println("Division: " + calc.divide(a, b));
        }
    }

    public static void performDoubleOperation(OverloadedCalculator calc, String op, double a, double b) {
        System.out.println("\nResult (Double Mode):");
        switch (op) {
            case "+" -> System.out.println("Addition: " + calc.add(a, b));
            case "-" -> System.out.println("Subtraction: " + calc.subtract(a, b));
            case "*" -> System.out.println("Multiplication: " + calc.multiply(a, b));
            case "/" -> System.out.println("Division: " + calc.divide(a, b));
        }
    }
    public static boolean isValidOperation(String op) {
        return op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/");
    }

    public static int getIntInput(Scanner scanner, String prompt) {
        String input;
        while (true) {
            System.out.print(prompt);
            input = scanner.nextLine().trim();
            if (input.matches("-?\\d+")) {
                return Integer.parseInt(input);
            }
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }

    public static double getDoubleInput(Scanner scanner, String prompt) {
        String input;
        while (true) {
            System.out.print(prompt);
            input = scanner.nextLine().trim();
            if (input.matches("-?\\d+(\\.\\d+)?")) {
                return Double.parseDouble(input);
            }
            System.out.println("Invalid input. Please enter a valid double.");
        }
    }
}
