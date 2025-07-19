import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name = getValidName(scanner);
        int age = getValidAge(scanner);

        Person person = new Person(name, age);
        System.out.println(person);

        scanner.close();
    }

    static String getValidName(Scanner scanner) {
    while (true) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            continue;
        }

        if (name.matches("\\d+")) {
            System.out.println("Name cannot be a number!");
            continue;
        }

        return name;
    }
}


    static int getValidAge(Scanner scanner) {
        int age;
        while (true) {
            System.out.print("Enter age: ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                if (age < 0 || age > 150) {
                    System.out.println("The age seems unrealistic!");
                } else {
                    return age;
                }
            } else {
                System.out.println("Invalid input! Enter a numeric value.");
                scanner.next();
            }
        }
    }
}