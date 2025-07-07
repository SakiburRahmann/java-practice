import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it is a palindrome: ");
        String input = getValidatedInput(scanner);

        System.out.println("The input string is " + (isPalindrome(input) ? "" : "not ") + "a palindrome.");

        scanner.close();
    }

    static String getValidatedInput(Scanner scanner) {
        String input;
        while (true) {
            input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.print("Invalid input. Please enter a non-empty string: ");
        }
    }

    static boolean isPalindrome(String input) {
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (cleanedInput.isEmpty()) {
            return false;
        }

        int left = 0;
        int right = cleanedInput.length() - 1;

        while (left < right) {
            if (cleanedInput.charAt(left) != cleanedInput.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
