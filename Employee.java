import java.sql.Date;

public class Employee extends Person {
    private int empId;
    private double salary;

    public Employee(String name, Date dob, int empId, double salary) {
        super(name, dob);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayName();
        displayAge();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: $" + salary);
    }
}
