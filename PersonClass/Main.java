import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = getValidName(scanner);
        int age = getValidAge(scanner);
        scanner.nextLine();
        String studentId = getValidStudentId(scanner);

        Student student = new Student(name, age, studentId);
        System.out.println(student);

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

    static String getValidStudentId(Scanner scanner) {
        while (true) {
            System.out.print("Enter student ID: ");
            String studentId = scanner.nextLine().trim();

            if (studentId.isEmpty()) {
                System.out.println("Student ID cannot be empty.");
                continue;
            }

            if (!studentId.matches("[a-zA-Z0-9]+")) {
                System.out.println("Student ID must contain only letters and numbers.");
                continue;
            }

            return studentId;
        }
    }

}