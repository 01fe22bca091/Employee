import java.util.Date;
import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private Date dob;

    public Person(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public void displayAge() {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = dob.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        Period age = Period.between(birthDate, today);
        System.out.println("Age: " + age.getYears() + " years");
    }
}
