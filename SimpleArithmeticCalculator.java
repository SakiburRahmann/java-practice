import java.util.Scanner;

public class SimpleArithmeticCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char operation = ' ';
        boolean validOperation = false;
        do {
        System.out.print("Choose an operation (+, -, *, /): ");
        operation = scanner.next().charAt(0);
            if (operation == '+' || operation == '-' || operation == '*' || operation == '/') {
                validOperation = true;
            } else {
                System.out.println("Invalid operation. Please try again.");
            }
        } while (!validOperation);

        System.out.print("Enter first number: ");
        double firstNumber =scanner.nextDouble();
        double secondNumber = 0;
        do {
        System.out.print("Enter second number: ");
        secondNumber =scanner.nextDouble();
        }while (secondNumber == 0 && operation == '/');

        double result = 0;
        String operationName = "";

        if (operation == '+') {
            result = add(firstNumber, secondNumber);
            operationName = "Sum";
        } else if (operation == '-') {
            result = subtract(firstNumber, secondNumber);
            operationName = "Difference";
        } else if (operation == '*') {
            result = multiply(firstNumber, secondNumber);
            operationName = "Product";
        } else if (operation == '/') {  
            result = divide(firstNumber, secondNumber);
            operationName = "Quotient";
        }
        
        System.out.println(operationName + ": " + result);
        

        scanner.close();
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
