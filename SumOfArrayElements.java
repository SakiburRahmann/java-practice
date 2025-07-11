import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = promptInt(scanner, "Enter the number of values (must be > 1): ", 2);
        double[] values = new double[n];

        for (int i = 0; i < n; i++) {
            values[i] = promptDouble(scanner, "Enter number " + (i + 1) + ": ");
        }

        System.out.println("Sum: " + sum(values));
        scanner.close();
    }

    static int promptInt(Scanner sc, String prompt, int min) {
        int val;
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                val = sc.nextInt();
                if (val >= min)
                    return val;
            } else {
                sc.next(); 
            }
            System.out.println("Invalid input. Try again.");
        }
    }

    static double promptDouble(Scanner sc, String prompt) {
        double val;
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                return sc.nextDouble();
            } else {
                sc.next(); 
                System.out.println("Invalid input. Try again.");
            }
        }
    }

    static double sum(double[] arr) {
        double total = 0;
        for (double v : arr)
            total += v;
        return total;
    }
}