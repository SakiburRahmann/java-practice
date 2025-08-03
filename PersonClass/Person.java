public class Person extends Human {
    private static int personCount = 0;

    public Person(String name, int age) {
        super(name, age);
        personCount++;
    }

    public Person(String name) {
        super(name);
        personCount++;
    }

    public Person() {
        super();
        personCount++;
    }

    public static int getCount() {
        return personCount;
    }

    @Override
    public void introduce() {
        System.out.println("Hello, I am " + name + " and I am " + age + " years old.");
    }

    @Override
    public String getRole() {
        return "Person";
    }
}
