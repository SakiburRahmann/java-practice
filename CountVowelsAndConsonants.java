import java.util.Scanner;

public class CountVowelsAndConsonants {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        while (true) {
            System.out.print("Enter a non-empty string: ");
            input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                break;
            }
            System.out.println("Input cannot be empty.");
        }

        int vowels = countVowels(input);
        int consonants = countConsonants(input);

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        scanner.close();
    }

    static int countVowels(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }
        }
        return count;
    }

    static int countConsonants(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                    count++;
                }
            }
        }
        return count;
    }
}
