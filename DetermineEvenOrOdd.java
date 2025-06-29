import java.util.Scanner;

public class DetermineEvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean condition = true;
        do {
        System.out.print("Enter a number: ");
        
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number " + number  + " is even.");
        } else {
            System.out.println("The number " + number + " is odd.");
        }
        System.out.println("Do you want to check another number? (yes/no): ");
        condition = scanner.next().equalsIgnoreCase("yes");
        } while(condition);

        scanner.close();

    }
}