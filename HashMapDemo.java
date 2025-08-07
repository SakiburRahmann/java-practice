import java.util.Scanner;
import java.util.HashMap;

public class HashMapDemo {

    // === Utility Methods ===

    private static String getValidName(Scanner scanner) {
        String name;
        while (true) {
            name = scanner.nextLine();
            if (!name.isEmpty() && !name.matches("\\d+")) {
                return name;
            }
            System.out.print("Invalid name. Please enter a valid name (not empty or numeric): ");
        }
    }

    private static int getValidAge(Scanner scanner) {
        int age;
        while (true) {
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                if (age >= 0 && age <= 150) {
                    scanner.nextLine(); 
                    return age;
                } else {
                    System.out.print("Invalid age. Please enter a valid age (0-150): ");
                }
            } else {
                System.out.print("Invalid input. Please enter a valid age (0-150): ");
                scanner.next();  
            }
        }
    }

    // === Main Program ===

    public static void main(String[] args) {
        HashMap<String, Integer> nameAgeMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Add name-age");
            System.out.println("2. Update age");
            System.out.println("3. Delete by name");
            System.out.println("4. Search age by name");
            System.out.println("5. Display all entries");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = getValidName(scanner);

                    if (nameAgeMap.containsKey(name)) {
                        System.out.println("Name already exists. Updating age.");
                    }

                    System.out.print("Enter age: ");
                    int age = getValidAge(scanner);
                    nameAgeMap.put(name, age);
                    System.out.println("Added: " + name + " with age " + age);
                    break;

                case 2:
                    System.out.print("Enter name to update age: ");
                    String updateName = getValidName(scanner);
                    if (nameAgeMap.containsKey(updateName)) {
                        System.out.print("Enter new age: ");
                        int newAge = getValidAge(scanner);
                        nameAgeMap.put(updateName, newAge);
                        System.out.println("Updated: " + updateName + " to age " + newAge);
                    } else {
                        System.out.println("Name not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter name to delete: ");
                    String deleteName = getValidName(scanner);
                    if (nameAgeMap.containsKey(deleteName)) {
                        nameAgeMap.remove(deleteName);
                        System.out.println("Deleted: " + deleteName);
                    } else {
                        System.out.println("Name not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter name to search age: ");
                    String searchName = getValidName(scanner);
                    if (nameAgeMap.containsKey(searchName)) {
                        System.out.println("Age of " + searchName + ": " + nameAgeMap.get(searchName));
                    } else {
                        System.out.println("Name not found.");
                    }
                    break;

                case 5:
                    System.out.println("All entries:");
                    for (String key : nameAgeMap.keySet()) {
                        System.out.println(key + ": " + nameAgeMap.get(key));
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
