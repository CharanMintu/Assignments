package springtask;

public class Student {
    private String name;
    private int age;

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to print student details
    public void getdetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}
