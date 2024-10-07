import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    private String Id;
    private String Name;
    private String Class;
    private String DateOfBirth;
    private Float GPA;

    public Student(String id, String name, String nameClass, String dateOfBirth, Float gpa) {

        // Format date
        DateTimeFormatter inputformatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dateOfBirth, inputformatter);
        String formattedDate = date.format(outputFormatter);

        this.Id = id;
        this.Name = name;
        this.Class = nameClass;
        this.DateOfBirth = formattedDate;
        this.GPA = gpa;
    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getNameClass() {
        return Class;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public String getGPA() {
        return String.format("%.2f", GPA);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String nameClass = sc.nextLine();
        String dateOfBirth = sc.nextLine();
        Float gpa = sc.nextFloat();
        Student student = new Student("B20DCCN001", name, nameClass, dateOfBirth, gpa);
        System.out.println(student.getId() + " " + student.getName() + " " + student.getNameClass() + " " + student.getDateOfBirth() + " " + student.getGPA());
        sc.close();
    }
}


