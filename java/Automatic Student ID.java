class Student {
    private static int counter = 10; // Static counter
    private int studentId;
    private String name;

    public Student(String name) {
        this.name = name;
        this.studentId = ++counter; // Auto-generate ID
    }

    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Aayush");
        Student s2 = new Student("Raja");
        Student s3 = new Student("Ram");

        s1.displayDetails();
        System.out.println();

        s2.displayDetails();
        System.out.println();

        s3.displayDetails();
    }
}