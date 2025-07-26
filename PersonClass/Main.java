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

        System.out.println("Do you want to update the name or age? (yes/no)");
        String updateChoice = scanner.nextLine().trim().toLowerCase();
        if (updateChoice.equals("yes")) {
            updateStudentInfo(student, scanner);
        } else {
            System.out.println("No updates made.");
        }

        System.out.println("Total persons created: " + Person.getCount());

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
        while (true) {
            System.out.print("Enter age: ");
            if (scanner.hasNextInt()) {
                int age = scanner.nextInt();
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

    static void updateStudentInfo(Student student, Scanner scanner) {
        System.out.println("What do you want to update? (name/age)");
        String choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("name")) {
            String newName = getValidName(scanner);
            student.updateInfo(newName);
        } else if (choice.equals("age")) {
            int newAge = getValidAge(scanner);
            student.updateInfo(newAge);
        } else {
            System.out.println("Invalid choice. No updates made.");
        }

        System.out.println("Updated Student Info: " + student);
    }
}
