package techM;
import java.util.*;

class Student {
    String name;
    int[] marks;
    int total;
    double average;

    // Constructor to initialize student details
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
        calculateTotalAndAverage();
    }

    // Method to calculate total and average marks
    private void calculateTotalAndAverage() {
        total = Arrays.stream(marks).sum(); // Sum all marks
        average = (double) total / marks.length; // Calculate average
    }

    @Override
    public String toString() {
        return name + " | Total: " + total + " | Average: " + String.format("%.2f", average);
    }
}

public class StudentSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        
        Student[] students = new Student[n];
        
        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = scanner.next();
            
            System.out.print("Enter number of subjects: ");
            int numSubjects = scanner.nextInt();
            int[] marks = new int[numSubjects];
            
            System.out.println("Enter marks for " + name + ": ");
            for (int j = 0; j < numSubjects; j++) {
                marks[j] = scanner.nextInt();
            }
            
            students[i] = new Student(name, marks);
        }
        
        // Sort students based on total marks (Descending Order)
        Arrays.sort(students, (s1, s2) -> Integer.compare(s2.total, s1.total));
        
        // Display sorted student details
        System.out.println("\nSorted List (Based on Total Marks):");
        for (Student s : students) {
            System.out.println(s);
        }
        
        scanner.close();
    }
}
