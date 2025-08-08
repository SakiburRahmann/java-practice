import java.util.*;

public class IterateCollections {
    public static void main(String[] args) {
        
        // 1. List<String>
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("=== List Iteration ===");

        // Using enhanced for-loop
        System.out.println("Enhanced for-loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Using Iterator
        System.out.println("\nIterator:");
        Iterator<String> listIterator = fruits.iterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Using forEach with lambda
        System.out.println("\nforEach with lambda:");
        fruits.forEach(fruit -> System.out.println(fruit));


        // 2. HashMap<String, Integer>
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 28);

        System.out.println("\n=== HashMap Iteration ===");

        // Iterate over keys
        System.out.println("Keys:");
        for (String name : ages.keySet()) {
            System.out.println(name);
        }

        // Iterate over key-value pairs using entrySet()
        System.out.println("\nKey-Value pairs (entrySet):");
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Using forEach with lambda
        System.out.println("\nforEach with lambda:");
        ages.forEach((name, age) -> System.out.println(name + " is " + age + " years old"));
    }
}
