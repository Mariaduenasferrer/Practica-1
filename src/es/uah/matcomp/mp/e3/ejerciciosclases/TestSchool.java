package es.uah.matcomp.mp.e3.ejerciciosclases;

public class TestSchool {
    public static void main(String[] args) {
        School.Person person = new School.Person("John Doe", "123 Main St");
        School.Student student = new School.Student("Jane Doe", "456 College Ave", "Computer Science", 2, 15000.0);
        School.Staff staff = new School.Staff("Jim Beam", "789 School Rd", "Engineering", 50000.0);

        System.out.println(person);
        System.out.println(student);
        System.out.println(staff);
    }
}
