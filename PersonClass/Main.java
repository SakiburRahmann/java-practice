import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Demonstrating overloaded constructors in Person class:");
        Person p1 = new Person("Alice", 28);
        Person p2 = new Person("Bob");
        Person p3 = new Person();

        System.out.println("\n--- Person Objects ---");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("\n--- Create Student ---");
        String name = getValidName(scanner);
        int age = getValidAge(scanner);
        scanner.nextLine(); 
        String studentId = getValidStudentId(scanner);

        Student student = new Student(name, age, studentId);
        System.out.println("\nCreated Student:");
        System.out.println(student);

        System.out.println("\nDo you want to update the name or age? (yes/no)");
        String updateChoice = scanner.nextLine().trim().toLowerCase();
        if (updateChoice.equals("yes")) {
            updateStudentInfo(student, scanner);
        } else {
            System.out.println("No updates made.");
        }

        System.out.println("\nFinal Student Info:");
        System.out.println(student);

        System.out.println("\nTotal Person objects created: " + Person.getCount());

        System.out.println("\n--- Demonstrating Polymorphism (Person[] array) ---");
        Person[] people = new Person[4];
        people[0] = p1;
        people[1] = p2;
        people[2] = p3;
        people[3] = student;

        for (Person person : people) {
            person.introduce();
        }

        System.out.println("\n--- Demonstrating Polymorphism (Human[] array) ---");
        Human[] humans = new Human[4];
        humans[0] = p1;
        humans[1] = p2;
        humans[2] = p3;
        humans[3] = student;

        for (Human human : humans) {
            human.introduce();
            System.out.println("Role: " + human.getRole());
            System.out.println();
        }

        System.out.println("\n--- Demonstrating Interface: Identifiable ---");
        List<Identifiable> identifiables = new ArrayList<>();
        identifiables.add(student); 

        for (Identifiable identifiable : identifiables) {
            System.out.println("Unique ID: " + identifiable.getUniqueId());
        }


        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Umar", 22));
        personList.add(new Person("Ishaq", 21));
        personList.add(new Person("Fatima", 20));

        System.out.println("Do you want to add a new person? (yes/no)");
        String addPersonChoice = scanner.nextLine().trim().toLowerCase();
        if (addPersonChoice.equals("yes")) {
            String newName = getValidName(scanner);
            int newAge = getValidAge(scanner);
            scanner.nextLine();
            personList.add(new Person(newName, newAge));
        }

        System.out.println("Do you want to remove a person? (yes/no)");
        String removePersonChoice = scanner.nextLine().trim().toLowerCase();
        if (removePersonChoice.equals("yes")) {
            System.out.println("Enter the index of the person to remove (0 to " + (personList.size() - 1) + "):");
            if (scanner.hasNextInt()) {
                int index = scanner.nextInt();
                scanner.nextLine();
                if (index >= 0 && index < personList.size()) {
                    personList.remove(index);
                    System.out.println("Person removed successfully.");
                } else {
                    System.out.println("Invalid index. No person removed.");
                }
            } else {
                System.out.println("Invalid input. No person removed.");
                scanner.next(); 
            }
        }

        System.out.println("Do you want to search for a person by name? (yes/no)");
        String searchPersonChoice = scanner.nextLine().trim().toLowerCase();
        if (searchPersonChoice.equals("yes")) {
            System.out.print("Enter the name to search: ");
            String searchName = scanner.nextLine().trim();
            boolean found = false;

            for (Person person : personList) {
                if (person.getName().equalsIgnoreCase(searchName)) {
                    System.out.println("Found: " + person);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("No person found with the name: " + searchName);
            }
        }

        System.out.println("\nFinal Person List:");
        for (Person person : personList) {
            System.out.println(person);
        }

        scanner.close();
    }

    static String getValidName(Scanner scanner) {
        while (true) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine().trim();

            if (name.isEmpty()) {
                System.out.println("Name cannot be empty.");
            } else if (name.matches("\\d+")) {
                System.out.println("Name cannot be numeric.");
            } else {
                return name;
            }
        }
    }

    static int getValidAge(Scanner scanner) {
        while (true) {
            System.out.print("Enter age: ");
            if (scanner.hasNextInt()) {
                int age = scanner.nextInt();
                if (age < 0 || age > 150) {
                    System.out.println("Age must be between 0 and 150.");
                } else {
                    return age;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
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
            } else if (!studentId.matches("[a-zA-Z0-9]+")) {
                System.out.println("Student ID must be alphanumeric.");
            } else {
                return studentId;
            }
        }
    }

    static void updateStudentInfo(Student student, Scanner scanner) {
        System.out.println("What would you like to update? (name/age)");
        String choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("name")) {
            String newName = getValidName(scanner);
            student.updateInfo(newName);
        } else if (choice.equals("age")) {
            int newAge = getValidAge(scanner);
            student.updateInfo(newAge);
        } else {
            System.out.println("Invalid choice. No updates applied.");
        }
    }
}
