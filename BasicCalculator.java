import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = getDoubleInput(scanner, "Enter the first number: ");
        char operator = getOperatorInput(scanner);
        double num2 = getDoubleInput(scanner, "Enter the second number: ");
        

        double result;

        switch (operator) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                if (num2 == 0.0) {
                    System.out.println("Error: Division by zero is undefined.");
                    scanner.close();
                    return;
                }
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operator.");
                scanner.close();
                return;
        }

        System.out.printf("%.2f %c %.2f = %.2f%n", num1, operator, num2, result);
        scanner.close();
    }

    static double getDoubleInput(Scanner scanner, String prompt) {
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

    static char getOperatorInput(Scanner scanner) {
        System.out.print("Enter an operator (+, -, *, /): ");
        while (true) {
            String input = scanner.next().trim();
            if (input.length() == 1) {
                char op = input.charAt(0);
                if (op == '+' || op == '-' || op == '*' || op == '/') {
                    return op;
                }
            }
            System.out.print("Invalid operator. Please enter one of (+, -, *, /): ");
        }
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }
}
