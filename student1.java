import java.util.Scanner;

public class student1 {
    private String name;
    private String department;
    private int semester;
    private int[] marks;

    public student1(String name, String department, int semester, int[] marks) {
        this.name = name;
        this.department = department;
        this.semester = semester;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Semester: " + semester);
        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
    }

    public double calculateGrade() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        double averageMarks = totalMarks / (double) marks.length;

        if (averageMarks >= 90) {
            return 4.0; // A+
        } else if (averageMarks >= 80) {
            return 3.5; // A
        } else if (averageMarks >= 70) {
            return 3.0; // B+
        } else if (averageMarks >= 60) {
            return 2.5; // B
        } else if (averageMarks >= 50) {
            return 2.0; // C+
        } else {
            return 1.5; // C
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter department: ");
            String department = scanner.nextLine();

            System.out.print("Enter semester: ");
            int semester = scanner.nextInt();

            int[] marks = new int[3]; // Assuming 3 subjects
            for (int i = 0; i < marks.length; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();
            }

            student1 student = new student1(name, department, semester, marks);
            student.displayDetails();

            double grade = student.calculateGrade();
            System.out.println("Grade: " + grade);
        }
    }
}

