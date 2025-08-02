public class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        setStudentId(studentId);
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return super.toString() + "\nStudent ID: " + studentId;
    }

    @Override
    public void introduce() {
        System.out.println("Hello, I am " + getName() + ", " + getAge() + " years old, and my student ID is " + studentId + ".");
    }

}
