public class Person {
    private String name;
    private int age;
    private static int personCount = 0;  // Static field to track instances

    // Constructor 1: name and age
    public Person(String name, int age) {
        setName(name);
        setAge(age);
        personCount++;
    }

    // Constructor 2: name only
    public Person(String name) {
        setName(name);
        setAge(0);
        personCount++;
    }

    // Constructor 3: no parameters
    public Person() {
        setName("Unknown");
        setAge(-1);
        personCount++;
    }

    public static int getCount() {
        return personCount;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "Unknown";
        } else {
            this.name = name.trim();
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void updateInfo(String name) {
        setName(name);
    }

    public void updateInfo(int age) {
        setAge(age);
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }
}
