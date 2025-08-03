public abstract class Human {
    protected String name;
    protected int age;

    public Human(String name, int age) {
        setName(name);
        setAge(age);
    }

    public Human(String name) {
        this(name, 0);
    }

    public Human() {
        this("Unknown", -1);
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

    public abstract void introduce();

    public abstract String getRole();
}
