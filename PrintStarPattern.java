import java.util.Scanner;

public class PrintStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = promptInt(scanner, "Enter the length of the right triangle: ", 1);
        printRightAlignedTriangle(n);

        scanner.close();
    }

    static int promptInt(Scanner sc, String prompt, int min) {
        int val;
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                val = sc.nextInt();
                if (val >= min) {
                    return val;
                } else {
                    System.out.println("Input must be greater than 0");
                }
            } else {
                sc.next();
            }
            System.out.println("Invalid input. Try again.");
        }
    }

    static void printRightAlignedTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
