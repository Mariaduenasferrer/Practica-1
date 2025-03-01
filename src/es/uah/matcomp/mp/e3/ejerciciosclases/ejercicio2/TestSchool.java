package es.uah.matcomp.mp.e3.ejerciciosclases.ejercicio2;

public class TestSchool {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "123 Main St");
        Student student = new Student("Jane Doe", "456 College Ave", "Computer Science", 2, 15000.0);
        Staff staff = new Staff("Jim Beam", "789 School Rd", "Engineering", 50000.0);

        System.out.println(person);
        System.out.println(student);
        System.out.println(staff);
    }
}
