public class Person {
    private String name;
    private int age;
    private static int personCount = 0;  // Static field to track instances

    public Person(String name, int age) {
        setName(name);
        setAge(age);
        personCount++;  // Increment count whenever a Person (or subclass) is instantiated
    }

    public static int getCount() {
        return personCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void updateInfo(String name) {
        this.name = name;
    }

    public void updateInfo(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }
}
