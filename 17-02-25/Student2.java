package springtask;

public class Student2 implements MainStudent {
    private int age;
    private String name;

    // Default constructor
    public Student2() {
        System.out.println("default");
    }

    // Constructor with parameters
    public Student2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // Method to display student details
    public void showdetails() {
        System.out.println("Age: " + age + ", Name: " + name);
    }
}
