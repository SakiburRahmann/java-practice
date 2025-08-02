public class Person {
    private String name;
    private int age;
    private static int personCount = 0;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
        personCount++;
    }

    public Person(String name) {
        setName(name);
        setAge(0);
        personCount++;
    }

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

    public void introduce() {
        System.out.println("Hello, I am " + getName() + " and I am " + getAge() + " years old.");
    }

}
